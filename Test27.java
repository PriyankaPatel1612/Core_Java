class A
{
   int a =10;
}

class B extends A
{
   int a = 20;
   void show()
   {
      int a=30;
      System.out.println(a);
      System.out.println(this.a);
      System.out.println(super.a);
   }
}

class Test27
{
   public static void main(String args[])
   { 
      A a1 = new A();
      B b1 = new B();
      b1.show();
   }
}