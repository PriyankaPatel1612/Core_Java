class Concatenation
{
    public static void main(String args[])
     {
         int    a=10, b=20;
         System.out.println("The value of a is "+ a + " and the value of  b is " + b );    //The value of a is 10 and the value of  b is 20
         System.out.println(a + b + "hello" );             //30hello
         System.out.println(a + "hello" + b);              //10hello20
         System.out.println("hello" + a + b );             //hello1020
         System.out.println("hello" + (a + b));            //hello30
      }
}