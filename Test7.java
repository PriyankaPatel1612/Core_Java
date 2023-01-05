//Program to print maximum value given in array

class Test7
{
  public static void main(String args[])
  {
    int a[] = {50,60,40,70,20,10,100,30,80,90},max,i;
    max=a[0];
    for(i=1 ; i<a.length ; i++)
    {
      if (max<a[i])
      {
        max=a[i];
      }
    }
   System.out.print("maximum value in array is " + max);
  } 
}

