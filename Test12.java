//Copy Constructor
public class Test12 {
    int a,b,c;
    public static void main(String[] args) {
        Test12 obj1 =  new Test12(10,20,30);
        Test12 obj2 =  new Test12(obj1);
        Test12 obj3 =  new Test12(obj2);
        obj1.show();
        obj2.show();
        obj3.show();
    }

    Test12(int x, int y, int z)
    {
        a=x;
        b=y;
        c=z;
    }

    Test12(Test12 t)
    {
        a=t.a;
        b=t.b;
        c=t.c;
    }

    void show()
    {
        System.out.println(a+" "+b+" "+c);
    }

}
