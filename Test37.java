//abstract keyword
//we can't create object of abstract class
//it is compulsion that abstract method should be contain in abstract class
//all the abstract method should be implented in child classes
abstract class A
{
   abstract void show();
   void display()
   {
      System.out.print("Hello from A");
   }
}

class B extends A
{
   void show()
   { 
      System.out.println("Hello from B");
   }
}


class Test37
{
   public static void main(String args[])
   {
      B b = new B();
      b.show();
      b.display();
   }
}