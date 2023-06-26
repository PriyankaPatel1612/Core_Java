interface First
{
  void show();
}

interface Second 
{
  void display();
}

class A
{
  void add()
  {
     System.out.println("Hello from A");
  }

  public void show()
  {
     System.out.println("Hello from show");
  }

  public void display()
  {
     System.out.println("Hello from display");
  }
}

class Test40 extends A implements First,Second
{
  public static void main(String args[])
  {
    A a = new A();
    a.show();
    a.display();
  }
}