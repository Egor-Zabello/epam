package by.zabello.task.service;

import by.zabello.task.entity.*;

import java.util.ArrayList;
import java.util.List;

public class EquipDepartment {
    public void equip(Department department) {
        List<Device> deviceList = new ArrayList<>();//TODO: fill with parser
//        Device smartphone1 = new Smartphone(11, 12, "HL228", "IOS");
//        Device smartphone2 = new Smartphone(1100, 120, "HL227", "ANDROID");
//        Device laptop = new Laptop(30, 22, "HL220", 64256);
//        Device tablet = new TabletComputer(44, 55, "HL229", 7.3);
//        deviceList.add(smartphone1);
//        deviceList.add(smartphone2);
//        deviceList.add(laptop);
//        deviceList.add(tablet);
        department.setDeviceList(deviceList);
    }
}
