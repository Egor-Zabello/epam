package by.zabello.task.entity;

public class Smartphone extends Device{
    private String operationSystem;

    public Smartphone() {
    }

    public Smartphone(double cost, double weight, String accountNumber, String operationSystem) {
        super(cost, weight, accountNumber);
        this.operationSystem = operationSystem;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }
//    @Override
//    public String toString() {
//        return "Smartphone{" + super.toString()+
//                "operationSystem='" + operationSystem + '\'' +
//                '}';
//    }
}
