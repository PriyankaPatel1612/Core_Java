public class Test6 {
    int a,b,c;

    void show()
    {
        System.out.println(a +" "+ b +" "+ c);
    }

    void setData(int x, int y, int z)
    {
        a=x;
        b=y;
        c=z;
    }
    public static void main(String[] args) {

        Test6 t1 = new Test6();
        Test6 t2 = new Test6();
        t1.setData(10,20,30);
        t1.show();

        t2.setData(100,200,300);
        t2.show();

    }
    
}
