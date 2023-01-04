/*Pattern
   E E E E E
   D D D D
   C C C
   B B
   A
*/

class Pattern19
{
  public static void main(String args[])
  {
     char i,j;
     for(i='E' ; i>='A' ; i--)
     {
        for(j='A' ; j<=i ; j++)
         {
           System.out.print(i + " ");
         }
        System.out.println();
     }
  }
}