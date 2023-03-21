
//Return by value
import java.util.Scanner;
public class Test8 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a: ");
       int a=sc.nextInt();
       System.out.print("Enter b: ");
       int b=sc.nextInt();
       Test8 obj = new Test8();
       int c=obj.add(a,b);
       System.out.println(c);
    }
    
    int add(int a, int b)
    {
        int c=a+b;
        return (c);
    }
}
