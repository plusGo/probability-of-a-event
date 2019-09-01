package com.mhl;


import org.junit.Test;

public class ActionTest {
    @Test
    public void should_new_action() {
        // given

        // when
        final Action helloWorld = () -> System.out.println("hello world");

        // then
        helloWorld.doing();
    }
}
