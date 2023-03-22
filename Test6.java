//write a program to count no. of spaces and no. of other characters in the given string ("this is a  class of java").

class Test6
{
     public static void main(String args[])
     {
          String str = new String("this is a  class of java");
          int s=0, c=0;
          for(int i=0 ; i<str.length() ;  i++)
          {
               if((str.charAt(i))==' ')
               s++;
               else
               c++;
          } 
          System.out.println("spaces = " + s);
          System.out.println("characters = " + c);
          System.out.println(' ');
     }
}