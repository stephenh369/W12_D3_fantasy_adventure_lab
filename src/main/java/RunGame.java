import components.Companion;
import components.Spell;
import components.Weapon;
import players.Player;
import players.magic.Warlock;
import players.melee.Barbarian;
import rooms.EnemyRoom;
import rooms.Room;

import java.util.Scanner;

public class RunGame {

    public static void main(String[] args) throws InterruptedException {
//        GAME SETUP
        Game game = new Game();
        game.getRooms().add(new EnemyRoom
                ("Room 1",
                        new Warlock(50, 5,
                                new Companion("Bones", "Skeleton", 4),
                                new Spell("Frostbite", 5))));


//        CHOOSE CLASS
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Choose a class: ");
        String userChoice = inputScanner.nextLine();
        game.createPlayer(userChoice);


//        PLAYERS & ROOMS
        Player player1 = game.getPlayer(game.getPlayers().get(0));
        EnemyRoom room1 = game.getEnemyRoom(game.getRooms().get(0));


//        ENCOUNTER
        game.enemyEncounter(player1, room1);

    }
}
