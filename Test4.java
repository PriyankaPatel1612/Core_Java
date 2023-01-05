//Program to print summation of all the elements of given array

class Test4
{
  public static void main(String args[])
  {
    int a[] = {10,20,30,40,50},i,sum=0;
    for(i=0 ; i<a.length ; i++)
    {
      sum=sum+a[i];
    }
   System.out.print("summation of all the elemennts is  " + sum );
  }
}