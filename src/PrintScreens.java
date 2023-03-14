public class PrintScreens extends Main{


    public static void mainMenu() throws InterruptedException {

        System.out.println("What kind of Pizza");
        System.out.println("would you like today?");
        System.out.println();
        Thread.sleep(500);
        System.out.println("1) Standard");
        Thread.sleep(500);
        System.out.println("2) Custom");
        Thread.sleep(500);
        System.out.println("3) See Specials");
    }

    public static void standardMenu() {
        System.out.println("Standard Pizza Menu");
        System.out.println("Your options are basic:");
        System.out.println();
        for(int i = 1; i < standardPizza.length; i++) {
            System.out.println(i +  ") " + standardPizza[i]);
        }
    }

    public static void standardMenuChoice(String standardMenu) {
        System.out.println("You chose a plain " + standardMenu + " pizza");
    }

    public static void specialsMenu() {
        System.out.println();
        System.out.println("Our special is we have Pizza");
    }

    public static void niceEnding() {
        System.out.println("Return to main menu?");
        System.out.println("Y = Yes");
        System.out.println("Q = Quit");
    }

    public static void welcome() throws InterruptedException {
        System.out.println("Oh, hello!");
        System.out.println();
        System.out.println("Let's order a Pizza!");
        System.out.println();
        Thread.sleep(1000);
    }

    public static void customWel() throws InterruptedException {
        System.out.println();
        System.out.println("Let's start with the type of crust");
        System.out.println();
        System.out.println();
        Thread.sleep(1000);
    }

    public static void crustMenu() {
        System.out.println("What kind of crust would you like?");
        System.out.println();
        for(int i = 1; i < customCrust.length; i++) {
            System.out.println(i +  ") " + customCrust[i]);
        }
    }

    public static void sauceMenu() {
        System.out.println("What kind of sauce would you like?");
        System.out.println();
        for(int i = 1; i < sauceMenu.length; i++) {
            System.out.println(i +  ") " + sauceMenu[i]);
        }
    }

    public static void toppingsMenu() {
        System.out.println("What kind of toppings would you like?");
        System.out.println();
        for(int i = 0; i < toppingMenu.length; i++) {
            System.out.println((i + 1) +  ") " + toppingMenu[i]);
        }
    }

    public static void addToppings() {
        System.out.println();
        System.out.println("Would you like to add more toppings?");
        System.out.println();
        System.out.println("Y = Yes");
        System.out.println("N = Nah");
    }

    public static void customPizza() {

    }
}
