//String

class Test1
{
    public static void main(String args[])
    {
         String str = new String("Hello");
         //if we obj in String class then toString() method is not called and hashcode is not printed. it will print the value of string.
         System.out.println(str);                                     //Hello
         System.out.println(str.hashCode());                  //in integer form
         System.out.println(str.length());                       //length of string which is 5
    }
}