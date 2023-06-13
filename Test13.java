class Test13
{
  public static void main(String args[])
  {
    int s_count=0, ch_count=0;
    String str = new String("Hello welcome to my world");
    for(int i=0 ; i<str.length() ; i++)
    {
      if(str.charAt(i)==' ')
      s_count++;
      else
      ch_count++;
    }
      System.out.print("spaces=" + s_count + " character= " + ch_count);
  }
}
