//compareTo()  method
class Test4
{
    public static void main(String args[])
    {
         String str1 = new String("Hello");
         String str2 = new String ("Hello");
         String str3 = new String ("HelloIndore");
         String str4 = new String ("hello");
         String str5 = new String ("Indore");
 
         //int compareTo(String)

         int x=str1.compareTo(str2);
         System.out.println(x);

         int a=str1.compareTo(str3);
         System.out.println(a);

         int b=str1.compareTo(str4);
         System.out.println(b);

         int c=str1.compareTo(str5);
         System.out.println(c);

         int y=str1.compareToIgnoreCase(str2);
         System.out.println(y);
 
        int z=str1.compareToIgnoreCase(str3);
         System.out.println(z);       

        int p=str1.compareToIgnoreCase(str4);
         System.out.println(p);  

        int q=str1.compareToIgnoreCase(str5);
         System.out.println(q);  
 
   
    }
}