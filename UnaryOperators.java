/*
Unary Operators:-
a++ (post increment)
++a (pre increment)
a-- (post decrement)
--a (pre decrement)
*/

class UnaryOperators
{
   public static void main(String args[])
    {
       int a=10, b=10, c=10, d=10;
       a++;
       ++b;
       c--;
       --c;
       System.out.println(a);     //11
       System.out.println(b);     //11
       System.out.println(c);     //8
       System.out.println(d);     //10

       //In post increment first it will initialize and then it will increment
       int x = 10, y, z;
       y = x++;
       System.out.println(x + " " + y); //11 10

       //In pre increment first it will increment then it will initialize
       z = ++y;  
       System.out.println(x + " " + z);   //11 11
     

       //Similarly for post decrement first it will initialize then decrement
       int p=10, q, r;
       q=p--;
       System.out.println(p + " " + q);  //9 10

       //In pre decrement first it will decrement and then initialize
       r=--q;
       System.out.println(p + " " + r);  //9 9
    }
}

