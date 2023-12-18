import java.io.*;
import java.util.*;

class FileReadWrite
{
    public static void main(String[] args)
    {
	String s1=args[0],s2=args[1];
	try
	{
	    File f1=new File(s1);
	    File f2=new File(s2);
	    FileOutputStream outFileStream=new FileOutputStream(f2);
	    PrintWriter outStream=new PrintWriter(outFileStream);
	    Scanner sc=new Scanner(f1);
	    while(sc.hasNextLine())
	    {
	        outStream.println(sc.nextLine());
	    }
	    outStream.close();
	    sc.close();
	}
	catch(Exception e)
	{
	    System.out.println(e);
	}
    }
}