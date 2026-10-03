package day_8.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

    public static void main(String[] args) {

        // 1. Generic List holding Object elements (fixes Raw Type warnings)
        List<Object> list1 = new ArrayList<>();

        System.out.println("Size : " + list1.size());
        System.out.println("Is list empty? " + list1.isEmpty());

        // Adding heterogeneous elements safely
        list1.add(10);
        list1.add(20);
        list1.add(true);
        list1.add(false);
        list1.add(20);
        list1.add("Hello");
        list1.add(56.78);
        list1.add(20);
        list1.add('A');

        // Add "Hi" at index 5
        list1.add(5, "Hi");
        list1.add(20);

        System.out.println("List is " + list1);

        // Check whether 15 is present
        System.out.println("Is list contains 15? " + list1.contains(15));

        // Remove false (removes object instance)
        list1.remove(Boolean.FALSE);

        System.out.println("List is " + list1);

        // Get element at index 5
        System.out.println("Element at 5 location is : " + list1.get(5));

        // Remove last occurrence of 20 by index
        System.out.println("Element removed : "
                + list1.remove(list1.lastIndexOf(20)));

        // Remove first occurrence of 20 by index
        System.out.println("Element removed : "
                + list1.remove(list1.indexOf(20)));

        System.out.println("List is " + list1);

        // Clear all elements
        list1.clear();

        System.out.println("List is " + list1);

        // 2. Generic Homogeneous List (uses diamond operator '<>')
        List<String> names = new ArrayList<>();

        names.add("Amit");
        names.add("Sumit");
        names.add("Ankit");
        names.add("Rohit");
        names.add("Likshit");

        System.out.println("Name List is " + names);

        // Reverse the list
        Collections.reverse(names);

        System.out.println("Reverse Name List is " + names);

        // Check whether Ankit is present
        System.out.println("Is 'Ankit' contains in name list? " + names.contains("Ankit"));

        System.out.println("Name List Before Sorting is " + names);

        // Sort in ascending order
        Collections.sort(names);

        System.out.println("Sorting in Ascending order " + names);

        // Reverse to get descending order
        Collections.reverse(names);

        System.out.println("Sorting in Descending order " + names);

        // Forward Traversing using Iterator
        System.out.println("--------------- Traversing a list ---------------");

        Iterator<String> i = names.iterator();

        while (i.hasNext()) {
            String nm = i.next();
            System.out.println(nm);

            if (nm.equals("Ankit")) {
                i.remove();
            }
        }

        System.out.println("Name list is " + names);

        // Backward Traversing using ListIterator
        System.out.println("--------------- Traversing a list in backward manner ---------------");

        ListIterator<String> li = names.listIterator(names.size());

        while (li.hasPrevious()) {
            String nm = li.previous();
            System.out.println(nm);
        }
    }
}