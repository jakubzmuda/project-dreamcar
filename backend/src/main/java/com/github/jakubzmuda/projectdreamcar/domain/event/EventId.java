package com.github.jakubzmuda.projectdreamcar.domain.event;

import com.github.jakubzmuda.projectdreamcar.core.IdGenerator;

public class EventId {
    private final String value;

    private EventId(String value) {
        this.value = value;
    }

    public static EventId next() {
        return new EventId("event-" + IdGenerator.next());
    }

    public static EventId of(String value) {
        return new EventId(value);
    }

    String value() {
        return value;
    }
}
