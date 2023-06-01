//write a program to print all the charcters of given string in uppercase without using toUpperCase()

import java.util.Scanner;
class Test8
{
     public static void main(String args[])
     {
       String str = new String("This Is String");
       for(int i=0 ; i<str.length() ; i++)
       {
            if(str.charAt(i)>=97   &&   str.charAt(i)<=122)
           {             
                System.out.print((char)(str.charAt(i)-32));
           }else{
                System.out.print(str.charAt(i));
           }
       }
     }
}