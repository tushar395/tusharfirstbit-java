import java.util.*;

// Abstract base device class
abstract class SmartDevice {
    private final String name;
    private boolean isOn = false;
    private long totalOnTime = 0;
    private long lastOnTimestamp = 0;

    public SmartDevice(String name) {
        this.name = name;
    }

    public void powerOn() {
        if (!isOn) {
            isOn = true;
            lastOnTimestamp = System.currentTimeMillis();
            System.out.println("[✓] " + name + " is now ON.");
        } else {
            System.out.println("[!] " + name + " is already ON.");
        }
    }

    public void powerOff() {
        if (isOn) {
            totalOnTime += System.currentTimeMillis() - lastOnTimestamp;
            isOn = false;
            System.out.println("[✓] " + name + " is now OFF.");
        } else {
            System.out.println("[!] " + name + " is already OFF.");
        }
    }

    public String getStatus() {
        return String.format("%s - %s | Active for: %d sec", 
            name, isOn ? "ON" : "OFF", getTotalActiveTime() / 1000);
    }

    public long getTotalActiveTime() {
        return isOn ? totalOnTime + (System.currentTimeMillis() - lastOnTimestamp) : totalOnTime;
    }

    public String getName() {
        return name;
    }

    public abstract String getType();
}

// Subclasses (extendable any time)
class Light extends SmartDevice {
    public Light(String name) { super(name); }
    public String getType() { return "Light"; }
}

class AirConditioner extends SmartDevice {
    public AirConditioner(String name) { super(name); }
    public String getType() { return "AC"; }
}

class TV extends SmartDevice {
    public TV(String name) { super(name); }
    public String getType() { return "Television"; }
}

class Shower extends SmartDevice {
    public Shower(String name) { super(name); }
    public String getType() { return "Shower"; }
}

class CustomDevice extends SmartDevice {
    private final String type;
    public CustomDevice(String type, String name) {
        super(name);
        this.type = type;
    }
    public String getType() { return type; }
}

// Room class
class Room {
    private final String name;
    private final List<SmartDevice> devices = new ArrayList<>();

    public Room(String name) {
        this.name = name;
    }

    public void addDevice(SmartDevice device) {
        devices.add(device);
        System.out.println("[+] Added " + device.getType() + " '" + device.getName() + "' to room '" + name + "'");
    }

    public void controlDevice(String deviceName, boolean turnOn) {
        for (SmartDevice d : devices) {
            if (d.getName().equalsIgnoreCase(deviceName)) {
                if (turnOn) d.powerOn(); else d.powerOff();
                return;
            }
        }
        System.out.println("[X] Device '" + deviceName + "' not found in room '" + name + "'");
    }

    public void showDevices() {
        System.out.println("Room: " + name);
        if (devices.isEmpty()) {
            System.out.println("  (No devices)");
        }
        for (SmartDevice d : devices) {
            System.out.println("  - " + d.getStatus());
        }
    }

    public String getName() {
        return name;
    }
}

// Main controller
 class UniqueHomeAutomation {
    private static final Scanner sc = new Scanner(System.in);
    private static final List<Room> house = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("🔌 Welcome to Unique Smart Home System 🔌");

        while (true) {
            printMenu();
            String option = sc.nextLine().trim();

            switch (option) {
                case "1" -> addRoom();
                case "2" -> addDeviceToRoom();
                case "3" -> controlDeviceInRoom(true);
                case "4" -> controlDeviceInRoom(false);
                case "5" -> showRoomStatus();
                case "6" -> showAllStatus();
                case "7" -> {
                    System.out.println("🔚 Exiting. Thank you!");
                    return;
                }
                default -> System.out.println("❌ Invalid choice. Try again.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("\n📋 Menu:");
        System.out.println("1. Add Room");
        System.out.println("2. Add Device to Room");
        System.out.println("3. Turn ON Device");
        System.out.println("4. Turn OFF Device");
        System.out.println("5. Show Devices in a Room");
        System.out.println("6. Show All Rooms and Devices");
        System.out.println("7. Exit");
        System.out.print("👉 Your choice: ");
    }

    private static Room findRoom(String name) {
        return house.stream()
                .filter(r -> r.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

    private static void addRoom() {
        System.out.print("Enter new room name: ");
        String name = sc.nextLine().trim();
        if (findRoom(name) != null) {
            System.out.println("Room already exists.");
            return;
        }
        house.add(new Room(name));
        System.out.println("[+] Room '" + name + "' added.");
    }

    private static void addDeviceToRoom() {
        System.out.print("Enter room name: ");
        String roomName = sc.nextLine().trim();
        Room room = findRoom(roomName);
        if (room == null) {
            System.out.println("[X] Room does not exist.");
            return;
        }

        System.out.print("Enter device type (light/ac/tv/shower/custom): ");
        String type = sc.nextLine().toLowerCase().trim();
        System.out.print("Enter device name: ");
        String name = sc.nextLine().trim();

        SmartDevice device = switch (type) {
            case "light" -> new Light(name);
            case "ac" -> new AirConditioner(name);
            case "tv" -> new TV(name);
            case "shower" -> new Shower(name);
            case "custom" -> {
                System.out.print("Enter custom device type: ");
                String customType = sc.nextLine().trim();
                yield new CustomDevice(customType, name);
            }
            default -> null;
        };

        if (device != null) {
            room.addDevice(device);
        } else {
            System.out.println("Invalid device type.");
        }
    }

    private static void controlDeviceInRoom(boolean turnOn) {
        System.out.print("Enter room name: ");
        String roomName = sc.nextLine().trim();
        Room room = findRoom(roomName);
        if (room == null) {
            System.out.println("[X] Room does not exist.");
            return;
        }

        System.out.print("Enter device name: ");
        String deviceName = sc.nextLine().trim();
        room.controlDevice(deviceName, turnOn);
    }

    private static void showRoomStatus() {
        System.out.print("Enter room name: ");
        String roomName = sc.nextLine().trim();
        Room room = findRoom(roomName);
        if (room != null) {
            room.showDevices();
        } else {
            System.out.println("[X] Room not found.");
        }
    }

    private static void showAllStatus() {
        if (house.isEmpty()) {
            System.out.println("🏠 No rooms added yet.");
        }
        for (Room r : house) {
            r.showDevices();
            System.out.println("--------------------------------");
        }
    }
}
