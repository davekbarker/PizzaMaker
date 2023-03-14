import java.util.Scanner;

public class Crust extends Main{

    public static void crust() throws InterruptedException {
        PrintScreens.crustMenu();
        Scanner scanner = new Scanner(System.in);
        int crustMenu = scanner.nextInt();
        switch (crustMenu) {
            case 1, 2, 3, 4, 5 -> {
                finalPizza.add(customCrust[crustMenu]);
//                    System.out.println(finalPizza);
                Sauce.sauce();
            }
            default -> Crust.crust();
        }
    }
}
