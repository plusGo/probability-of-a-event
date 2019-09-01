package com.mhl;

import org.junit.Assert;
import org.junit.Test;

public class EventTest {
    @Test
    public void should_return_full_probability() {
        // given
        final Event event = new Event(1, () -> System.out.print("地球在自转"));

        // when
        final double probability = event.getProbability();

        // then
        Assert.assertEquals(1, probability, 0);
    }

    @Test
    public void should_return_uncertain_probability() {
        // given
        final Event event = new Event(() -> System.out.print("我能捡到钱"));

        // when
        final double probability = event.getProbability();

        // then
        System.out.println(probability);
    }

    @Test
    public void should_return_half_probability() {
        // given
        final Event coinUp = new Event(0.5, () -> System.out.println("抛硬币，头向上"));

        // when
        final double happening = coinUp.getProbability();

        // then
        Assert.assertEquals(0.5, happening, 0);
        System.out.println(happening);
    }

    @Test
    public void should_return_0_25_half_probability() {
        // given
        final Event coinUp = new Event(0.5, () -> System.out.println("抛硬币，头向上"));

        // when
        final double probabilityOfHappening = coinUp.and(coinUp).getProbability();

        // then
        Assert.assertEquals(0.25, probabilityOfHappening, 0);
    }

    @Test
    public void should_return_0_75_half_probability() {
        // given
        final Event coinUp = new Event(0.5, () -> System.out.println("抛硬币，头向上"));

        // when
        final double probabilityOfHappening = coinUp.or(coinUp).getProbability();

        // then
        Assert.assertEquals(0.75, probabilityOfHappening, 0);
    }


}
