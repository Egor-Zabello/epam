package by.zabello.task.entity;

public class TabletComputer extends Device{
    private double screenResolution;

    public TabletComputer() {
    }

    public TabletComputer(double cost, double weight, String accountNumber, double screenResolution) {
        super(cost, weight, accountNumber);
        this.screenResolution = screenResolution;
    }

    public double getScreenResolution() {
        return screenResolution;
    }

    public void setScreenResolution(double screenResolution) {
        this.screenResolution = screenResolution;
    }
}
