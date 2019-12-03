package JavaPractise;

interface MyInterface
{
    public void Method1();
    public void Method2();
}

public class Interface  implements MyInterface{


    @Override
    public void Method1() {

        System.out.println("this is a method 1");

    }

    @Override
    public void Method2() {

    }

    public static void main(String args[])
    {
        MyInterface myInterface= new Interface();
        myInterface.Method1();
    }
}
