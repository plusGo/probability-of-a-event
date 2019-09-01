package com.mhl;

public interface Action {
    public static Action merge(final Action actionOne, final Action actionTwo) {
        return () -> {
            actionOne.define();
            actionTwo.define();
        };
    }

    void define();

    default void doing() {
        System.out.print("Action is doing:");
        this.define();
    }

}
