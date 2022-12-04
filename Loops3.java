//While loop
// Program to print Fibonacci series of numbers(10 elements)

class Loops3
{
   public static void main(String args[])
    { 
      int i=1, a=0, b=1, c;
      System.out.print(a + "\t" + b + "\t" );
      while(i<=8)
       {
         c=a+b;
         System.out.print(c + "\t");
         a=b;
         b=c;
         i++;
        }
     }
}


/*
We can also do this
{ 
      int i=1, a=0, b=1, c, n=10;
      System.out.print(a + "\t" + b + "\t" );
      while(i<=(n-2))
       {
         c=a+b;
         System.out.print(c + "\t");
         a=b;
         b=c;
         i++;
        }
     }
*/

/*
Or, We can also do this
 { 
      int i=1, a=0, b=1, c, n=10;
      while(i<=n)
       {
         c=a+b;
         System.out.print(a + "\t");
         a=b;
         b=c;
         i++;
        }
     }
*/
