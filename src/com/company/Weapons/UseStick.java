package com.company.Weapons;

import com.company.Behaviors.WeaponBehavior;

public class UseStick implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("I am Mag and I use Magic Stick to attack");
    }
}
