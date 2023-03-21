//equals method
class Test3
{
    public static void main(String args[])
    {
         String str1 = new String("Hello");
         String str2 = new String ("Hello");
         String str3 = new String("hello");
 
           //boolean equals(String str)    
          /*if(str1.equals(str2))
         {
             System.out.println("same");
         }else{
             System.out.println("not same");
         }*/

         /*if(str1.equals(str3))
         {
             System.out.println("same");
         }else{
             System.out.println("not same");
         }*/

         //boolean equalsIgnoreCase(String str)
         if(str1.equalsIgnoreCase(str3))
         {
             System.out.println("same");
         }else{
             System.out.println("not same");
         }

    }
}