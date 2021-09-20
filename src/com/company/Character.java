package com.company;

import com.company.Behaviors.AttackBehavior;
import com.company.Behaviors.MovingBehavior;
import com.company.Behaviors.WeaponBehavior;

public abstract class Character {
    WeaponBehavior wb;
    AttackBehavior ab;
    MovingBehavior mb;

    public Character(WeaponBehavior wb,AttackBehavior ab,MovingBehavior mb){
        this.wb=wb;
        this.ab=ab;
        this.mb=mb;
    }

    public void useWeapon(){
        this.wb.useWeapon();
    }

    public void attack(){
        this.ab.attack();
    }

    public void move(){
        this.mb.move();
    }

    public abstract void display();
}
