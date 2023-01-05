//Program to print minimum value given in array

class Test6
{
  public static void main(String args[])
  {
    int a[] = {50,60,40,70,20,10,100,30,80,90},min,i;
    min=a[0];
    for(i=1 ; i<a.length ; i++)
    {
      if (min>a[i])
      {
        min=a[i];
      }
    }
   System.out.print("minimum value in array is " + min);
  } 
}

