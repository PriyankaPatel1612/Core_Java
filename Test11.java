class Test11
{
   public static void main(String args[])
   {
      Test11 t = new Test11();
      try{
      t.div(10,2);
      t.div(10,0);
      }catch(ArithmeticException e){
      System.out.println(e);
      }
      System.out.println("Bye");
   }

   void div(int a, int b) throws ArithmeticException
   {
      int c=a/b;
      System.out.println(c);
   }
}