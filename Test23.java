//print elemnts starts with "ind"
class Test23
{
  public static void main(String args[])
  {
    String str[] = {"india","indonesia","indore", "bhopal" ,"devas", "ujjain","dhar"};
    for(int i=0 ; i<str.length ; i++)
      {
         int j=0;
         while(j!=-1)
           {
              j = str[i].indexOf("ind",j);
              if(j>=0)
                {
                     System.out.print(str[i] + " ");
                     j++;
                }
           }
      }
  }
}