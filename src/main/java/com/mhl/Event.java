package com.mhl;

import static com.mhl.Action.merge;

public class Event {
    private Action action;
    private double probability;

    public Event(final double probability, final Action action) {
        this.probability = probability;
        this.action = action;
    }

    public Event(final Action action) {
        this.probability = Math.random();
        this.action = action;
    }

    public Event and(final Event eventTwo) {
        return new Event(probability * probability, merge(action, eventTwo.action));
    }

    public Event or(final Event anotherEvent) {
        return new Event(1 - (1 - probability) * (1 - anotherEvent.probability), merge(action, anotherEvent.action));
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public double getProbability() {
        return probability;
    }

    public void setProbability(double probability) {
        this.probability = probability;
    }
}
