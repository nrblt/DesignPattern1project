package com.company.AttackTypes;

import com.company.Behaviors.AttackBehavior;

public class IsRange implements AttackBehavior {
    @Override
    public void attack() {
        System.out.println("I can attack from range");
    }
}
