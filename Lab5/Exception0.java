class Exception0
{
    public static void main(String[] args)
    {
	try
	{
	    System.out.println(3/0);
	}
	catch(Exception e)
	{
	    System.out.printf("Caught runtime exception = %s\n",e);
	    System.out.println(3/0);
	}
    }
}
