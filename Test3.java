public class Test3 {
    int a=10;
    public static void main(String[] args) {
        Test3 obj1 = new Test3();
        //reference is able to hold and change the value of another object.
        Test3 obj2 = obj1;

        System.out.println(obj1.a);
        System.out.println(obj2.a--);

        System.out.println(obj2.a);
        System.out.println(obj1.a);
  
    }
}
