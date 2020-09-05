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

    public void attack(Player enemy) {
        if (enemy.getHealth() > 0) {
            if (this instanceof Melee) {
                int damageOutput = ((Melee) this).getStrength() + ((Melee) this).getEquippedWeapon().getDamage();
                enemy.removeHealth(damageOutput);
                System.out.printf("You inflict %s damage to the enemy.", damageOutput);
            } else if (this instanceof Magic){
                int damageOutput = ((Magic) this).getIntellect() + ((Magic) this).getEquippedSpell().getDamage();
                enemy.removeHealth(damageOutput);
                System.out.printf("You inflict %s damage to the enemy.", damageOutput);
            }
            System.out.println("\n");
            System.out.printf("Enemy health: %s", enemy.getHealth());
            System.out.println("\n");
        }
    }

    public void getAbility() {
        if (this instanceof Barbarian) {
            ((Barbarian) this).rage();
        }
    }
}
