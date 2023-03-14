import java.util.ArrayList;
import java.util.Scanner;

//Created by Dave Barker
//Simple "piza making" program that I tried to keep as small and clean as possible

public class Main {

    static String[] customCrust = {"N/A", "Regular", "Garlic", "Cheese", "Stuffed", "Taco"};
    static String[] standardPizza = {"N/A", "Cheese", "Pepperoni", "Buffalo Chicken", "Margarita"};
    static String[] sauceMenu = {"N/A", "Marinara", "White Sauce", "Buffalo Sauce", "BBQ Sauce"};
    static String[] toppingMenu = {"Pepperoni", "Mushroom", "Extra Cheese", "Onion", "Black Olives", "Green Pepper", "Garlic", "Pineapple", "Jalapenos", "Tomatoes", "Spinach"};
    static ArrayList<String> finalPizza = new ArrayList<String>();


    public static void main(String[] args) throws InterruptedException {

        PrintScreens.welcome();
        Main.makePizza();

    }

        public static void makePizza() throws InterruptedException {
            PrintScreens.mainMenu();
            Scanner scanner = new Scanner(System.in);
            int menu = scanner.nextInt();
            switch (menu) {
                case 1 -> {
                    Standard.standard();
                }
                case 2 -> {
                    Custom.custom();
                }
                case 3 -> {
                    Specials.specials();
                }
                default -> Main.makePizza();
            }
        }
}