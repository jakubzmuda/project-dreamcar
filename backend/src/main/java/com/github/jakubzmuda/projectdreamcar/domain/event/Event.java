package com.github.jakubzmuda.projectdreamcar.domain.event;

import java.time.LocalDateTime;
import java.util.Objects;

public abstract class Event {
    private final EventId eventId;
    private final LocalDateTime createdAt;

    Event() {
        this.eventId = EventId.next();
        this.createdAt = LocalDateTime.now();
    }

    Event(EventId eventId, LocalDateTime createdAt) {
        this.eventId = eventId;
        this.createdAt = createdAt;
    }

    EventId eventId() {
        return eventId;
    }

    LocalDateTime createdAt() {
        return createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return Objects.equals(eventId, event.eventId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(eventId);
    }
}
