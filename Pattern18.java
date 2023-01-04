/*Pattern
  E D C B A
  E D C B
  E D C
  E D
  E
*/

class Pattern18
{
  public static void main(String args[])
  {
     char i,j;
     for(i='A' ; i<='E' ; i++)
     {
        for(j='E' ; j>=i ; j--)
         {
           System.out.print(j + " ");
         }
        System.out.println();
     }
  }
}