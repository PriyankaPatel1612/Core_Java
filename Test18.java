class Test18
{
   static int a=10;
   static void show()
   {
      System.out.println(a+5);
   }
   static
   {
      a=a*15;
      System.out.println(a);
   }
   public static void main(String args[])
   {
      System.out.println("Hello");
      System.out.println(a);
      Test18.show();
      System.out.println(Test18.a);
   }
}