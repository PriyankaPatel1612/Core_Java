class Test23
{
   public static void main(String args[])
   {
      Test23 t1 = new Test23();
      Test t2 = new Test();
      t1.show();
      t2.display();
      t2.show();
   }

    void show()
      {
         System.out.println("Hello from show");
      }
}

class Test extends Test23
{
  void display()
  {
     System.out.println("Hello from display");
  }
}