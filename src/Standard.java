import java.util.Scanner;

public class Standard extends Main {

        static void standard() throws InterruptedException {
            Scanner scanner = new Scanner(System.in);
            PrintScreens.standardMenu();
            int standMenu = scanner.nextInt();
            System.out.println();

            switch (standMenu) {
                case 1, 2, 3, 4 -> {
                    PrintScreens.standardMenuChoice(standardPizza[standMenu]);
                    System.out.println();
                    Ends.ends();
                }
                default -> Standard.standard();
            }
        }
}
