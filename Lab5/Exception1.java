import java.util.*;

class Exception1
{
    public static void main(String[] args)
    {
	try
	{
	    Scanner scanner = new Scanner(System.in);
	    int divisor=scanner.nextInt();
	    System.out.println(3/divisor);
	}

	catch(ArithmeticException e)
	{
	    System.out.println("Exception caught by this program: Divisor was 0.");
	    //System.out.printf("Caught runtime exception = %s\n",e);
	    //System.out.println(3/0);
	}

	catch(InputMismatchException nfe)
	{
	    System.out.println("Exception caught by this program: Enter numeric value.");
	    //System.out.printf("Caught runtime exception = %s\n",e);
	    //System.out.println(3/0);
	}
	System.out.println("After exception.");
    }
}