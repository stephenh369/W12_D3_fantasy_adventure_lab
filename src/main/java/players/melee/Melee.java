package players.melee;

import components.Weapon;
import players.Player;

import java.util.ArrayList;

public abstract class Melee extends Player {
    private int strength;
    private Weapon equippedWeapon;
    private ArrayList<Weapon> weapons;

    public Melee(int health, int strength, Weapon equippedWeapon) {
        super(health);
        this.strength = strength;
        this.equippedWeapon = equippedWeapon;
        this.weapons = new ArrayList<Weapon>();
    }

    public Weapon getEquippedWeapon() {
        return equippedWeapon;
    }

    public int getStrength() {
        return strength;
    }

    public int getWeaponCount() {
        return weapons.size();
    }
}
