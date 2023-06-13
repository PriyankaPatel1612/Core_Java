//count no. of vowels and consonants
import java.util.Scanner;
class Test14
{
 public static void main(String args[])
 {
   int v_count=0, c_count=0;
   Scanner sc = new Scanner(System.in);
   String str;
   System.out.println("Enter the string: ");
   str=sc.next();
   for(int i=0 ; i<str.length() ; i++)
  {
    if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' || str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U')
    { v_count++;}
    else
    {c_count++;}
  }
  System.out.print("vowels= " + v_count + " consonants=" +c_count);
 }
}