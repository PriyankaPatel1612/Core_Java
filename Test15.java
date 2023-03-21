//if we want to take many arguments
public class Test15 {
    public static void main(String[] args) 
    {
        Test15 obj = new Test15();
        obj.add(100, 10,20,30,40,50);
    }

    //void add(int ...a,int x)  this is invalid ellipsis must be the last perimeter
    void add(int x, int ...a)
    {
        int sum=0;
        for(int i=0 ;  i<a.length ; i++)
        {
             sum=sum+a[i];
        }
        System.out.println(sum*x);
   }
}
