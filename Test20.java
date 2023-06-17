class Test20
{
    static int a;   //static variable
    int b=10;             //instance variable
    public static void main(String args[])
    { 
     Test20 t1 = new Test20();
     Test20 t2 = new Test20();

     System.out.println("Static variables---");
     t1.a=10;
     System.out.println(t1.a);
     System.out.println(t2.a);
     t2.a=20;
     System.out.println(t1.a);  
     System.out.println(t2.a);

     System.out.println("instance variables---");
     t1.b=100;
    System.out.println(t1.b);
    System.out.println(t2.b);
    t2.b=200;
    System.out.println(t1.b);
    System.out.println(t2.b);
    }
}