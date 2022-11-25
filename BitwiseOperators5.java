//Left Shift Operator example (<<) 

class BitwiseOperators5
{
   public static void main(String args[])
    {
       int a=8<<2;
       System.out.println(a);   //output: 32
     }
}


/*
 #  how it works?
  binary of 8 (1000)
  left shifted by 2 (add two zeroes on the right because left shifted by 2)
  1000 00 which is the binary of 32
  answer is 32

  # we can also do this 
  x*2(power n) 
  for example 8<<2
  x=8, n=2
  x*2power n = 8*2*2= 32

 # Another option to do
 example 8<<2 
 8+8=16+16=32
 example- 6<<3
 15+15=30+30=60+60=120
 example 9<<4
 9+9=18+18=36+36=72+72=144
*/