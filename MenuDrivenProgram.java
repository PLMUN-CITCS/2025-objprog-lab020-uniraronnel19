import java.util.Scanner;

public class MenuDrivenProgram {

    public static void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Greet User");
        System.out.println("2. Check Even/Odd");
        System.out.println("3. Exit");
        System.out.print("Enter your choice (1-3): ");
    }

    public static void handleMenuChoice(int choice) {
        switch (choice) {
            case 1:
                greetUser();
                break;
            case 2:
                checkEvenOrOdd();
                break;
            case 3:
                System.out.println("Exiting program. Goodbye!");
                System.exit(0);  
                break;
            default:
                System.out.println("Invalid choice! Please try again.");
        }
    }

    public static void greetUser() {
        System.out.println("Hello! Welcome!");
    }

    public static void checkEvenOrOdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        while (!scanner.hasNextInt()) {
            System.out.println("That's not a valid integer! Please try again.");
            scanner.next(); 
            System.out.print("Please enter an integer: ");
        }
        int number = scanner.nextInt();
        
        if (number % 2 == 0) {
            System.out.println(number + " is an Even number.");
        } else {
            System.out.println(number + " is an Odd number.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            displayMenu();  
            int choice = scanner.nextInt();  
            handleMenuChoice(choice); 
        }
    }
}
