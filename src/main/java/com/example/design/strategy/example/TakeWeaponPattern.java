package com.example.design.strategy.example;

public class TakeWeaponPattern {

    public interface Weapon {

        void offensive();
    }

    public static class Sword implements Weapon {

        @Override
        public void offensive() {
            System.out.println("칼을 휘두른다.");
        }
    }

    public static class Shield implements Weapon {

        @Override
        public void offensive() {
            System.out.println("방패로 막는다");
        }
    }

    public static class Crossbow implements Weapon {

        @Override
        public void offensive() {
            System.out.println("방패로 밀친다.");
        }
    }

    public static class TakeWeaponStrategy {

        Weapon weapon;

        public void setWeapon(Weapon weapon) {
            this.weapon = weapon;
        }

        public void attack() {
            weapon.offensive();
        }
    }
}
