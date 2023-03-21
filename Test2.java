//Pool memory & Shared memory concept
class Test2
{
    public static void main(String args[])
    {
         //Pool memory concept
         String str1 = new String("Hello");
         System.out.println(str1.hashCode());
         System.out.println("Hello".hashCode());

         String str2 = new String("Hello");
         System.out.println(str2.hashCode());
         System.out.println("Hello".hashCode()); 
         

         //Shared memory concept
         String str3 = "Hello";             //reference can hold object. str3 doestn't have memory it is pointing Hello.
         System.out.println(str3.hashCode());
         System.out.println("Hello".hashCode());
       
    }
}