
//Constructors
// name of constructor is same as class name
// doesn't have any return type
// we are not allowed to return anything
// three types of Constructors
// default
// no argument
// copy constructor
// there is no class without constructor
// if required then we create constructor otherwise system create default constructor
// we cannot inherit Constructors
// if we want to create an object then it is compulsory to call constructor and to call constructor new keyword is required.

public class Test10 {
    Test10()
    {
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        Test10 obj = new Test10();
    }
    
}
