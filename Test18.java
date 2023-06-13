//int indexOf(String)
class Test18
{
  public static void main(String args[])
  {
    char ch;
    String str = new String("Welcome to the programming world welcome");
    System.out.println(str.indexOf("World"));
    System.out.println(str.indexOf("welcome"));
    System.out.println(str.indexOf("programming"));
    System.out.println(str.indexOf("Welcome"));
    System.out.println(str.indexOf("co",1));
    for(int i=0 ; i<str.length() ; i++)
    {
       ch=str.charAt(i);
       System.out.print(str.indexOf(ch) + " ");
    }
  }
}