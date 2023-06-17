//Single level inheritance

class A
{
   void show()
   {
      System.out.println("Hello from A");
   }
}

class B extends A
{
   void display()
   {
      System.out.println("Hello from B");
   }
}

class Test26
{
   public static void main(String args[])
   {
      A a1 = new A();
      B b1 = new B();
      //a1.display();
      a1.show();
      b1.show();
      b1.display();
   }
}