package com.company.Characters;

import com.company.AttackTypes.IsMelee;
import com.company.Behaviors.AttackBehavior;
import com.company.Behaviors.MovingBehavior;
import com.company.Behaviors.WeaponBehavior;
import com.company.Character;
import com.company.MovingTypes.CanTeleportate;
import com.company.WeaponTypes.UseHand;

public class Anti_Mage extends Character {

    public Anti_Mage(WeaponBehavior wb, AttackBehavior ab, MovingBehavior mb) {
        super(new UseHand(), new IsMelee(), new CanTeleportate());
    }

    @Override
    public void display() {
        System.out.println("I'm Anti-Mage");
    }
}
