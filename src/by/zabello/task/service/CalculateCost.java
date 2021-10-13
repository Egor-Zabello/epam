package by.zabello.task.service;

import by.zabello.task.entity.Device;
import by.zabello.task.entity.Laptop;
import by.zabello.task.entity.Smartphone;
import by.zabello.task.entity.TabletComputer;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

 public class CalculateCost {

    public Map<String, Double> calculate(List<Device> deviceList) {
        Map<String, Double> costs = new HashMap<>();
        costs.put("smartphone", 0.0);
        costs.put("tabletComputer", 0.0);
        costs.put("laptop", 0.0);
        for (Device device : deviceList) {
            if (device.getClass() == Smartphone.class) {
                costs.put("smartphone", costs.get("smartphone") + device.getCost());
            } else if (device.getClass() == TabletComputer.class) {
                costs.put("tabletComputer", costs.get("tabletComputer") + device.getCost());
            } else if (device.getClass() == Laptop.class) {
                costs.put("laptop", costs.get("laptop") + device.getCost());
            }
        }
        return costs;
    }
}
