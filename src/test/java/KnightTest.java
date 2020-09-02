import components.Treasure;
import components.TreasureValue;
import components.Weapon;
import org.junit.Before;
import org.junit.Test;
import players.melee.Knight;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    Weapon weapon;
    Treasure treasure;

    @Before
    public void before() {
        weapon = new Weapon("Sword", 5);
        treasure = new Treasure("Ruby", TreasureValue.RARE);
        knight = new Knight(100, 7, weapon);
    }

    @Test
    public void canGetHealth() {
        assertEquals(100, knight.getHealth());
    }

    @Test
    public void canGetStrength() {
        assertEquals(7, knight.getStrength());
    }

    @Test
    public void canGetEquippedWeapon() {
        assertEquals(weapon, knight.getEquippedWeapon());
    }

    @Test
    public void canGetWeaponCount() {
        assertEquals(0, knight.getWeaponCount());
    }

    @Test
    public void canGetTreasureCount() {
        assertEquals(0, knight.getTreasureCount());
    }

    @Test
    public void canAddTreasure() {
        knight.addTreasure(treasure);
        assertEquals(1, knight.getTreasureCount());
    }
}
