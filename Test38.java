interface First         //by default public abstract is written
{
   void show();
}

class A implements First
{
   public void show()
   {
      System.out.println("Hello from A");
   }
}

class Test38
{
   public static void main(String args[])
   {
        A a = new A();
        a.show();
   }
}