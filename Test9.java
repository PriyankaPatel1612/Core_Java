//Method Overloading / Compile time polymorphism
public class Test9 {
    public static void main(String[] args) {
        Test9 obj = new Test9();
        obj.add();
        obj.add(10,20 );
        obj.add(10, 20, 30);
        obj.add(10,20,30,40);
        obj.add(10,20,30.5);
    }

    void add()
    {
       System.out.println("no argument");
    }

    void add(int a, int b)
    {
        System.out.println(a+b);
    }

    void add(int a, int b, int c)
    {
        System.out.println(a+b+c);
    }

    void add(int a, int b, int c, int d)
    {
        System.out.println(a+b+c+d);
    }

    void add(int a, int b, double c)
    {
        System.out.println(a+b+c);
    }
}
