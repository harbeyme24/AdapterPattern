package AdapterPattern;

import java.util.Scanner;

public class StandardPowerApplication {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        Laptop laptop = new Laptop();
        Refrigerator ref = new Refrigerator();
        SmartphoneCharger charger = new SmartphoneCharger();

        while (true) {
            System.out.println("Smart Electronic Devices Menu:");
            System.out.println("1. Charge Laptop");
            System.out.println("2. Start Refrigerator");
            System.out.println("3. Charge Smartphone");
            System.out.println("4. Exit");

            System.out.print("Select an option: ");
            int userChoice = getUserChoice(scanner);
            System.out.println();

            switch (userChoice) {
                case 1: 
                    PowerOutlet laptopOutlet = new LaptopAdapter(laptop);
                    laptopOutlet.plugIn();
                    break;

                case 2: 
                    PowerOutlet refrigeratorOutlet = new RefrigeratorAdapter(ref);
                    refrigeratorOutlet.plugIn();
                    break;

                case 3: 
                    PowerOutlet smartphoneChargerOutlet = new SmartphoneAdapter(charger);
                    smartphoneChargerOutlet.plugIn();
                    break;
                case 4: 
                    System.out.println("Terminate the program");
                    System.exit(0);
                    break;
                default: 
                    System.out.println("Invalid choice. Please select a valid option (1-4).");
                    break;
            }
        }
    }

    private static int getUserChoice(Scanner scanner) {
        while (true) {
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                if (choice >= 1 && choice <= 4) {
                    return choice;
                }
                System.out.print("Invalid input. Please enter a valid option (1-4): ");
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a valid option (1-4): ");
            }
        }
    }

}
