import components.Treasure;
import components.TreasureValue;
import components.Weapon;
import org.junit.Before;
import org.junit.Test;
import players.Player;
import players.melee.Dwarf;
import players.melee.Knight;
import rooms.EnemyRoom;
import rooms.TreasureRoom;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class EnemyTest {

    Player enemy1;
    Player player1;
    Weapon equippedWeapon1;
    Weapon equippedWeapon2;
    ArrayList<Player> enemies;
    EnemyRoom enemyRoom;

    @Before
    public void before() {
        equippedWeapon1 = new Weapon("Rusty Axe", 3);
        equippedWeapon2 = new Weapon("Sword", 5);
        enemy1 = new Dwarf(100, 6, equippedWeapon1);
        player1 = new Knight(100, 10, equippedWeapon2);
        enemies = new ArrayList<Player>();
        enemies.add(enemy1);
        enemyRoom = new EnemyRoom("Dungeon", enemy1);
    }

    @Test
    public void canGetName() {
        assertEquals("Dungeon", enemyRoom.getName());
    }

    @Test
    public void canGetPlayerCount() {
        assertEquals(0, enemyRoom.getPlayerCount());
    }

    @Test
    public void canGetEnemies() {
        assertEquals(enemies, enemyRoom.getEnemy());
    }

    @Test
    public void canAddPlayer() {
        enemyRoom.addPlayer(player1);
        assertEquals(1, enemyRoom.getPlayerCount());
    }

    @Test
    public void canRemovePlayer() {
        enemyRoom.addPlayer(player1);
        enemyRoom.removePlayer(player1);
        assertEquals(0, enemyRoom.getPlayerCount());
    }
}
