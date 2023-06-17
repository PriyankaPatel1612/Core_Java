
class A
{
   A(int x, int y)
   {
      System.out.println(x + " " + y);
   }
}

class B extends A
{
   B(int x, int y, int z)
   {
      super(x,y);
      System.out.print(x + " " + y + " " + " " + z);
   }
}

class Test29
{
   public static void main(String args[])
   {
      A a1 = new A(10,20);
      B b1 = new B(100,200,300);
   }
}

