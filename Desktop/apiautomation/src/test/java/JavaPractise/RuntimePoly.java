package JavaPractise;

import java.util.Scanner;

public class RuntimePoly {

    static Scanner scanner=new Scanner(System.in);

    public static int  Multiply(int a, int b)
    {
        a = scanner.nextInt(a);
        b= scanner.nextInt(b);
        return a*b;
    }

    public  static int Multiply(int a, int b,int c)
    {
     a=scanner.nextInt(a);
      b=  scanner.nextInt(b);
        c=scanner.nextInt(c);
        return a*b;
    }

    public static  void main(String[] args)
    {
       // System.out.println(RuntimePoly.Multiply());
    }
}
