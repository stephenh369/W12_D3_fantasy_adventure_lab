import components.Companion;
import components.Weapon;
import players.magic.Warlock;
import players.melee.Barbarian;
import rooms.EnemyRoom;
import rooms.Room;

import java.util.Scanner;

public class RunGame {

    public static void main(String[] args) throws InterruptedException {
        Game game = new Game();
        game.getRooms().add(new EnemyRoom
                ("Room 1",
                        new Warlock(50, 5,
                                new Companion("Bones", "Skeleton", 4))));

        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Choose a class: ");
        String userChoice = inputScanner.nextLine();
        if (userChoice.equalsIgnoreCase("Barbarian")) {
            game.getPlayers().add(new Barbarian(100, 9, new Weapon("Club", 5)));
        }
        System.out.printf("You have chosen %s", game.getPlayers().get(0).getClass().getSimpleName());
        System.out.println("\n");

        Barbarian player = (Barbarian) game.getPlayers().get(0);
        EnemyRoom room1 = (EnemyRoom) game.getRooms().get(0);

        System.out.println(game.getRooms().get(0).getName());
        Thread.sleep(1000);
        System.out.printf("You encounter a %s.", room1.getEnemy().getClass().getSimpleName());
        System.out.println("\n");
        Thread.sleep(1500);
        System.out.println("What do you do? \n 1. Attack");
    }
}
