package com.company.AttackTypes;

import com.company.Behaviors.AttackBehavior;

public class IsMelee implements AttackBehavior {
    @Override
    public void attack() {
        System.out.println("I am boxer");
    }
}
