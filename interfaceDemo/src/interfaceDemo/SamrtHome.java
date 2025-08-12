package interfaceDemo;
interface SmartDevice {
    void turnOn();
    void turnOff();
}

class Light implements SmartDevice {
    public void turnOn() {
        System.out.println("Light is ON.");
    }

    public void turnOff() {
        System.out.println("Light is OFF.");
    }
}

class Fan implements SmartDevice {
    public void turnOn() {
        System.out.println("Fan is spinning.");
    }

    public void turnOff() {
        System.out.println("Fan stopped.");
    }
}

 class SmartHome {
    public static void main(String[] args) {
        SmartDevice device1 = new Light();
        device1.turnOn();
        device1.turnOff();

        SmartDevice device2 = new Fan();
        device2.turnOn();
        device2.turnOff();
    }
}
