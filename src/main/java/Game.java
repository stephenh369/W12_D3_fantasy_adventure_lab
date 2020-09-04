import players.Player;
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
}
