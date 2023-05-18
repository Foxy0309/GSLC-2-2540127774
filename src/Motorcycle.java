package gslc2;

class Motorcycle extends Vehicle implements Driving {
	
    public Motorcycle(String brand, String model, int year) {
    	
        super(brand, model, year);
        
    }

    @Override
    public void display_info() {
    	
        System.out.println("Motorcycle Information:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        
    }

    @Override
    public void start() {
    	
    	System.out.println("Testing the vehicle.");
        System.out.println("Starting engines of the motorcycle.");
    }

    @Override
    public void accelerate() {
    	
        System.out.println("Speeding up the motorcycle.");
        
    }

    @Override
    public void brake() {
    	
        System.out.println("Braking the motorcycle.");
        
    }

    @Override
    public void stop() {
    	
        System.out.println("Stopping the motorcycle.");
        
    }
}