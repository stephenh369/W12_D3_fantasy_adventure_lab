import components.Companion;
import components.Weapon;
import players.magic.Warlock;
import players.melee.Barbarian;
import rooms.EnemyRoom;
import rooms.Room;

import java.util.Scanner;

public class RunGame {

    public static void main(String[] args) {
        Game game = new Game();
        game.getRooms().add(new EnemyRoom
                ("Enemy 1",
                        new Warlock(50, 5,
                                new Companion("Bones", "Skeleton", 4))));

        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Choose a class");
        String userChoice = inputScanner.nextLine();
        if (userChoice.equalsIgnoreCase("Barbarian")) {
            game.getPlayers().add(new Barbarian(100, 9, new Weapon("Club", 5)));
        }
        System.out.println("You have chosen " + game.getPlayers().get(0).getClass().getSimpleName());

    }
}
