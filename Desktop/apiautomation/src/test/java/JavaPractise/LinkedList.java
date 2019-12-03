package JavaPractise;

import java.util.Iterator;

public class LinkedList {

    public static void main(String args[]) {
        java.util.LinkedList<String> linkedList = new java.util.LinkedList<String>();

        linkedList.add("Shshank");
        linkedList.add("Sharma");
        linkedList.add("John");
        linkedList.add("sharma");


        Iterator<String> iterator = linkedList.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
       /* for (int i=0 ; i<linkedList.size(); i++)
        {
            System.out.println(linkedList.get(i));
        }


        linkedList.remove(2);

        System.out.println(linkedList);

    }*/
    }
}