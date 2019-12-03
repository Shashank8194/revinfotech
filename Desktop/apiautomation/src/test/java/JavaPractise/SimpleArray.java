package JavaPractise;

import java.util.Arrays;

public class SimpleArray {

    public static void main(String[] args)
    {
        String[] str=new String[]{"abc","pqr"};

        System.out.println(Arrays.toString(str));
        Arrays.stream(str).forEach(System.out::println);


        int[] ints=new int[]{1,2,3};
        System.out.println(Arrays.toString(ints));
        Arrays.stream(ints).forEach(System.out::println);


    }
}
