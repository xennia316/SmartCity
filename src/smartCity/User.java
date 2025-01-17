package smartCity;

import java.util.Scanner;

public class User {
    static public void userSubroutine() {
        int choice;
        Scanner read = new Scanner(System.in);

        do {
            System.out
                    .print("Choices \n1. Search by evaluation.\n2. Search by town. \n3. Make recommendation \n4. Quit");
            choice = read.nextInt();

            if (choice == 1) {
                System.out.print("Enter evaluation to search: ");
                int evaluation = read.nextInt();

                for (int n = 0; n < Main.registeredHotels.size(); n++) {
                    if (Main.registeredHotels.get(n).evaluation >= evaluation) {
                        System.out.println("Available Hotels: \n");
                        System.out.println(n + 1 + ". " + Main.registeredHotels.get(n).name + "\n" + "Evaluation: "
                                + Main.registeredHotels.get(n).evaluation);
                    }
                }
            } else if (choice == 2) {
                read.nextLine();
                System.out.print("Enter town to search: ");
                String town = read.nextLine();
                int count = 0;
                for (int n = 0; n < Main.registeredHotels.size(); n++) {

                    if (Main.registeredHotels.get(n).town.equals(town)) {
                        count++;
                        System.out.println("Available Hotels include: \n");
                        System.out.println(n + 1 + ". " + Main.registeredHotels.get(n).name + "\n" + "Town: "
                                + Main.registeredHotels.get(n).town);
                    }
                }
                if (count == 0) {
                    System.out.println("\nNo results found\n");
                }
            } else if (choice == 3) {
                for (int n = 0; n < Main.registeredHotels.size(); n++) {
                    System.out.println(n + 1 + ". " + Main.registeredHotels.get(n).name);
                }
                System.out.print("Enter your recommendation: ");
                String name = read.nextLine();
                for (int n = 0; n < Main.registeredHotels.size(); n++) {
                    if (Main.registeredHotels.get(n).name.equals(name))
                        Main.registeredHotels.get(n);
                }
            } else if (choice == 4) {
                break;
            }
        } while (true);
        // read.close();
    }
}
