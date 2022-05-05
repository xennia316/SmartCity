package smartCity;

import java.util.ArrayList;
import java.util.Scanner;

public class Admin extends User {
    static Hotel addHotel() {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter new hotel name: ");
        String name = read.nextLine();

        System.out.print("Enter new hotel town: ");
        String town = read.nextLine();

        System.out.print("Enter new hotel price: ");
        int evaluation = read.nextInt();

        System.out.print("Enter new hotel evaluation: ");
        double price = read.nextInt();
        read.close();

        return new Hotel(name, price, town, evaluation);

    }

    // subroutine
    public static void adminSubroutine(ArrayList<Hotel> hotels) {
        Scanner read = new Scanner(System.in);

        System.out.print("1. To Register a new hotel\n2. To go to user mode\n");

        int newChoice = read.nextInt();

        if (newChoice == 1) {
            System.out.println("How many hotels are to be added?: ");
            int n = read.nextInt();

            do {
                Hotel newHotel = Admin.addHotel();
                hotels.add(newHotel);
                n -= 1;
            } while (n > 0);

            read.close();
        }

        else if (newChoice == 2) {
            System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
            System.out.print("WELCOME TRUSTED USER\n");
            System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
            User.userSubroutine();
        }
    }
}
