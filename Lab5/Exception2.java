class Exception2
{
    public static void main(String[] args)
    {
	int[] a=new int[10];
	int i;
	for(i=0;i<10;i++)
	{
	    a[i]=i;
	}
	try
	{
	    for(i=0;i<=10;i++)
	    {
		System.out.println(a[i]);
	    }
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
	    System.out.println("Caught ArrayIndexOutOfBoundsException: "+e.getMessage());
	}
    }
}