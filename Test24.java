//print elements contains "in"
class Test24
{
   public static void main(String args[])
   {
      String str[] = {"india","indonesia","indore", "bhopal" ,"devas", "ujjain","dhar","bhind"};
      for(int i=0 ; i<str.length ; i++)
      {
         if(str[i].indexOf("in")>=0)
         {
            System.out.println(str[i] + "");
         }
      }
   }
}