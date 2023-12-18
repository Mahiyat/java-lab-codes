import java.util.*;

class Student
{
    public final int NUM_OF_TESTS=3;
    public String name;
    public int[] test=new int[3];
    public String courseGrade;
    public Student()
    {
	//courseGrade='';
    }
    public Student(String n)
    {
	name=n;
    }
    public String getCourseGrade()
    {
	return "NULL";
    }
    public String getName()
    {
	return name;
    }
    public int getTestScore()
    {
	return (int)((test[0]+test[1]+test[2])/NUM_OF_TESTS);
    }
    public void setName(String n)
    {
	name=n;
    }
    public void setTestScore(int a, int b, int c)
    {
	test[0]=a;
	test[1]=b;
	test[2]=c;
    } 
}

class UnderGraduateStudent extends Student
{
    public UnderGraduateStudent()
    {
	super();
    }
    public String getCourseGrade()
    {
	int marks=getTestScore();
	if(marks>=80)courseGrade="A+";
	else if(marks>=70)courseGrade="A";
	else if(marks>=60)courseGrade="B";
	else if(marks>=50)courseGrade="C";
	else if(marks>=40)courseGrade="D";
	else courseGrade="F";
	return courseGrade;
    }
}

class GraduateStudent extends Student
{
    public GraduateStudent()
    {
	super();
    }
    public String getCourseGrade()
    {
	int marks=getTestScore();
	if(marks>=90)courseGrade="A+";
	else if(marks>=80)courseGrade="A";
	else if(marks>=70)courseGrade="B";
	else if(marks>=60)courseGrade="C";
	else if(marks>=50)courseGrade="D";
	else courseGrade="F";
	return courseGrade;
    }
}

public class grading
{
    public static void main(String[] args)
    {
	Student[] students=new Student[40];
	int i,n,a,b,c;
	String sn,ch;
        //char ch;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number of students: ");
	n=sc.nextInt();
	System.out.println(" ");
	for(i=0;i<n;i++)
	{
	    System.out.println("Enter the type of students:");
	    System.out.println("Press U for Undergraduate Student");
	    System.out.println("Press G for Graduate Student");
	    ch=sc.next();
	    if(ch.equals("U"))students[i]=new UnderGraduateStudent();
	    else students[i]=new GraduateStudent();
	    System.out.print("Enter student name: ");
	    sn=sc.next();
	    System.out.print("Enter the test scores: ");
	    a=sc.nextInt();
	    b=sc.nextInt();
	    c=sc.nextInt();
	    students[i].setName(sn);
	    students[i].setTestScore(a,b,c);
	    System.out.println(" ");
	}
	for(i=0;i<n;i++)
	{
	    System.out.println("Name: "+students[i].getName());
	    System.out.println("Grade: "+students[i].getCourseGrade());
	    System.out.println(" ");
        }
    }
}