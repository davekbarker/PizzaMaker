import java.util.ArrayList;
import java.util.Scanner;

public class Ends extends Main {

    public static void ends() throws InterruptedException {
        PrintScreens.niceEnding();
        Scanner scanner = new Scanner(System.in);
        String ends = scanner.next();
        switch (ends.toLowerCase()) {
            case "q": {
                break;
            }
            case "y": {
                Main.makePizza();
                break;
            }
            default: {
                Ends.ends();
                break;
            }
        }
    }

    public static void addToppings() throws InterruptedException {
        PrintScreens.addToppings();
        Scanner scanner = new Scanner(System.in);
        String addMore = scanner.next();
        switch (addMore.toLowerCase()) {
            case "y" -> {
                Toppings.toppings();
            }
            case "n" -> {
                Ends.noMoreToppings(finalPizza);
            }
            default -> {
                Ends.ends();
            }
        }
    }

    public static void noMoreToppings(ArrayList<String> Pizza) throws InterruptedException {
//        int l = Pizza.size();
//        System.out.println(Pizza);
        System.out.println();
        System.out.println("The Pizza you want to order contains:");
        System.out.println();
        System.out.println("Crust = " + Pizza.get(0));
        System.out.println("Sauce = " + Pizza.get(1));
            for(int i = 2; i < Pizza.size(); i++) {
                 System.out.println("Toppings = " + Pizza.get(i));
            }
        System.out.println();

        Ends.ends();
    }
}