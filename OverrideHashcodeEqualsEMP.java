package com.java.Set;

import java.util.HashSet;

import java.util.Objects;

 // copied the file from EmployeeDuplicateHashset  and just added the intellij generated ovirriden hashCode and equals methods
class expm {



    private int id;
    private String name;

    public expm(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof expm)) return false;
        expm expm = (expm) o;
        return id == expm.id && name.equals(expm.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public static void main(String[] args) {
        HashSet<expm> employeeSet = new HashSet<>();

        employeeSet.add(new expm(1, "Ram"));
        employeeSet.add(new expm(2, "Hari"));
        employeeSet.add(new expm(2, "Hari"));
        employeeSet.add(new expm(3, "Sita"));
        employeeSet.add(new expm(1, "Ram"));
        employeeSet.add(new expm(4, "Gita"));

        for (expm emp : employeeSet) {
            System.out.println("Employee ID: " + emp.id + ", Name: " + emp.name+"  "+employeeSet.hashCode());
        }
    }


}

