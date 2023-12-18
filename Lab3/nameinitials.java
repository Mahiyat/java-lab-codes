import java.util.Scanner;

class nameinitials
{
    public static void main(String args[])
    {
	Scanner sc=new Scanner(System.in);
	String s=new String();
	String first,middle,last;
	System.out.print("Enter your full name: ");
	s=sc.nextLine();
	first=s.substring(0,s.indexOf(" "));
	s=s.substring(s.indexOf(" ")+1,s.length());
	middle=s.substring(0,s.indexOf(" "));
	last=s.substring(s.indexOf(" ")+1,s.length());
	//System.out.println(s);
	System.out.println("Abbreviation of your name is "+first.charAt(0)+middle.charAt(0)+last.charAt(0)+".");
    }
}