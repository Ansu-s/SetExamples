package com.java.Set;
import java.util.HashSet;
public class EmployeeDuplicateHashSet {



        private int id;
        private String name;

        public EmployeeDuplicateHashSet(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public static void main(String[] args) {
            HashSet<EmployeeDuplicateHashSet> employeeSet = new HashSet<>();

            employeeSet.add(new EmployeeDuplicateHashSet(1, "Ram"));
            employeeSet.add(new EmployeeDuplicateHashSet(2, "Hari"));
            employeeSet.add(new EmployeeDuplicateHashSet(3, "Sita"));
            employeeSet.add(new EmployeeDuplicateHashSet(1, "Ram"));
            employeeSet.add(new EmployeeDuplicateHashSet(4, "Gita"));

            for (EmployeeDuplicateHashSet emp : employeeSet) {
                System.out.println("Employee ID: " + emp.id + ", Name: " + emp.name+"  "+employeeSet.hashCode());
            }
        }


}
