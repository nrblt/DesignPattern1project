package com.company.MovingTypes;

import com.company.Behaviors.MovingBehavior;

public class CanWalk implements MovingBehavior {
    @Override
    public void move() {
        System.out.println("I am not lucky, I just can walk :((((((");
    }
}
