import components.Treasure;
import components.TreasureValue;
import components.Weapon;
import org.junit.Before;
import org.junit.Test;
import players.Player;
import players.melee.Knight;
import rooms.TreasureRoom;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TreasureRoomTest {

    Weapon equippedWeapon2;
    Player player1;
    TreasureRoom treasureRoom;
    Treasure treasure;
    ArrayList<Treasure> treasures;

    @Before
    public void before() {
        equippedWeapon2 = new Weapon("Sword", 5);
        player1 = new Knight(100, 10, equippedWeapon2);
        treasure = new Treasure("Gold", TreasureValue.RARE);
        treasures = new ArrayList<Treasure>();
        treasures.add(treasure);
        treasureRoom = new TreasureRoom("Chamber Of Gold", treasures);
    }

    @Test
    public void canGetTreasureCount() {
        assertEquals(1, treasureRoom.getTreasureCount());
    }

    @Test
    public void canGetPlayerCount() {
        assertEquals(0, treasureRoom.getPlayerCount());
    }

    @Test
    public void canAddPlayer() {
        treasureRoom.addPlayer(player1);
        assertEquals(1, treasureRoom.getPlayerCount());
    }

    @Test
    public void canRemovePlayer() {
        treasureRoom.addPlayer(player1);
        treasureRoom.removePlayer(player1);
        assertEquals(0, treasureRoom.getPlayerCount());
    }
}
