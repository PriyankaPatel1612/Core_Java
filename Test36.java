//final class can't be inherited
final class A
{
  final void show()
  {
     System.out.print("hello from A");
  }
}

class B extends A            //error
{
   void show()
   {
     System.out.println("Hello from B");
   }
}

class Test36
{
  public static void main(String args[])
  {
     A a = new A();
     B b = new B();
     a.show();
     b.show();
  }
}