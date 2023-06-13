//int indexOf(char ch)
class Test16
{
 public static void main(String args[])
 {
   String str = new String("Hello");
   char ch;
   System.out.println(str.indexOf('i'));
   for(int i=0 ; i<str.length() ; i++)
   {
     ch=str.charAt(i);
     System.out.println(str.indexOf(ch));
   }
 }
}