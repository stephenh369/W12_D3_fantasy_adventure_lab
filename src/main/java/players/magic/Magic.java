package players.magic;

import behaviors.IAttack;
import components.Companion;
import components.Spell;
import components.Weapon;
import players.Player;

import java.util.ArrayList;

public abstract class Magic extends Player implements IAttack {

    private int intellect;
    private Companion companion;
    private Spell equippedSpell;
    private ArrayList<Spell> spells;

    public Magic(int health, int intellect, Companion companion, Spell equippedSpell) {
        super(health);
        this.intellect = intellect;
        this.companion = companion;
        this.equippedSpell = equippedSpell;
        this.spells = new ArrayList<Spell>();
    }

    public int getIntellect() {
        return intellect;
    }

    public Companion getCompanion() {
        return companion;
    }

    public Spell getEquippedSpell() {
        return equippedSpell;
    }

    public void setEquippedSpell(Spell equippedSpell) {
        this.equippedSpell = equippedSpell;
    }

    public int getSpellCount() {
        return spells.size();
    }

    public void addSpell(Spell spell) {
        spells.add(spell);
    }

    public Spell removeSpell(Spell spells) {
        int index = this.spells.indexOf(spells);
        return this.spells.remove(index);
    }
}
