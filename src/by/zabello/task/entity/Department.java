package by.zabello.task.entity;

import java.util.List;

public class Department {
    private List<Device> deviceList;

    public Department() {
    }

    public Department(List<Device> deviceList) {
        this.deviceList = deviceList;
    }

    public List<Device> getDeviceList() {
        return deviceList;
    }

    public void setDeviceList(List<Device> deviceList) {
        this.deviceList = deviceList;
    }
}
