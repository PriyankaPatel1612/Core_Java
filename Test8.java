//Program to find out the given element exist in the given array or not

class Test8
{
  public static void main(String args[])
  {
    int a[] = {50,60,40,70,20,10,100,30,80,90},value,i;
    boolean f = false;
    value=90;
    for(i=0 ; i<a.length ; i++)
    {
      if(value==a[i])
      {
        f=true;
        break;
       }
    }
    if(f)
    {
      System.out.print("Element exist!!");
    }
    else
       {
         System.out.print("Element not exist");
       }
  } 
}

