import java.util.Scanner;

public class Toppings extends Main{

    public static void toppings() throws InterruptedException {

        PrintScreens.toppingsMenu();
        Scanner scanner = new Scanner(System.in);
        int toppingsMenu = scanner.nextInt();
        switch (toppingsMenu) {
            case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 -> {
                finalPizza.add(toppingMenu[toppingsMenu - 1]);
//                System.out.println(finalPizza);
                Ends.addToppings();
            }
            default -> Toppings.toppings();
        }
    }
}
