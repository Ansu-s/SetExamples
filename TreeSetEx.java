package com.java.Set;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx {


        public static void main(String[] args) {
            TreeSet<Integer> num = new TreeSet<>();

            num.add(5);
            num.add(216);
            num.add(8);
            num.add(1);
            num.add(54);
            num.add(71);
            num.add(354);

            System.out.println(num);

           boolean a= num.remove(3);
            System.out.println(a);

            Iterator<Integer> decIterator = num.descendingIterator();
            while (decIterator.hasNext())
                System.out.print(decIterator.next()+" ");

            System.out.println();
            System.out.println("Minimum element: " + num.first());
            System.out.println("Maximum element: " + num.last());
        }
    }


