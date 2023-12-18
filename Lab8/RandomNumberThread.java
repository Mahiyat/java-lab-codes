import java.util.Random;

class A extends Thread
{
    public void run()
    {
	Random r = new Random();
	int i;
	for(i=0;i<10;i++)
	{
	    int rd=r.nextInt(100);
	    System.out.println("Random generated number: "+rd);
	    if(rd%2==0)
	    {
		B bthread=new B(rd);
		bthread.start();
	    }
	    else
	    {
		C cthread=new C(rd);
		cthread.start();
	    }
	    try
	    {
		Thread.sleep(1000);
	    }
	    catch(Exception e)
	    {
		System.out.println(e);
	    }
	}
    }
}

class B extends Thread
{
    private int num;
    public B(int n)
    {
	num=n;
    }
    public void run()
    {
	System.out.println("Square of the generated number, "+num+": "+(num*num));
    }
}

class C extends Thread
{
    private int num;
    public C(int n)
    {
	num=n;
    }
    public void run()
    {
	System.out.println("Cube of the generated number, "+num+": "+(num*num*num));
    }
}

public class RandomNumberThread
{
    public static void main(String[] args)
    {
	A th=new A();
	th.start();
    }
}