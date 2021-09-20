package com.company.MovingTypes;

import com.company.Behaviors.MovingBehavior;

public class CanTeleportate implements MovingBehavior {
    @Override
    public void move() {
        System.out.println("When you blink I will not be here");
    }
}
