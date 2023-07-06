//Nested try catch
class Test6
{
   public static void main(String args[])
   {
      int a=10, b=0, c, d[] = {1,2,3} ;
     try
     {
          try
          {
             c=a/b;
             System.out.println(c);
          }
          catch(ArithmeticException e)
          {
             System.out.println(e);
           }
          try
          {
             System.out.println(d[3]);
           }
           catch(ArrayIndexOutOfBoundsException e)
           {
              System.out.println(e);
           }
        }
        catch(Exception e)
       {
          System.out.println(e); 
        }
      System.out.println("Bye");
   }
}
