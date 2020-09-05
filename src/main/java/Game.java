import components.Weapon;
import players.Player;
import players.melee.Barbarian;
import rooms.Room;

import java.util.ArrayList;

public class Game {
    private ArrayList<Room> rooms;
    private ArrayList<Player> players;

    public Game() {
        this.rooms = new ArrayList<Room>();
        this.players = new ArrayList<Player>();
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public void createPlayer(String input) {
        if (input.equalsIgnoreCase("Barbarian")) {
            players.add(new Barbarian(100, 9, new Weapon("Club", 5)));
        }
        System.out.printf("You have chosen %s", players.get(0).getClass().getSimpleName());
        System.out.println("\n");
    }
}
