package com.company.Characters;

import com.company.AttackTypes.IsRange;
import com.company.Character;
import com.company.MovingTypes.CanWalk;
import com.company.WeaponTypes.UseStick;

public class Creep extends Character {
    public Creep() {
        super(new UseStick(), new IsRange(), new CanWalk());
    }

    @Override
    public void display() {
        System.out.println("I am Creep!");
    }
}
