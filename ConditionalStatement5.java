//Switch case
//Program to check the given character is vowel or consonant using switch case

class ConditionalStatement5
{
  public static void main(String args[])
   {
      //This program is valid only for a to z  characters
      char ch='a';
     switch(ch)
    {
     case 'a':  System.out.println("Vowel"); break;
     case 'e':  System.out.println("Vowel"); break;
     case 'i':  System.out.println("Vowel"); break;
     case 'o':  System.out.println("Vowel"); break;
     case 'u':  System.out.println("Vowel"); break;
     default :  System.out.print("Consonant");
     }

      /*  We can also replace that code with this code
       switch(ch)
      {
         case 'a':  
         case 'e':  
         case 'i':  
         case 'o':  
         case 'u':  System.out.println("Vowel"); break;
         default :  System.out.print("Consonant");
       }
       */
   }
} 