/*Pattern
   E
   D D
   C C C
   B B B B
   A A A A A 
*/

class Pattern16
{
  public static void main(String args[])
  {
     char i,j;
     for(i='E' ; i>='A' ; i--)
     {
        for(j='E' ; j>=i ; j--)
         {
           System.out.print(i + " ");
         }
        System.out.println();
     }
  }
}