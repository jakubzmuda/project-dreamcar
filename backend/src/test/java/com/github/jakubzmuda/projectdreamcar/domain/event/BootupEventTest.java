package com.github.jakubzmuda.projectdreamcar.domain.event;


import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class EventTest {

    @Test
    public void shouldHaveIdAndTimestamp() {
        BootupEvent event = new BootupEvent();

        assertThat(event.eventId().value()).matches("event-[A-Za-z0-9]{8}");
        assertThat(event.createdAt()).isBefore(LocalDateTime.now());
    }
}