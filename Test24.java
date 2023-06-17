class Test24
{
   public static void main(String args[])
   {
      Test1 t1 = new Test1();
      Test2 t2 = new Test2();
      t1.show();
      t1.present();
      t2.show();
      t2.display();
      t2.present();
   }

   void present()
   {
      System.out.println("Hello from test24");
   }
}

class Test1 extends Test24
{
   void show()
   {
     System.out.println("Hello from test1");
   }
}

class Test2 extends Test1
{
   void display()
   {
      System.out.println("Hello from test2");
   }
}