//Parameterized constructor

public class Test11 {
    int a,b,c;
    public static void main(String[] args) {
        Test11 obj1 = new Test11(10,11,12);
        Test11 obj2 = new Test11(100,200,300);
        obj1.show();
        obj2.show();
        
    }

    Test11(int x, int y, int z)
    {
        a=x;
        b=y;
        c=z;
    }

    // Test11()
    // {
    //     System.out.println("this is needed because we defined parameterized constructor");
    // }

    void show()
    {
        System.out.println(a + " " + b + " " + c);
    }
}
