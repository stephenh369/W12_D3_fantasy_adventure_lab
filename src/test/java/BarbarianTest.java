import components.Treasure;
import components.TreasureValue;
import components.Weapon;
import org.junit.Before;
import org.junit.Test;
import players.melee.Barbarian;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;
    Weapon weapon;
    Weapon weapon2;
    Treasure treasure;

    @Before
    public void before() {
        weapon = new Weapon("Club", 4);
        weapon2 = new Weapon("Pointy Stick", 2);
        treasure = new Treasure("Ruby", TreasureValue.RARE);
        barbarian = new Barbarian(100, 9, weapon);
    }

    @Test
    public void canGetHealth() {
        assertEquals(100, barbarian.getHealth());
    }

    @Test
    public void canGetStrength() {
        assertEquals(9, barbarian.getStrength());
    }

    @Test
    public void canGetEquippedWeapon() {
        assertEquals(weapon, barbarian.getEquippedWeapon());
    }

    @Test
    public void canGetWeaponCount() {
        assertEquals(0, barbarian.getWeaponCount());
    }

    @Test
    public void canGetTreasureCount() {
        assertEquals(0, barbarian.getTreasureCount());
    }

    @Test
    public void canAddTreasure() {
        barbarian.addTreasure(treasure);
        assertEquals(1, barbarian.getTreasureCount());
    }

    @Test
    public void canRemoveTreasure() {
        barbarian.addTreasure(treasure);
        barbarian.removeTreasure(treasure);
        assertEquals(0, barbarian.getTreasureCount());
    }

    @Test
    public void canAddHealth() {
        barbarian.addHealth(10);
        assertEquals(110, barbarian.getHealth());
    }

    @Test
    public void canRemoveHealth() {
        barbarian.removeHealth(10);
        assertEquals(90, barbarian.getHealth());
    }

    @Test
    public void canAddWeapon() {
        barbarian.addWeapon(weapon2);
        assertEquals(1, barbarian.getWeaponCount());
    }

    @Test
    public void canRemoveWeapon() {
        barbarian.addWeapon(weapon2);
        barbarian.removeWeapon(weapon2);
        assertEquals(0, barbarian.getWeaponCount());
    }

    @Test
    public void canChangeEquippedWeapon() {
        barbarian.addWeapon(weapon2);
        barbarian.changeEquippedWeapon(weapon2);
        assertEquals(weapon2, barbarian.getEquippedWeapon());
        assertEquals(1, barbarian.getWeaponCount());
    }

    @Test
    public void canRage() {
        barbarian.removeHealth(90);
        barbarian.rage();
        assertEquals(29, barbarian.getStrength());
    }
}
