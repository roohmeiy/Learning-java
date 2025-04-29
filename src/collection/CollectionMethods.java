package collection;

import java.util.ArrayList;

// Demonstrates basic methods of ArrayList in Java
public class CollectionMethods {
    public static void main(String[] args) {

        // Creating first list and adding elements
        ArrayList list1 = new ArrayList();
        list1.add("Pihu"); // Adds string element
        list1.add("Payal"); // Adds string element
        list1.add(20); // Adds integer element
        System.out.println(list1); // Prints list1 contents
        System.out.println(list1.contains("Pihu")); // Checks if "Pihu" is present in list1
        System.out.println();

        // Creating second list and adding elements
        ArrayList list2 = new ArrayList();
        list2.add("Arun");
        list2.add("Arun Sharma");
        list2.add(26);
        System.out.println(list2.remove("Arun Sharma")); // Removes the specified object
        System.out.println(list2); // Prints updated list2
        System.out.println();

        list1.addAll(list2); // Adds all elements of list2 to list1
        System.out.println(list1); // Prints updated list1
        System.out.println();

        list1.removeAll(list2); // Removes all elements of list2 from list1
        System.out.println(list1); // Prints list1 after removal
        System.out.println();

        // Creating a test list to demonstrate more methods
        ArrayList test = new ArrayList();
        test.add("aaa");
        test.add("bbb");
        test.add("ccc");
        test.add("ddd");
        test.add("eee");
        System.out.println(test.isEmpty()); // Checks if the list is empty
        System.out.println(test.size()); // Prints the size of the list
        System.out.println(test.remove("bbb")); // Removes the object "bbb"
        System.out.println(test); // Prints list after removing "bbb"
        System.out.println(test.remove(1)); // Removes element at index 1 ("ccc")
        System.out.println(test); // Prints list after index removal
        test.clear(); // Clears all elements in the list
        System.out.println(test); // Prints empty list
    }
}
