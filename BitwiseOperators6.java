//Right Shift Operator example (>>)

class BitwiseOperators6
{
   public static void main(String args[])
    {
        int a=10>>2;
        System.out.println(a);   //2
     }
}

/* 
  #how it works?
  example- 10>>2
  binary of 10 is 1010
  right shifted by 2 (remove the last two no.s because right shifted by 2)
  10 which is 2
  answer: 2

  #we can also do this
  x/2power n
  example- 10>>2
  x=10, n=2
  x/2power n =10/4= 2(integer divide by integer returns integer)

  note: In right shift operator after shifting,  postive no. will remain positive and negative no. will remain negative
