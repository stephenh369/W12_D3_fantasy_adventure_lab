package players;

import components.Treasure;
import players.magic.Magic;
import players.melee.Barbarian;
import players.melee.Melee;

import java.util.ArrayList;

public abstract class Player {

    private int health;
    private ArrayList<Treasure> treasures;

    public Player(int health) {
        this.health = health;
        this.treasures = new ArrayList<Treasure>();
    }

    public int getHealth() {
        if (health < 0) {
            return 0;
        }
        return health;
    }

    public int getDamage() {
        if (this instanceof Melee) {
            int damageOutput = ((Melee) this).getStrength() + ((Melee) this).getEquippedWeapon().getDamage();
            return damageOutput;
        }
        if (this instanceof Magic) {
            int damageOutput = ((Magic) this).getIntellect() + ((Magic) this).getEquippedSpell().getDamage();
            return damageOutput;
        }

        return 0;
    }

    public int getTreasureCount() {
        return treasures.size();
    }

    public void addTreasure(Treasure treasure) {
        treasures.add(treasure);
    }

    public Treasure removeTreasure(Treasure treasure) {
        int index = treasures.indexOf(treasure);
        return treasures.remove(index);
    }

    public void addHealth(int amount) {
        health += amount;
    }

    public void removeHealth(int amount) {
        health -= amount;
    }

    public void attack(Player player) {
        if (player.getHealth() > 0) {
            if (this instanceof Melee) {
                int damageOutput = ((Melee) this).getStrength() + ((Melee) this).getEquippedWeapon().getDamage();
                player.removeHealth(damageOutput);
                System.out.printf("%s inflicts %s damage to %s.",this.getClass().getSimpleName(), damageOutput, player.getClass().getSimpleName());
            } else if (this instanceof Magic){
                int damageOutput = ((Magic) this).getIntellect() + ((Magic) this).getEquippedSpell().getDamage();
                player.removeHealth(damageOutput);
                System.out.printf("%s inflicts %s damage to %s.",this.getClass().getSimpleName(), damageOutput, player.getClass().getSimpleName());
            }
            System.out.println("\n");
            System.out.printf("%s health: %s", player.getClass().getSimpleName(), player.getHealth());
            System.out.println("\n");
        }
    }

    public void getAbility() {
        if (this instanceof Barbarian) {
            ((Barbarian) this).rage();
        }
    }
}
