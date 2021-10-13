package by.zabello.task.entity;

public abstract class Device  {
    private double cost;
    private double weight;
    private String accountNumber;

    public Device() {
    }

    public Device(double cost, double weight, String accountNumber) {
        this.cost = cost;
        this.weight = weight;
        this.accountNumber = accountNumber;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

//    @Override
//    public String toString() {
//        return "Device{" +
//                "cost=" + cost +
//                ", weight=" + weight +
//                ", accountNumber='" + accountNumber + '\'' +
//                '}';
//    }
}
