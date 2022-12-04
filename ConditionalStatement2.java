//Program to check that the given no. is a leap year or not

class ConditionalStatement2
{
  public static void main(String args[])
   {
     int a =2000;
     if(a%400==0)
    {
      System.out.println(a + "  is a leap year.");
     }else if(a%100==0){
      System.out.println(a + " is not a leap year.");
     }else if(a%4==0){
      System.out.println(a + " is a leap year.");
     }else{
      System.out.println(a + " is not a leap year.");
      } 
  }
}