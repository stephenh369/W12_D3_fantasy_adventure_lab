package players.magic;

import components.Companion;
import components.Spell;

public class Wizard extends Magic{

    public Wizard(int health, int intellect, Companion companion, Spell equippedSpell) {
        super(health, intellect, companion, equippedSpell);
    }
}
