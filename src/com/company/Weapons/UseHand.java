package com.company.Weapons;

import com.company.Behaviors.WeaponBehavior;

public class UseHand implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("I use only my hands");
    }
}
