//WAP to perform swapping between two no.s without using third variable

class SwapUsingTwoVar
{
   public static void main(String args[])
    {
       int a=10, b=20;
       System.out.println("Before swapping a = " + a + " b = " +b);
       a=a+b;
       b=a-b;
       a=a-b;
       /*we can also do this
       b=a+b;
       a=b-a;
       b=b-a;
       */
       System.out.println("After swapping a = " + a + " b = " +b);
     }
}