import components.HealingTool;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HealingToolTest {

    HealingTool healingTool;

    @Before
    public void before() {
        healingTool = new HealingTool("Healing Potion", 10);
    }

    @Test
    public void canGetName() {
        assertEquals("Healing Potion", healingTool.getName());
    }

    @Test
    public void canGetHealingPoints() {
        assertEquals(10, healingTool.getHealingPoints());
    }
}
