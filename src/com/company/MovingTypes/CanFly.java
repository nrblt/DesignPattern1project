package com.company.MovingTypes;

import com.company.Behaviors.MovingBehavior;

public class CanFly  implements MovingBehavior {
    @Override
    public void move() {
        System.out.println("Ha-Ha I can fly!");
    }
}
