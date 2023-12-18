import java.io.*;
import java.util.*;
import java.nio.file.Files;

class FileTest
{
    public static void main(String[] args)
    {
	String s,st;
	System.out.print("Enter the name of the file: ");
	Scanner sc=new Scanner(System.in);
	s=sc.nextLine();
	File f=new File(s);
	try
	{
	    if(f.createNewFile())System.out.println("File did not exist before. New file has been created!");
	    else System.out.println("File already exists!");
	    if(f.canRead())System.out.println("File is readable!");
	    else System.out.println("File is not readable!");
	    if(f.canWrite())System.out.println("File is writeable!");
	    else System.out.println("File is not writeable!");
	    try
	    {
	        st=Files.probeContentType(f.toPath());
	        System.out.println("File type is "+st);
	    }
	    catch(Exception e)
	    {
	        System.out.println("File type is undetectable!");
	    }
	    System.out.println("File length is "+f.length()+" bytes");
	}
	catch(Exception e)
	{
	    System.out.println(e);
	}
    }
}