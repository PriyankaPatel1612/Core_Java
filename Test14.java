//var args(variable arguments)
public class Test14 {
    public static void main(String[] args) {
        Test14 obj = new Test14();
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
