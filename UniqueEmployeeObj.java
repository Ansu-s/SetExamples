package com.java.Set;

import java.util.Objects;
import java.util.*;

class UniqueEmployee{
     int Id;
     String name;

    public UniqueEmployee(int id, String name) {
        this.Id = id;
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public int hashCode() {
       
        return Objects.hash(Id, name);
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UniqueEmployee employee = (UniqueEmployee) obj;
        return Id == employee.Id && Objects.equals(name, employee.name);
    }


}

 class ShowEmp {
    public static void main(String[] args) {

        HashSet<UniqueEmployee> employeeHashSet = new HashSet<>();


        employeeHashSet.add(new UniqueEmployee(1, "Ram"));
        employeeHashSet.add(new UniqueEmployee(1, "Ram"));
        employeeHashSet.add(new UniqueEmployee(3, "sita"));
        employeeHashSet.add(new UniqueEmployee(3, "sita"));
        employeeHashSet.add(new UniqueEmployee(3, "gopal"));
        employeeHashSet.add(new UniqueEmployee(3, "gopal"));


        for (UniqueEmployee employee : employeeHashSet) {
            System.out.println("ID: " + employee.getId() + ", Name: " + employee.getName());
        }
    }
}
