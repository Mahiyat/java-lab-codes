import java.io.*;
import java.util.*;

class FileReadWithLineNumber
{
    public static void main(String args[])
    {
	try
	{
	    FileInputStream f=new FileInputStream("Line Input.txt");
	    Scanner sc=new Scanner(f);
	    int it=1;
	    while(sc.hasNextLine())
	    {
		System.out.println("Line "+it+": "+sc.nextLine());
		it++;
	    }
	    sc.close();
	}
	catch(Exception e)
	{
	    System.out.println(e);
	}
    }
}
