import components.HealingTool;
import components.Treasure;
import components.TreasureValue;
import org.junit.Before;
import org.junit.Test;
import players.healers.Cleric;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    HealingTool tool1;
    HealingTool tool2;
    Treasure treasure;
    Cleric cleric;

    @Before
    public void before() {
        tool1 = new HealingTool("Health Potion", 10);
        tool2 = new HealingTool("Greater Health Potion", 25);
        treasure = new Treasure("Ruby", TreasureValue.RARE);
        cleric = new Cleric(100, tool1);
    }

    @Test
    public void canGetHealth() {
        assertEquals(100, cleric.getHealth());
    }

    @Test
    public void canGetTreasureCount() {
        assertEquals(0, cleric.getTreasureCount());
    }

    @Test
    public void canAddHealth() {
        cleric.addHealth(10);
        assertEquals(110, cleric.getHealth());
    }

    @Test
    public void canRemoveHealth() {
        cleric.removeHealth(10);
        assertEquals(90, cleric.getHealth());
    }

    @Test
    public void canAddTreasure() {
        cleric.addTreasure(treasure);
        assertEquals(1, cleric.getTreasureCount());
    }

    @Test
    public void canRemoveTreasure() {
        cleric.addTreasure(treasure);
        cleric.removeTreasure(treasure);
        assertEquals(0, cleric.getTreasureCount());
    }

    @Test
    public void canGetEquippedTool() {
        assertEquals(tool1, cleric.getEquippedHealingTool());
    }

    @Test
    public void canGetToolCount() {
        assertEquals(0, cleric.getToolCount());
    }

    @Test
    public void canAddTool() {
        cleric.addHealingTool(tool2);
        assertEquals(1, cleric.getToolCount());
    }

    @Test
    public void canRemoveTool() {
        cleric.addHealingTool(tool2);
        cleric.removeHealingTool(tool2);
        assertEquals(0, cleric.getToolCount());
    }

    @Test
    public void canChangeEquippedTool() {
        cleric.addHealingTool(tool2);
        cleric.changeEquippedTool(tool2);
        assertEquals(tool2, cleric.getEquippedHealingTool());
        assertEquals(1, cleric.getToolCount());
    }
}
