import java.util.Scanner;

public class Sauce extends Main {

    public static void sauce() throws InterruptedException {

        PrintScreens.sauceMenu();
        Scanner scanner = new Scanner(System.in);
        int saucesMenu = scanner.nextInt();
        switch (saucesMenu) {
            case 1, 2, 3, 4 -> {
//                PrintScreens.standardMenuChoice(sauceMenu[saucesMenu]);
                finalPizza.add(sauceMenu[saucesMenu]);
//                System.out.println(finalPizza);
                Toppings.toppings();
            }
            default -> Sauce.sauce();
        }
    }
}
