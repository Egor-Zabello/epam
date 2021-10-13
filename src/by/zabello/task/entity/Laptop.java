package by.zabello.task.entity;

public class Laptop extends Device {
 private double memorySize;

    public Laptop() {
    }

    public Laptop(double cost, double weight, String accountNumber, double memorySize) {
        super(cost, weight, accountNumber);
        this.memorySize = memorySize;
    }

    public double getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(double memorySize) {
        this.memorySize = memorySize;
    }
}
