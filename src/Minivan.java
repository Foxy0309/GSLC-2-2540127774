package gslc2;

class Minivan extends Vehicle {
	
    public Minivan(String brand, String model, int year) {
    	
        super(brand, model, year);
        
    }

    @Override
    public void display_info() {
    	
        System.out.println("Minivan Information:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        
    }
    
    @Override
    public void start() {
    	
    	System.out.println("Testing the vehicle.");
        System.out.println("Starting engines of the minivan.");
        
    }
    
    public void accelerate() {
    	
        System.out.println("Speeding up the minivan.");
        
    }

    @Override
    public void brake() {
    	
        System.out.println("Braking the minivan.");
        
    }
    
    @Override
    public void stop() {
    	
        System.out.println("Stopping the minivan.");
        
    }
    
}
