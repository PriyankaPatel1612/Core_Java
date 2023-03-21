public class Test7 {
    int a,b,c;

    void show()
    {
        System.out.println(a +" "+ b +" "+ c);
    }

    void setData(int a, int b, int c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public static void main(String[] args) {

        Test7 t1 = new Test7();
        Test7 t2 = new Test7();
        t1.setData(10,20,30);
        t1.show();

        t2.setData(100,200,300);
        t2.show();

    }
    
}
