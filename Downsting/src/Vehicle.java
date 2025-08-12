class Vehicle {
    void start() {
        System.out.println("Vehicle started.");
    }
}

class Bike extends Vehicle {
    void showMileage() {
        System.out.println("Bike mileage is 45 km/l.");
    }
}

 class VehicleSystem {
    public static void main(String[] args) {
        Vehicle v = new Bike();   // Upcasting
        v.start();

        // Downcasting to access child-specific method
        if (v instanceof Bike) {
            Bike b = (Bike) v;
            b.showMileage();  // Only available after downcasting
        }
    }
}
