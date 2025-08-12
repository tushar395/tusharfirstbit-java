
interface Demovehicle {
    void brake();
    void start();
    void stop();    
}

class Car implements Demovehicle {
    public void brake() {
        System.out.println("Car Braking");
    }

    public void start() {
        System.out.println("Car Starting");
    }

    public void stop() {
        System.out.println("Car Stopping");
    }
}

class Tushar implements Demovehicle {
    public void brake() {
        System.out.println("Tushar Braking");
    }

    public void start() {
        System.out.println("Tushar Starting");
    }

    public void stop() {
        System.out.println("Tushar Stopping");
    }
}

 class Polyvehicle {
    public static void main(String[] args) {
        Demovehicle v1 = new Car();
        Demovehicle v2 = new Tushar();

        v1.brake();
        v1.start();
        v1.stop();

        System.out.println("----------------------------");

        v2.brake();
        v2.start();
        v2.stop();
    }
}
