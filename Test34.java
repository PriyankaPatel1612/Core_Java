class Test34 {
  public static void main(String args[]) {
    A a1 = new A(10);
    A a2 = new A(10);
    a1.show();
    a2.show();
    }
}

class A {
  final int a ;
  A(int x) {
    a = x;
  }

void show() {
       System.out.println(a);
  } 
}