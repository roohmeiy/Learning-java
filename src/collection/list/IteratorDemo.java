package collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {

        ArrayList list=new ArrayList();
        list.add("Payal");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        Iterator itr=list.iterator();

//        while(itr.hasNext()){
//            String name=(String) itr.next();
//            if(name.equals("ccc"))
//                itr.remove();
//        }
        while (itr.hasNext()) {
            if (((String) itr.next()).equals("ccc")) {
                itr.remove();
            }
        }
        System.out.println(list);
    }
}
