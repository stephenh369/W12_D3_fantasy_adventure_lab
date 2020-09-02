import components.Treasure;
import components.TreasureValue;
import org.junit.Before;
import org.junit.Test;
import rooms.TreasureRoom;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TreasureRoomTest {

    TreasureRoom treasureRoom;
    Treasure treasure;
    ArrayList<Treasure> treasures;

    @Before
    public void before() {
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
}
