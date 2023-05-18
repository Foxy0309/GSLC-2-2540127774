package gslc2;

abstract class Vehicle implements Driving {
	
    String brand;
    String model;
    int year;

    public Vehicle(String brand, String model, int year) {
    	
        this.brand = brand;
        this.model = model;
        this.year = year;
        
    }

    public abstract void display_info();
    
}