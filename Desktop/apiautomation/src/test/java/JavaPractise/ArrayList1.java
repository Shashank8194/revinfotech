package JavaPractise;

import java.util.ArrayList;

public class ArrayList1 {

    public  static void main(String[] args)
    {
        ArrayList<String> list=new ArrayList<String>();
        list.add("sha");
        list.add("nk");


        for (int i =0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
    }
}
