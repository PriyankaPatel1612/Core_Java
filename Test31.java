//Method overriding

class A
{
   void show()
   {
     System.out.println("Hello from A");
   }
}

class B extends A
{
   void show()
   {
      System.out.println("Hello from B");
   }
}

class Test31
{
   public static void main(String args[])
   {
       A a = new A();
       B b = new B();
       a.show();
       b.show();
   }
}