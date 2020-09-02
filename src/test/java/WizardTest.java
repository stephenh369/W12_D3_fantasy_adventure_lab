import components.Companion;
import components.Spell;
import components.Treasure;
import org.junit.Before;
import org.junit.Test;
import players.magic.Wizard;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Companion companion;
    Wizard wizard;
    Spell spell;
    Treasure treasure;

    @Before
    public void before() {
        companion = new Companion("Hoot", "Owl", 2);
        wizard = new Wizard(100, 9, companion);

    }

    @Test
    public void canGetHealth() {
        assertEquals(100, wizard.getHealth());
    }

    @Test
    public void canGetIntellect() {
        assertEquals(9, wizard.getIntellect());
    }

    @Test
    public void canGetCompanion() {
        assertEquals(companion, wizard.getCompanion());
    }
}
