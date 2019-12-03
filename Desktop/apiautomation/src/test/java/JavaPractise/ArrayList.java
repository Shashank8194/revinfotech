package JavaPractise;

import java.util.Iterator;

public class ArrayList {

    public static void main(String args[])
    {
        //creating ArrayList
        java.util.ArrayList<String> list= new java.util.ArrayList<String>();

        //Adding objects in Array list
        list.add("Shashank");
        list.add("Sahay");
        list.add("Shashank");
        list.add("Sahay");

        //Iterating
        Iterator iterator= list.iterator();

        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
int size=list.size();

        for (int i=0 ; i<size ; i++)
        {
            System.out.println(list.get(i));
        }


    }
}
