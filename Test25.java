class Test25
{
   public static void main(String args[])
   {
      Test1 t1 = new Test1();
      Test2 t2 = new Test2();

      t1.display();
      t1.show();

      t2.display();
      t2.show();
   }
   
   void display()
   {
      System.out.println("Hello from test25");
   }
}

class Test1 extends Test25
{
   void show()
   {
     System.out.println("Hello from test1");
   }
}

class Test2 extends Test25
{
   void show()
   {
      System.out.println("Hello from test2");
   }
}