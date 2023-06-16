class Test21
{
  public static void main(String args[])
  {
    int j=0;
    String str[] = {"india","indonesia","indore", "bhopal" ,"devas", "ujjain","dhar"};
    for(int i=0 ; i<str.length ; i++)
    {
       while(j!=-1)
       {
         j=str[i].indexOf("ind",j);
         if(j>=0)
         { 
            System.out.println(str[i]);
            j++;
         }
       }
    }
  }
}