//Right Shift Operator for negative numbers example 

class BitwiseOperators7
{
   public static void main(String args[])
    {
       int a =-11>>2;
       System.out.println(a);
     }
}

/*
 how it works?
 
example- a=-11>>2;
first find the 1's and 2's complement of that no.
11(0000 1011)  
1's =1111  0100 
2's =1111  0101
right shifted by 2(remove last two no.s  and add two one's (11) on the first)
11 1111 01 
1's = 00 0000 10 = 2
2+1 =3 = -3(with negative sign)

we can also do this
example-  -11>>2
x/2power n
x=-11, n=2
x/2power n = -11/4 = 2(if not fully divide then add 1 with -ive sign) = -(2+1) = -3 
answer: -3

example-2 -100>>2
x=-100, n=2
x/2power n = 100/4 = 25(if fully divide then only apply negative sign)= -25
answer: -25 
}
*/
