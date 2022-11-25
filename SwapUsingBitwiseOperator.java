// Swapping between two no.s by using bitwise operator

class SwapUsingBitwiseOperator
{
   public static void main(String args[])
     {
      int a=10, b=5;
      System.out.println("Before swapping a = " + a + " b = " + b);
      a=a^b;                //10(1010)^5(0101)=15(1111)
      b=a^b;                //15(1111)^5(0101)=10(1010)
      a=a^b;                //15(1111)^10(1010)=5(0101)
      System.out.println("After swapping a = " + a + " b = " + b);
      }
}