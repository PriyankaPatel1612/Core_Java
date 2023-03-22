//write a program to count no. of vowels and consonant in given string.
//("this is a class in java") 

class Test7
{
    public static void main(String args[])
    {
         String str = new String("This Is Class In Java");
         int v=0, c=0, i=0;
         do
         {
           switch(str.charAt(i))
           {

             case 'a' : 
             case 'e' :  
             case 'i' :  
             case 'o' :  
             case 'u' :  
             case 'A' :  
             case 'E' :  
             case 'O' :  
             case 'I' :  
             case 'U' :  v++;
             case ' ' : 
             break;
             default :  c++;      
           }
           i++;
          }while(i<str.length());
           System.out.println("vowels = " + v);
           System.out.println("consonants = " + c);



         /*int v=0; int c=0;
         for(int i=0 ; i<str.length() ; i++)
         {
              if((str.charAt(i))=='a' || (str.charAt(i))=='e' || (str.charAt(i))=='i' || (str.charAt(i))=='o' ||           (str.charAt(i))=='u')
               {
                    v++;
               }
              else if((str.charAt(i))==' ')
               {
                continue;
               }
              else
               {
                c++;
               }
             
         }System.out.println("vowels = " + v);
           System.out.println("consonants = " + c);*/
    }
}