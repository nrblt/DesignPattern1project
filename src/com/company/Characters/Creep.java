package com.company.Characters;

import com.company.AttackTypes.IsRange;
import com.company.Behaviors.AttackBehavior;
import com.company.Behaviors.MovingBehavior;
import com.company.Behaviors.WeaponBehavior;
import com.company.Character;
import com.company.MovingTypes.CanWalk;
import com.company.Weapons.UseStick;

public class Creep extends Character {
    public Creep() {
        super(new UseStick(), new IsRange(), new CanWalk());
    }

    @Override
    public void display() {
        System.out.println("I am Creep!");
    }
}
