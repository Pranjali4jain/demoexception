//how to create multithreadad application
class Mythread67 extends Thread
{
    public void run()
    {
       for (int i=0; i<10; i++) {
           system .out.println("MYthread67"+i);
       }
    }
}
public class DemoException {
    public static void main(string[] args){
        Mythread67 obj = new Mythread67();
        obj.start();
        for (int i = 0; i < 10; i++)
        {
            system.out.println("Main Thread"+i);
        }
    }

}
