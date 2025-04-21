package SirMoseenPrograms.FinalProject;

import java.util.ArrayList;
import java.util.List;

class ElectronicDevice {
    private String brandName;
    private boolean powerStatus;

    public ElectronicDevice() {
        this.powerStatus = false;
        this.brandName = "None";
    }

    public ElectronicDevice(String brand, String powerStatus) {
        this.brandName = brand;
        setPowerStatus(powerStatus);
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return this.brandName;
    }

    public void turnOn() {
        this.powerStatus = true;
    }

    public void turnOff() {
        this.powerStatus = false;
    }

    public void setPowerStatus(String powerStatus) {
        try {
            if (powerStatus.equalsIgnoreCase("on")) {
                this.powerStatus = true;
            } else if (powerStatus.equalsIgnoreCase("off")) {
                this.powerStatus = false;
            } else {
                throw new IllegalArgumentException("Power status must be either 'on' or 'off'");
            }
        } catch (IllegalArgumentException e) {
            System.err.println("Error: Please enter 'on' or 'off'");
            this.powerStatus = false;
        }
    }

    public boolean getPoweredStatus() {
        return this.powerStatus;
    }

    public String toString() {
        return "Brand Name: " + this.brandName +
                "\nPower Status: " + (this.powerStatus ? "ON" : "OFF");
    }
}

class Processor {
    private String model;
    private double speed;

    Processor() {
        this.model = "None";
        this.speed = 0.00;
    }

    Processor(String model, double speed) {
        this.model = model;
        setSpeed(speed);
    }

    public void setModel(String model) {
        if (model == null || model.trim().isEmpty()) {
            throw new IllegalArgumentException("Model cannot be null or empty");
        }
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }

    public void setSpeed(double speed) {
        if (speed < 0) {
            throw new IllegalArgumentException("Speed cannot be negative");
        }
        if (speed > 10.0) {
            throw new IllegalArgumentException("Speed exceeds maximum allowed value");
        }
        this.speed = speed;
    }

    public double getSpeed() {
        return this.speed;
    }

    public String toString() {
        return "Processor Model: " + this.model + "\nProcessor Speed: " + this.speed + "GHz";
    }
}

class Ram {
    private int ramCapacity;
    private static final int MIN_RAM = 0;
    private static final int MAX_RAM = 1024;

    Ram() {
        this(0);
    }

    Ram(int capacity) {
        setRamCapacity(capacity);
    }

    public void setRamCapacity(int ramCapacity) {
        if (ramCapacity < MIN_RAM) {
            throw new IllegalArgumentException("RAM capacity cannot be negative");
        }
        if (ramCapacity > MAX_RAM) {
            throw new IllegalArgumentException("RAM capacity exceeds maximum allowed (" + MAX_RAM + "GB)");
        }
        this.ramCapacity = ramCapacity;
    }

    public int getCapacity() {
        return this.ramCapacity;
    }

    public String toString() {
        return "RAM: " + this.ramCapacity + "GB";
    }
}

class HardDrive {
    private int capacity;
    private static final int MIN_CAPACITY = 0;
    private static final int MAX_CAPACITY = 2048;

    HardDrive() {
        this(0);
    }

    HardDrive(int capacity) {
        setCapacity(capacity);
    }

    public void setCapacity(int capacity) {
        if (capacity < MIN_CAPACITY) {
            throw new IllegalArgumentException("Drive capacity cannot be negative");
        }
        if (capacity > MAX_CAPACITY) {
            throw new IllegalArgumentException("Drive capacity exceeds maximum allowed (" + MAX_CAPACITY + "GB)");
        }
        this.capacity = capacity;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public String toString() {
        return "Hard Drive: " + this.capacity + "GB";
    }
}

class GPU {
    private String model;
    private int memory;
    private double clockSpeed;

    public GPU() {
        this.model = "None";
        this.memory = 0;
        this.clockSpeed = 0.0;
    }

    public GPU(String model, int memory, double clockSpeed) {
        setModel(model);
        setMemory(memory);
        setClockSpeed(clockSpeed);
    }

    public void setModel(String model) {
        if (model == null || model.trim().isEmpty()) {
            throw new IllegalArgumentException("GPU model cannot be empty");
        }
        this.model = model;
    }

    public void setMemory(int memory) {
        if (memory < 0) {
            throw new IllegalArgumentException("GPU memory cannot be negative");
        }
        this.memory = memory;
    }

    public void setClockSpeed(double clockSpeed) {
        if (clockSpeed < 0.0 || clockSpeed > 3.0) {
            throw new IllegalArgumentException("Invalid GPU clock speed");
        }
        this.clockSpeed = clockSpeed;
    }

    public String getModel() {
        return model;
    }

    public int getMemory() {
        return memory;
    }

    public double getClockSpeed() {
        return clockSpeed;
    }

    public String toString() {
        return "GPU Model: " + model +
                "\nGPU Memory: " + memory + "GB" +
                "\nGPU Clock Speed: " + clockSpeed + "GHz";
    }
}

class OperatingSystem {
    private String name;
    private String version;
    private String architecture;

    public OperatingSystem() {
        this.name = "Unknown";
        this.version = "0.0";
        this.architecture = "x86";
    }

    public OperatingSystem(String name, String version, String architecture) {
        setName(name);
        setVersion(version);
        setArchitecture(architecture);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public String getArchitecture() {
        return architecture;
    }

    public String toString() {
        return "Operating System: " + name + " " + version + " (" + architecture + ")";
    }
}

class Computer extends ElectronicDevice {
    private Processor processor;
    private Ram ram;
    private HardDrive hardDrive;
    private GPU gpu;
    private OperatingSystem os;
    private List<String> installedSoftware;

    public Computer(String brand, String powerStatus, Processor processor, Ram ram,
                    HardDrive hardDrive, GPU gpu, OperatingSystem os) {
        super(brand, powerStatus);
        this.processor = processor;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.gpu = gpu;
        this.os = os;
        this.installedSoftware = new ArrayList<>();
    }

    public void installSoftware(String software) {
        installedSoftware.add(software);
        System.out.println(software + " installed.");
    }

    public void uninstallSoftware(String software) {
        if (installedSoftware.remove(software)) {
            System.out.println(software + " uninstalled.");
        } else {
            System.out.println(software + " not found.");
        }
    }

    public List<String> getInstalledSoftware() {
        return installedSoftware;
    }

    public void formatComputer() {
        installedSoftware.clear();
        System.out.println("Computer formatted. All software removed.");
    }

    public void upgradeRam(int extraRam) {
        try {
            ram.setRamCapacity(ram.getCapacity() + extraRam);
            System.out.println("RAM upgraded. Total: " + ram.getCapacity() + "GB");
        } catch (IllegalArgumentException e) {
            System.err.println("Upgrade failed: " + e.getMessage());
        }
    }

    public void changeOperatingSystem(OperatingSystem newOS) {
        this.os = newOS;
        System.out.println("OS changed to: " + newOS);
    }

    public void checkStorage() {
        System.out.println("Total Hard Drive Capacity: " + hardDrive.getCapacity() + "GB");
    }

    public void isSoftwareInstalled(String name) {
        if (installedSoftware.contains(name)) {
            System.out.println(name + " is installed.");
        } else {
            System.out.println(name + " is not installed.");
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== Computer Information ===\n")
                .append(super.toString()).append("\n")
                .append(processor).append("\n")
                .append(ram).append("\n")
                .append(hardDrive).append("\n");
        if (gpu != null) sb.append(gpu).append("\n");
        if (os != null) sb.append(os).append("\n");
        if (!installedSoftware.isEmpty()) {
            sb.append("Installed Software: ").append(String.join(", ", installedSoftware)).append("\n");
        } else {
            sb.append("No software installed.\n");
        }
        sb.append("============================");
        return sb.toString();
    }
}

class User {
    private String name;
    private Computer computer;

    public User(String name, Computer computer) {
        this.name = name;
        this.computer = computer;
    }

    public void useComputer() {
        if (!computer.getPoweredStatus()) {
            System.out.println(name + " is turning on the computer...");
            computer.turnOn();
        }
        System.out.println(name + " is using the computer:");
        System.out.println(computer);
    }
}

class Task extends Thread {
    private String taskName;

    public Task(String taskName) {
        this.taskName = taskName;
    }

    public void run() {
        System.out.println(taskName + " has started...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(taskName + " was interrupted.");
        }
        System.out.println(taskName + " has completed.");
    }
}

public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor("Intel i5", 3.2);
        Ram ram = new Ram(8);
        HardDrive hdd = new HardDrive(500);
        GPU gpu = new GPU("NVIDIA GTX 1050", 4, 1.5);
        OperatingSystem os = new OperatingSystem("Windows", "10", "x64");

        Computer pc = new Computer("HP", "off", processor, ram, hdd, gpu, os);

        pc.installSoftware("MS Word");
        pc.installSoftware("Zoom");
        pc.installSoftware("Photoshop");

        pc.turnOn();
        pc.isSoftwareInstalled("Zoom");
        pc.uninstallSoftware("Zoom");

        pc.checkStorage();
        pc.upgradeRam(4);

        OperatingSystem newOS = new OperatingSystem("Linux", "Ubuntu 22.04", "x64");
        pc.changeOperatingSystem(newOS);

        pc.formatComputer();

        User user = new User("Ali", pc);
        user.useComputer();

        Task task1 = new Task("Running Antivirus");
        Task task2 = new Task("Backing up Files");
        task1.start();
        task2.start();
    }
}
