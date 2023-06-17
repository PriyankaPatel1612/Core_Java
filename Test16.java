class Test16
{
  static int a;
  public static void main(String args[])
  {
    System.out.println(a); 

    Test16 t1 = new Test16();
    Test16 t2 = new Test16();
    Test16 t3 = new Test16(); 

    t1.a=10;
    t2.a=20;
    t3.a=30;

    System.out.println(t1.a);
    System.out.println(t2.a);
    System.out.println(t3.a);
    System.out.println(Test16.a);

    Test16.a=1000;
    System.out.println(a);
  }
}