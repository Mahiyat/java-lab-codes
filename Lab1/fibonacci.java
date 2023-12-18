public class fibonacci
{
    public static int recfib(int num)
    {
	if(num==1||num==2)return 1;
        return (recfib(num-1)+recfib(num-2));
    }
    public static void main(String[] args)
    {
	int n,f1,i;
	int[] f2=new int[100];
	n=Integer.parseInt(args[0]);
	f1=recfib(n);
	f2[0]=1;
	f2[1]=1;
	for(i=2;i<=n;i++)
	{
	    f2[i]=f2[i-1]+f2[i-2];
	}
	System.out.println("Recursive Fibonacci of "+n+" is "+f1);
	System.out.println("Nonrecursive Fibonacci of "+n+" is "+f2[n-1]);
    }
}