interface First         //by default public abstract is written
{
    void show();
}

interface Second
{
   void display();
}

class A implements First,Second
{
   public void show()
   {
      System.out.println("Hello from show");
   }

    public void display()
   {
      System.out.println("Hello from display");
   }
}

class Test39
{
   public static void main(String args[])
   {
        A a = new A();
        a.show();
        a.display();
   }
}