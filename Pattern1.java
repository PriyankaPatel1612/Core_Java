/* 
  Pattern
  11  12  13
  21  22  23
  31  32  33
*/

class Pattern1
{
  public static void main(String args[])
  {
     int i, j;
     for(i=1 ; i<=3 ; i++)
     {
       for(j=1 ; j<=3 ; j++)
        {
          System.out.print(i + "" + j + "\t");
         } 
       System.out.println();
      }
   }
}