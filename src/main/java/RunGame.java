import components.Companion;
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
                                new Companion("Bones", "Skeleton", 4))));


//        CHOOSE CLASS
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Choose a class: ");
        String userChoice = inputScanner.nextLine();
        game.createPlayer(userChoice);


        Player player1 = game.getPlayer(game.getPlayers().get(0));
        EnemyRoom room1 = game.getEnemyRoom(game.getRooms().get(0));


        System.out.println(room1.getName());
        Thread.sleep(1000);
        System.out.printf("You encounter a %s.", room1.getEnemy().getClass().getSimpleName());
        System.out.println("\n");
        Thread.sleep(1500);
        System.out.println("What do you do? \n 1. Attack \n 2. Use Class Ability \n 3. Get Stats \n 4. Get Enemy Stats");
    }
}
