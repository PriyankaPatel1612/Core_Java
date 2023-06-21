// if variable is declared as final then it should be intialized in declaration or int constructor
class Test33
{
   public static void main(String args[])
   {
      A a = new A();
      a.show();
   }
}

class A
{
   final int a=10;
   void show()
   {
      a++;     //error
      System.out.println(a);
   }
}