package collection;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {
    public static void main(String[] args) {

        Vector v=new Vector();

        v.addElement("aaa");
        v.addElement("bbb");
        v.addElement("ccc");

        Enumeration e= v.elements();  //-all legacy classes inherits enumeration and we get object of enumeration from elements();

        while (e.hasMoreElements())  //this function will return boolean
            System.out.println(e.nextElement());

        while (e.hasMoreElements())  //this function will return boolean
            System.out.println(e.nextElement());

    }
}
