
//var args(variable arguments)
public class Test14 {
     public static void main(String[] args) {
         Test14 obj = new Test14();
          //we can values as an argument, ...a (ellipsis a) take arguments and then used as array elements but the difference is that after the summation of elements it releases memory.
         obj.add(10,20,30,40,50);
         obj.add(1,2,3,4,5);
     }
     
     void add(int ...a)
    {
         int sum=0;
         for(int i=0 ;  i<a.length ; i++)
         {
              sum=sum+a[i];
         }
         System.out.println(sum);
    }
 }
