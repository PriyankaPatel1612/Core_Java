//accessing vari.

public class Test4 {
    int a,b,c;
    String branch;
    int age;
    public static void main(String[] args) {
        
        Test4 t = new Test4();
        Test4 t2 = new Test4();
        Test4 priya = new Test4();
        Test4 prachi = new Test4();

        t.a=10;
        t.b=20;
        t.c=30;

        t2.a=40;
        t2.b=50;
        t2.c=60;

        priya.branch="CSE";
        priya.age=19;

        prachi.branch="ME";
        prachi.age=18;

        // System.out.println(a);         //error
        System.out.println(t.a +" "+ t.b +" "+ t.c);
        System.out.println(t2.a +" "+ t2.b +" "+ t2.c);
        System.out.println(priya.branch +" "+ priya.age);
        System.out.println(prachi.branch +" "+ prachi.age);
    }
}
