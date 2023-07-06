class Test2
{
   public static void main(String args[])
   {
      int a=10, b=10, c, d[] = {1,2,3} ;
      try
      {
         c=a/b;
         System.out.println(c);
         System.out.println(d[3]);
      }
      catch(ArithmeticException e)
      {
         System.out.println(e);
      }
      catch(ArrayIndexOutOfBoundsException e)
      {
         System.out.println(e);
      }
      System.out.println("Bye");
   }
}