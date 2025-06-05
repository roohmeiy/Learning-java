package collection.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {

        // Create an ArrayList and add some elements to it
        ArrayList list = new ArrayList();
        list.add("element1");
        list.add("element2");
        list.add("element3");
        list.add("element4");
        list.add("element5");

        // Create a ListIterator to iterate through the list
        ListIterator itr = list.listIterator(); // Default cursor position is at the start
//        ListIterator<String> itr = list.listIterator(list.size());  // Cursor at the end of the list if needed

        // Forward iteration over the list using the ListIterator
        System.out.println("forward iteration...................");
        while(itr.hasNext()) // Check if there's another element
            System.out.println(itr.next()); // Move to the next element and print it

        // Backward iteration over the list using the ListIterator
        System.out.println("Backward iteration:");
        while (itr.hasPrevious()) // Check if there's a previous element
            System.out.println(itr.previous()); // Move to the previous element and print it

        // Adding a new element ("element7") after "element3" during forward iteration
        while (itr.hasNext()){
            String item = (String) itr.next(); // Get the current item
            if(item.equals("element3")) // If the current item is "element3"
                itr.add("element7"); // Add "element7" after it
        }
        System.out.println(list); // Prints the list after addition

        // Reset the iterator to the start of the list
        itr = list.listIterator();
        // Replacing "element7" with "element8" during forward iteration
        while (itr.hasNext()){
            String item = (String) itr.next(); // Get the current item
            if(item.equals("element7")) // If the current item is "element7"
                itr.set("element8"); // Replace it with "element8"
        }
        System.out.println(list); // Prints the list after replacement
    }
}
