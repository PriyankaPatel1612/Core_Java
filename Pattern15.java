/*Pattern
   E
   E D
   E D C
   E D C B
   E D C B A 
*/

class Pattern15
{
  public static void main(String args[])
  {
     char i,j;
     for(i='E' ; i>='A' ; i--)
     {
        for(j='E' ; j>=i ; j--)
         {
           System.out.print(j + " ");
         }
        System.out.println();
     }
  }
}