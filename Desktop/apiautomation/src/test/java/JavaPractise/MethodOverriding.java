package JavaPractise;

 class MethodOverriding {

    public void MainMethod()
    {
        System.out.println("this is a main method");
        return;
    }
    public static class ChildClass extends MethodOverriding
    {
                public int MainMethod(int a, int b)
                {
                    return a*b;
                   // System.out.println("this is a child class method");
                }

                public void ChildMethod2()
                {
                    System.out.println("this is second method of child class");
                }
    }

    public static void main(String args[])
    {
            MethodOverriding methodOverriding=new MethodOverriding();
            methodOverriding.MainMethod();


            ChildClass childClass= new ChildClass();
            childClass.MainMethod();
    }

}



