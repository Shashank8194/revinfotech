package JavaPractise;

interface inf1
{

    public  void method1();
}

interface inf2 extends inf1
{
    public void method2();
}

public class InterfaceInheritance implements inf2 {
   @Override
    public void method1() {
System.out.println("this is a method 1");
    }

    @Override
    public void method2() {
       System.out.println("this is a method 2");

    }


    public static void main(String args[])
    {

        inf2 inf2= new InterfaceInheritance();
        inf2.method2();

    }
}
