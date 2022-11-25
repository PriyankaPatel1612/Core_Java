//WAP to perform swapping between two no.s with using third variable

class SwapUsingThirdVar
{
  public static void main(String args[])
   {
      int a=10, b=20, c;
      System.out.println("Before swapping a = " + a + " b = " + b);
       c=a;
       a=b;
       b=c;
       /* or we can also do this
       c=b;
       b=a;
       a=c;
       */
      System.out.println("After swapping a = " + a + " b = " + b);
    }
}


