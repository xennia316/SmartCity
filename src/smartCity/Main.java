package smartCity;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Hotel> registeredHotels = new ArrayList<>();

    public static void main (String[] args) throws IOException {

        System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        System.out.print("Welcome to Smart City\n");
        System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        Scanner read = new Scanner(System.in);

        do {
            System.out.println("\nSelect user type: ");
            System.out.println("1. Admin\n2. User \n3. Exit\n\n");


            int userChoice = read.nextInt();

            if(userChoice == 1) {
                System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
                System.out.print("Admin Mode\n");
                System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
                Admin.adminSubroutine(registeredHotels);
                System.out.println("\nRegistered Hotels are: \n");
                for(int n = 0; n < registeredHotels.size(); n++) {
                    System.out.println(n + 1 + ". " + registeredHotels.get(n).name);
                }
            } else if (userChoice == 2) {
                System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
                System.out.print("User Mode\n");
                System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
                User.userSubroutine();
            } else {
                break;
            }
        } while(true);
    }
}