//int indexOf(char ch, int index)
class Test17
{
  public static void main(String args[])
  {
    String str = new String("Hello World");
    System.out.println(str.indexOf('d', 0));
    char ch;
    for(int i=0 ; i<str.length() ; i++)
    {
       ch=str.charAt(i);
       System.out.print(str.indexOf(ch));
    }
  }
}