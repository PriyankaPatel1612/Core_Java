import javax.xml.transform.Source;

public class Test2 {
    int a=10;
    public static void main(String[] args) {
        Test2 t = new Test2();
        System.out.println(t.a);
        System.out.println(t);  //toString() automatically called 
        System.out.println(t.hashCode());  //hashCode() called
    }
}
