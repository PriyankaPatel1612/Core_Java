class Test21
{
  static int a=10;
  public static void main(String args[])
  {
    System.out.println(Test.a);
    System.out.println(Test21.a);
    System.out.println(a);
    Test t = new Test();
    t .show();
  }
}

class Test
{
 static int a=100;
 void show()
 {
    System.out.println(Test.a);
    System.out.println(Test21.a);
    System.out.println(a);
 }
}