package JavaPractise;

public class ParamConstructor {

    int id;
    String name;

    public ParamConstructor(int i, String str)
    {
        id=i;
        name=str;
    }

    void display()
    {
        System.out.println(id + " " + name);
    }

    public static void main(String args[])
    {
      //  ParamConstructor paramConstructor= new ParamConstructor(1,"'Shashank");

        ParamConstructor ps=new ParamConstructor(111,"Shashank");

       // System.out.println(paramConstructor);

        ps.display();
    }
}
