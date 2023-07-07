class Test1
{
   public static void main(String args[])
   {
       Thread t = Thread.currentThread();
       System.out.println(t);
       t.setName("My thread");
       System.out.println(t);
       t.getName();
       t.setPriority(10);
       System.out.println(t);
       t.isAlive() ;
       try
       {
          for(int i=1 ; i<=5 ; i++)
          {
              System.out.println(i);
              t.sleep(1000);
          }
       }
      catch(InterruptedException e)
      {
           System.out.println(e);
      }
   }
}