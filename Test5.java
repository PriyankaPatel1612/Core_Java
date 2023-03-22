//char charAt(int index) 
// return char at index
//str.charAt()

class Test5
{
    public static void main(String args[])
    {       
         String str1 = new String("Hello");
         System.out.println(str1.charAt(0));
         for(int i=0 ; i<str1.length() ; i++)
         {
              System.out.print(str1.charAt(i));
         }
    }
}