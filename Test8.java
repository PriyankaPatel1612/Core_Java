//toString()
class Test8
{
   String message;
   Test8(String str)
   {
      message = str;
   }
   public String toString()
   {
      return message;
   }
 
   public static void main(String args[])
   {
     Test8 t1 = new Test8("Hello");
     Test8 t2 = new Test8("World");
     System.out.println(t1);             //s.o.p(t1.toString())
     System.out.println(t2);
   }
}