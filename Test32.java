//reference of parent class can hold the object of child class
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

class C extends A
{
   void show()
   {
      System.out.println("Hello from C");
   }
}

class Test32
{
   public static void main(String args[])
   {
       A a ;
       B b = new B();
       C c = new C();
       a=b;
       a.show();
       b.show();
       a=c;
       a.show();
       c.show();
   }
}