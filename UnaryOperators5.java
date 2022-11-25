class UnaryOperators5
{
  public static void main(String args[])
   {
      int a=10,b,c,d;
      b=--a;
      c=b++;
      d=++c;
      a=d--;
      System.out.println(a + " " + b + " " + c + " " + d);         //10 10 10 9
    }
}