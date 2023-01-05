//Program to print summation of array elements using for each loop

class Test5
{
  public static void main(String args[])
  {
    int a[] = {10,20,30,40,50},sum=0;
    for(int i : a)
    {
      sum=sum+i;
    }
   System.out.print("Summation of array elements is " + sum);
  }
}