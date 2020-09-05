import components.Weapon;
import players.Player;
import players.melee.Barbarian;
import rooms.EnemyRoom;
import rooms.Room;

import java.util.ArrayList;
import java.util.Scanner;

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

    public Player getPlayer(Player player) {
        if (player instanceof Barbarian) { return getPlayerBarbarian(); }
        return null;
    }

    public Barbarian getPlayerBarbarian() {
        for (Player i : players) {
            if (i.getClass().getSimpleName().equals("Barbarian")) {
                return (Barbarian) i;
            }
        }
        return null;
    }

    public EnemyRoom getEnemyRoom (Room room) {
        return (EnemyRoom) room;
    }

    public void enemyEncounter(Player player, EnemyRoom room) throws InterruptedException {
        boolean encounter = true;
            System.out.println(room.getName());
            Thread.sleep(1000);
            System.out.printf("You encounter a %s.", room.getEnemy().getClass().getSimpleName());
            System.out.println("\n");
            Thread.sleep(1500);

        while (encounter) {
            Scanner inputScanner = new Scanner(System.in);
            System.out.println("What do you do? \n 1. Attack \n 2. Use Class Ability \n 3. Get Stats \n 4. Get Enemy Stats");
            String userChoice = inputScanner.nextLine();

            if (userChoice.equalsIgnoreCase("Attack") || userChoice.equals("1")) {
                player.attack(room.getEnemy());
                if (room.getEnemy().getHealth() <= 0) { encounter = false; }
            }
//
//        else if (userChoice.equalsIgnoreCase("Use Class Ability") || userChoice.equals("2")) {
//            player.getAbility();
//        }

            if (userChoice.equalsIgnoreCase("Get Stats") || userChoice.equals("3")) {
                System.out.printf("Your health: %s", player.getHealth());
                System.out.println("\n");

            } else if (userChoice.equalsIgnoreCase("Get Enemy Stats") || userChoice.equals("4")) {
                System.out.printf("Enemy health: %s", room.getEnemy().getHealth());
                System.out.println("\n");
            }
        }
    }
}
