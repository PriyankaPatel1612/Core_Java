//While loop
// Program to print Reverse of given numbers.

class Loops4
{
   public static void main(String args[])
    { 
      int n=123, r ;
      while(n!=0)
      {
        r=n%10;
        System.out.print(r);
        n/=10;
       }
     }
}

/*
we can also do this
   { 
      int n=123, r, sum=0 ;
      while(n!=0)
      {
        r=n%10;
        sum=sum*10+r;
        n/=10;
       }
      System.out.print(sum);
     }
*/