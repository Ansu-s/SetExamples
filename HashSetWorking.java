package com.java.Set;
import java.lang.*;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.HashSet;
/* **      I tried to access the underlying HashMap used here but Exception in thread "main" java.lang.reflect.InaccessibleObjectException: Unable to make field private transient java.util.HashMap java.util.HashSet.map accessible: module java.base does not "opens java.util" to unnamed module @58372a00
	at java.base/java.lang.reflect.AccessibleObject.checkCanSetAccessible(AccessibleObject.java:354)
	at java.base/java.lang.reflect.AccessibleObject.checkCanSetAccessible(AccessibleObject.java:297)
	at java.base/java.lang.reflect.Field.checkCanSetAccessible(Field.java:180)
	at java.base/java.lang.reflect.Field.setAccessible(Field.java:174)
	at com.java.Set.exp$HashSetHashMapExample.main(exp.java:19)
*/

public class HashSetWorking {

        public static void main(String[] args) // throws NoSuchFieldException , IllegalAccessException
        {
            HashSet<String> my_hashset = new HashSet<>();
            boolean b1 = my_hashset.add("one");
            boolean b2 = my_hashset.add("Two");
            boolean b3 = my_hashset.add("Three");
            boolean b4 = my_hashset.add("one");
            System.out.println("Status of the insertion " + b1);
            System.out.println("The value of second boolean is = "+ b2);
            System.out.println("The value of third boolean is = "+ b3);
            System.out.println("The value of third boolean is = "+ b4);

//            Field field = HashSet.class.getDeclaredField("map");
//            field.setAccessible(true);
//            HashMap<Integer, Object> hashMap = (HashMap<Integer, Object>) field.get(my_hashset);
//            System.out.println("HashMap size: " + hashMap.size());
//            System.out.println("HashMap contents: " + hashMap);
            System.out.println(my_hashset);
        }

}
