public class Test5 {
    int a,b,c;

    void show()
    {
        System.out.println(a +" "+ b +" "+ c);
    }
    public static void main(String[] args) {
        Test5 t1 = new Test5();
        Test5 t2 = new Test5();

        t1.a=10;
        t1.b=20;
        t1.c=30;

        t2.a=40;
        t2.b=50;
        t2.c=60;
        
        t1.show();
        t2.show();
    }
    
}
