package com.java.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class HashSetIterator {



        public static void main(String[] args) {
            HashSet<String> names = new HashSet<>();


            names.add("one");
            names.add("Two");
            names.add("Three");
            names.add("Three");
            names.add("Four");
            LinkedList<String> names2 = new LinkedList<>(names);
//       names2.addall(names);
            Iterator<String> iterator = names.iterator();
            while (iterator.hasNext()) {
                String name = iterator.next();
                System.out.println(name);
            }
            System.out.println();
            Iterator<String> descItr = names2.descendingIterator();
            while (descItr.hasNext()) {
                String name = descItr.next();
                System.out.println(name);
            }


        }



}
