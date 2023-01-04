/*Pattern
  A
  A B 
  A B C 
  A B C D 
  A B C D E
*/

class Pattern13
{
  public static void main(String args[])
  {
    char i,j;
    for(i='A' ; i <='E' ; i++)
    {
       for(j='A' ; j<=i ; j++)
       {
         System.out.print(j + " ");
        }
        System.out.println();
     }
  }
}