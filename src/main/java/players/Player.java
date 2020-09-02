package players;

import components.Treasure;

import java.util.ArrayList;

public abstract class Player {

    private int health;
    private ArrayList<Treasure> treasures;

    public Player(int health) {
        this.health = health;
        this.treasures = new ArrayList<Treasure>();
    }

    public int getHealth() {
        return health;
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
}
