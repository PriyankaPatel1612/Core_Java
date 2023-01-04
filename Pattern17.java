/*Pattern
  A A A A A
  B B B B
  C C C
  D D
  E
*/

class Pattern17
{
  public static void main(String args[])
  {
     char i,j;
     for(i='A' ; i<='E' ; i++)
     {
        for(j='E' ; j>=i ; j--)
         {
           System.out.print(i + " ");
         }
        System.out.println();
     }
  }
}