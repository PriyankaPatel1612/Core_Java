//final method cannot override
class A
{
  final void show()
  {
     System.out.println("hello from A");
  }
}

class B extends A
{
  void show()     //error
  {
     System.out.println("hello from b");
  }
}

class Test35
{
   public static void main(String args[])
   {
      A a = new A();
      B b = new B();
      a.show();
      b.show();
   }
}