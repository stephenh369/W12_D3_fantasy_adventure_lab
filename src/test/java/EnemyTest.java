import components.Treasure;
import components.TreasureValue;
import components.Weapon;
import org.junit.Before;
import org.junit.Test;
import players.Player;
import players.melee.Dwarf;
import rooms.EnemyRoom;
import rooms.TreasureRoom;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class EnemyTest {

    Player enemy1;
    Weapon equippedWeapon;
    ArrayList<Player> enemies;
    EnemyRoom enemyRoom;

    @Before
    public void before() {
        equippedWeapon = new Weapon("Rusty Axe", 3);
        enemy1 = new Dwarf(100, 6, equippedWeapon);
        enemies = new ArrayList<Player>();
        enemies.add(enemy1);
        enemyRoom = new EnemyRoom("Dungeon", enemies);
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
        assertEquals(enemies, enemyRoom.getEnemies());
    }
}
