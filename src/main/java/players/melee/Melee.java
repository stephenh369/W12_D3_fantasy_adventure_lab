package players.melee;

import behaviors.IAttack;
import components.Weapon;
import players.Player;

import java.util.ArrayList;

public abstract class Melee extends Player implements IAttack {
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

    public void addStrength(int amount) {
        strength += amount;
    }

    public int getWeaponCount() {
        return weapons.size();
    }

    public void addWeapon(Weapon weapon) {
        weapons.add(weapon);
    }

    public Weapon removeWeapon(Weapon weapon) {
        int index = weapons.indexOf(weapon);
        return weapons.remove(index);
    }

    public void changeEquippedWeapon(Weapon weapon) {
        Weapon newWeapon = removeWeapon(weapon);
        addWeapon(equippedWeapon);
        equippedWeapon = newWeapon;
    }
}
