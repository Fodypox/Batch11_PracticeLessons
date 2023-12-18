package FridayProjects.Week1.CoffeeMachine;
import java.util.Locale;
import java.util.Scanner;
public class CoffeeMachine {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // TODO 1st Conditional Section
            System.out.println("Which coffee would you like?");
            System.out.println("1. Turkish Coffee");
            System.out.println("2. Filter Coffee");
            System.out.println("3. Espresso");

            String chosenCoffee;
            while (true) {
                chosenCoffee = scanner.nextLine().toLowerCase(Locale.ROOT);
                if (chosenCoffee.equals("turkish coffee")) {
                    System.out.println("Preparing Turkish coffee...");
                    break;
                } else if (chosenCoffee.equals("filter coffee")) {
                    System.out.println("Preparing Filter coffee...");
                    break;
                } else if (chosenCoffee.equals("espresso")) {
                    System.out.println("Preparing Espresso...");
                    break;
                } else {
                    System.out.println("Incorrect keystroke. Please try again.");
                }
            }

            // TODO 2nd Conditional Section
            System.out.println("Would you like us to add milk? (Answer with Yes or No):");
            String addMilk;
            while (true) {
                addMilk = scanner.nextLine().toLowerCase(Locale.ROOT);
                if (addMilk.equals("yes")) {
                    System.out.println("Milk is being added...");
                    break;
                } else if (addMilk.equals("no")) {
                    System.out.println("No milk is being added.");
                    break;
                } else {
                    System.out.println("Incorrect keystroke. Please try again.");
                }
            }

            // TODO 3rd Conditional Section
            System.out.println("Do you want sugar? (Answer with Yes or No):");
            String dummyCode = scanner.nextLine(); // Adding dummy code for transition from int to String
            String addSugar;
            while (true) {
                addSugar = scanner.nextLine().toLowerCase(Locale.ROOT);
                if (addSugar.equals("yes")) {
                    System.out.println("How much sugar do you want?");
                    int amountOfSugar = scanner.nextInt();
                    System.out.println("Adding " + amountOfSugar + " sugars.");
                    break;
                } else if (addSugar.equals("no")) {
                    System.out.println("No sugar is being added.");
                    break;
                } else {
                    System.out.println("Incorrect keystroke. Please try again.");
                }
            }

            // TODO 4th Conditional Section
            System.out.println("What size would you like? (Enter as Large, Medium, or Small.):");
            String size;
            while (true) {
                size = scanner.next().toLowerCase(Locale.ROOT);
                if (size.equals("large")) {
                    System.out.println("Your coffee is being prepared in a Large size.");
                    break;
                } else if (size.equals("medium")) {
                    System.out.println("Your coffee is being prepared in a Medium size.");
                    break;
                } else if (size.equals("small")) {
                    System.out.println("Your coffee is being prepared in a Small size.");
                    break;
                } else {
                    System.out.println("Incorrect keystroke. Please try again.");
                }
            }

            // TODO RESULT SECTION
            System.out.println(chosenCoffee + " in a " + size + " size is ready. Enjoy your meal!");

            // Close the scanner
            scanner.close();
        }
    }



