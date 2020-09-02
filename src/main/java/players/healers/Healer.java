package players.healers;

import components.HealingTool;
import players.Player;

import java.util.ArrayList;

public abstract class Healer extends Player {

    private HealingTool healingTool;
    private ArrayList<HealingTool> tools;

    public Healer(int health, HealingTool healingTool) {
        super(health);
        this.healingTool = healingTool;
        this.tools = new ArrayList<HealingTool>();
    }

    public HealingTool getHealingTool() {
        return healingTool;
    }

    public int getToolCount() {
        return tools.size();
    }
}
