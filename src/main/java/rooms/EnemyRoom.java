package rooms;

import players.Player;

import java.util.ArrayList;

public class EnemyRoom extends Room{

    private Player enemy;

    public EnemyRoom(String name, Player enemy) {
        super(name);
        this.enemy = enemy;
    }

    public Player getEnemy() {
        return enemy;
    }

//    public int getEnemyCount() {
//        return enemies.size();
//    }
}
