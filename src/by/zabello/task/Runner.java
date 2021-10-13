package by.zabello.task;

import by.zabello.task.entity.Department;
import by.zabello.task.service.CalculateCost;
import by.zabello.task.service.CalculateWeight;
import by.zabello.task.service.EquipDepartment;

import java.util.Map;

public class Runner {
    public static void main(String[] args) {
        Department department = new Department();
        EquipDepartment equiper = new EquipDepartment();
        equiper.equip(department);
        CalculateCost calculateCost = new CalculateCost();
        Map<String, Double> price = calculateCost.calculate(department.getDeviceList());
        CalculateWeight calculateWeight = new CalculateWeight();
        Map<String, Double> weight = calculateWeight.calculate(department.getDeviceList());
        //TODO output in XML
//        System.out.println(department.getDeviceList());
//        System.out.println(price);
//        System.out.println();
//        System.out.println(weight);
    }


}
