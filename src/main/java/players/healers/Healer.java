package players.healers;

import components.HealingTool;
import components.Weapon;
import players.Player;

import java.util.ArrayList;

public abstract class Healer extends Player {

    private HealingTool equippedHealingTool;
    private ArrayList<HealingTool> tools;

    public Healer(int health, HealingTool equippedHealingTool) {
        super(health);
        this.equippedHealingTool = equippedHealingTool;
        this.tools = new ArrayList<HealingTool>();
    }

    public HealingTool getEquippedHealingTool() {
        return equippedHealingTool;
    }

    public int getToolCount() {
        return tools.size();
    }


    public void addHealingTool(HealingTool tool) {
        tools.add(tool);
    }

    public HealingTool removeHealingTool(HealingTool tool) {
        int index = tools.indexOf(tool);
        return tools.remove(index);
    }

    public void changeEquippedTool(HealingTool tool) {
        HealingTool newTool = removeHealingTool(tool);
        addHealingTool(equippedHealingTool);
        equippedHealingTool = newTool;
    }
}
