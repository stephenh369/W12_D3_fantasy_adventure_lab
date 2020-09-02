package players.melee;

import components.Weapon;

public class Knight extends Melee{

    public Knight(int health, int strength, Weapon equippedWeapon) {
        super(health, strength, equippedWeapon);
    }

    public void swearOath() {
        if (getHealth() <= 10) {
            addHealth(5);
            addStrength(10);
        }
    }
}
