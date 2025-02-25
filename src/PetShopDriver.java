import java.util.ArrayList;
import java.util.Scanner;

public class PetShopDriver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<>();

        while (true) {
            System.out.println("Enter details for a new animal sale.");

            String type;
            do {
                System.out.println("Enter the type of animal: ");
                type = scan.nextLine();
                if (type.length() < 3) {
                    System.out.println("Type must be at least 3 characters!");
                }
            } while (type.length() < 3);

            char gender;
            do {
                System.out.println("Enter the gender: ");
                gender = scan.next().toLowerCase().charAt(0);
                if (gender != 'm' && gender != 'f') {
                    System.out.println("Gender must be either 'm' or 'f'!");
                }
            } while (gender != 'm' && gender != 'f');

            int age;
            do {
                System.out.println("Enter the age in months: ");
                if (!scan.hasNextInt()) {
                    System.out.println("Age must be a positive integer!");
                }
                age = scan.nextInt();
                if (age <= 0) {
                    System.out.println("Age must be a positive integer!");
                }
            } while (age <= 0);

            double price;
            do {
                System.out.println("Enter the selling price: ");
                if (!scan.hasNextDouble()) {
                    System.out.println("Selling price must be a positive number!");
                }
                price = scan.nextDouble();
                if (price <= 0) {
                    System.out.println("Selling price must be a positive number!");
                }
            } while (price <= 0);

            scan.nextLine();
            Animal newAnimal = new Animal(type, gender, age, price);

            animals.add(newAnimal);
            System.out.println(newAnimal);

            char contineInput;
            do {
                System.out.println("\n Would you like to record another sale? (y/n)");
                contineInput = scan.next().charAt(0);
                if (contineInput != 'y' && contineInput != 'n') {
                    System.out.println("Error: please enter 'y' or 'n'!");
                }
            } while (contineInput != 'y' && contineInput != 'n');

            if (contineInput == 'n') {
                break;
            }

            scan.nextLine();
        }

        System.out.println("\n--- Sales Summary ---");
        System.out.println("Total animals sold: " + Animal.getTotalSold());
        System.out.println("Total cats sold: " + Animal.getTotalCatsSold());
        System.out.println("Total income: $" + Animal.getTotalIncome());
        System.out.printf("Average selling price: $%.2f%n", Animal.getAverageSold());

        scan.close();
    }
}