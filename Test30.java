//A reference can hold the object of child class
class Test30
{
   public static void main(String args[])
   {
      A a;
      B b = new B();
      a=b;
      a.show();
      b.show();
      b.display();
   }
}

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