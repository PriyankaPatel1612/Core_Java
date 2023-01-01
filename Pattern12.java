/*Pattern
   1 1 1 1 1
   2 2 2 2
   3 3 3
   4 4
   5
*/

class Pattern12
{
  public static void main(String args[])
  {
     int i,j;
     for(i=1 ; i<=5 ; i++)
     {
        for(j=5 ; j>=i ; j--)
         {
           System.out.print(i + " ");
         }
        System.out.println();
     }
  }
}