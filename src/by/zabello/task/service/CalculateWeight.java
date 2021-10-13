package by.zabello.task.service;

import by.zabello.task.entity.Device;
import by.zabello.task.entity.Laptop;
import by.zabello.task.entity.Smartphone;
import by.zabello.task.entity.TabletComputer;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CalculateWeight {
    public Map<String, Double> calculate(List<Device> deviceList) {
        Map<String, Double> weight = new HashMap<>();
        weight.put("smartphone", 0.0);
        weight.put("tabletComputer", 0.0);
        weight.put("laptop", 0.0);
        for (Device device : deviceList) {
            if (device.getClass() == Smartphone.class) {
                weight.put("smartphone", weight.get("smartphone") + device.getWeight());
            } else if (device.getClass() == TabletComputer.class) {
                weight.put("tabletComputer", weight.get("tabletComputer") + device.getWeight());
            } else if (device.getClass() == Laptop.class) {
                weight.put("laptop", weight.get("laptop") + device.getWeight());
            }
        }
        return weight;
    }
}
