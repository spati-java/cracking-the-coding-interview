package model;

import lombok.Data;

@Data
public class Employee {
    private String name;
    private Double salary;

    public Employee(String name, Double salary){
        this.name = name;
        this.salary = salary;
    }

}
