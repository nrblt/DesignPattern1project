package com.company.Characters;

import com.company.AttackTypes.IsRange;
import com.company.Behaviors.AttackBehavior;
import com.company.Behaviors.MovingBehavior;
import com.company.Behaviors.WeaponBehavior;
import com.company.Character;
import com.company.MovingTypes.CanWalk;
import com.company.WeaponTypes.UseHand;

public class CM extends Character {
    public CM(WeaponBehavior wb, AttackBehavior ab, MovingBehavior mb) {
        super(new UseHand(), new IsRange(), new CanWalk());
    }

    @Override
    public void display() {
        System.out.println("I did not choose Support life, Support life  chose me");
    }
}
