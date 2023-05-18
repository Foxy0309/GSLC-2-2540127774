package gslc2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
        List<Vehicle> vehicles = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Vehicle Testing and Management");
            System.out.println("1. Add a Car");
            System.out.println("2. Add a Motorcycle");
            System.out.println("3. Add a Minivan");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();
            scan.nextLine();

        switch (choice) {
        
            case 1:
                System.out.print("Enter the brand of the car: ");
                String cbrand = scan.nextLine();
                
                System.out.print("Enter the model of the car: ");
                String cmodel = scan.nextLine();
                
                System.out.print("Enter the year of the car: ");
                int cyear = scan.nextInt();
                scan.nextLine();

                Car car = new Car(cbrand, cmodel, cyear);
                vehicles.add(car);
                
                System.out.println("Car added successfully!");
                break;
                
            case 2:
            	
                System.out.print("Enter the brand of the motorcycle: ");
                String mbrand = scan.nextLine();
                
                System.out.print("Enter the model of the motorcycle: ");
                String mmodel = scan.nextLine();
                
                System.out.print("Enter the year of the motorcycle: ");
                int myear = scan.nextInt();
                scan.nextLine();
                
                Motorcycle motorcycle = new Motorcycle(mbrand, mmodel, myear);
                vehicles.add(motorcycle);
                
                System.out.println("Motorcycle added successfully!");
                
                break;
               
            case 3:
                System.out.print("Enter the brand of the minivan: ");
                String minivanBrand = scan.nextLine();
                
                System.out.print("Enter the model of the minivan: ");
                String minivanModel = scan.nextLine();
                
                System.out.print("Enter the year of the minivan: ");
                int minivanYear = scan.nextInt();
                scan.nextLine();
                
                Minivan minivan = new Minivan(minivanBrand, minivanModel, minivanYear);
                vehicles.add(minivan);
                
                System.out.println("Minivan added successfully!");
                
                break;
                
            case 4:
                System.out.println("Exiting...");
                break;
                
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
                
        }

        System.out.println();
        
    } while (choice != 4);

        System.out.println("Beginning Testing:");
        System.out.println();
    
        for (Vehicle vehicle : vehicles) {
    	
        	vehicle.display_info();
        	vehicle.start();
            vehicle.accelerate();
            vehicle.brake();
            vehicle.stop();
            
        	System.out.println("Test Successful.");
        	System.out.println();
        	
        }
        
        System.out.println("Have a good day.");
    
	}
	
}