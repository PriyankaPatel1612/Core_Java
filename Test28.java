//behaviours of constructors in inheritance
when the child class object is created then the first it will call its parent constructor then child constructor is called
class A
{
   A()
   {
      System.out.println("Hello from A");
   }
}

class B extends A
{
   B()
   {
      System.out.print("Hello from B");
   }
}

class Test28
{
   public static void main(String args[])
   {
      A a1 = new A();
      B b1 = new B();
   }
}

