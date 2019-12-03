package JavaPractise;

abstract class AbstractClass {

    public  void sound(){}

    public static class childclass extends AbstractClass
    {
        public void sound()
        {
            System.out.println("This is a abstract class method");
        }
    }

    public static void main(String args[])
    {
        AbstractClass abstractClass=new childclass();

        abstractClass.sound();
    }
}
