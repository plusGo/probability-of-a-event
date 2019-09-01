package com.mhl;

import org.junit.Test;

public class EventTest {
    @Test
    public void should_happened_and_return_probability() {
        // given
        final Event event = () -> System.out.print("Hello World");

        // when
        final double happening = event.happening();

        // then
        System.out.println(happening);
    }
}
