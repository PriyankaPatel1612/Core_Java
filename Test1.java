public class Test1 {
    //instance variable
    int a=10; 
    public static void main(String[] args) {
        
        //creating object and calling constructor
        Test1 t1 = new Test1();  
        Test1 t2 = new Test1();
        System.out.println(t1.a);   //t1 obj created for a
        System.out.println(t2.a);   //t2 obj created for a
        
        System.out.println(t1.a++);
        System.out.println(t1.a--);
    }
    
}
