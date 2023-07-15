package com.java.Set;

import java.util.HashSet;

class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters and Setters

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

 class Main {
    public static void main(String[] args) {
        HashSet<Employee> employeeSet = new HashSet<>();

        Employee emp1 = new Employee(1, "Ram");
        Employee emp4 = new Employee(1, "Ram");
        Employee emp2 = new Employee(2, "Sita");
        Employee emp3 = new Employee(3, "Gita");

        employeeSet.add(emp1);
        employeeSet.add(emp2);
        employeeSet.add(emp3);

        System.out.println("HashSet size: " + employeeSet.size());
        System.out.println("HashSet contents: " + employeeSet);
    }
}
