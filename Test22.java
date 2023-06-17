//static block have priority first than main method if it is in same class.
class Test
{
  static int a=10;
  static void show()
  {
    System.out.println(a);
  }
  
  static
  {
   a=a+5;
   System.out.println(a*5);
   System.out.println(a);
  }
}

class Test22
{
   public static void main(String args[])
  {
    System.out.println("Helloo..");
    Test.show();
    System.out.println(Test.a);
  }
}

