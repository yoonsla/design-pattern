package com.example.design.strategy.weapon;

public class TakeWeapon {

    public static final int SWORD = 0;
    public static final int SHIELD = 1;
    public static final int CROSSBOW = 2;

    private int state;

    public void setWeapon(int state) {
        this.state = state;
    }

    public void attack() {
        if (state == SWORD) {
            System.out.println("칼을 휘두른다.");
        } else if (state == SHIELD) {
            System.out.println("방패로 막는다");
        } else if (state == CROSSBOW){
            System.out.println("방패로 밀친다.");
        }
    }
}
