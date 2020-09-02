package players.melee;

import components.Weapon;

public class Barbarian extends Melee{

    public Barbarian(int health, int strength, Weapon equippedWeapon) {
        super(health, strength, equippedWeapon);
    }

    public void rage() {
        if (getHealth() <= 10) {
            addStrength(20);
        }
    }
}
