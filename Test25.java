class Test25
{
   public static void main(String args[])
   {
      String str[] = {"devas","indore", "bhopal" ,"india","indonesia", "ujjain","dhar","bhind"}; 
      for(int i=0 ; i<str.length-1 ; i++)
      {
         for(int j=i+1 ; j<str.length ; j++)
         {
            if(str[i].compareTo(str[j])>0)
            {
            String temp;
            temp=str[i];
            str[i]=str[j];
            str[j]=temp;
            }
         }
      }
      for(String s : str)
      {
         System.out.println(s);
      }
   }
}