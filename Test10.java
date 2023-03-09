//Binary Search

import java.util.Scanner;
class Test10
{
     public static void main(String args[])
     {
          //elements should be sorted
          int arr[] = {10,20,30,40,50,60,70,80,90};
          int low=0, high=arr.length-1, mid, n;
          boolean f=false;
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the number to search: ");
          n=sc.nextInt();
          while(low<=high)
          {
               mid=(low+high)/2;
               if(arr[mid]==n)
               {
                    f=true;
                    break;
               }
               else if(n>arr[mid])
               {
                    low=mid+1;
               }
               else{
                    high=mid-1;
               }
          }
         if(f)
         {
              System.out.println("Element exist!");  
         }else{
              System.out.println("Element not exist!");
         }      
     }
}