public class quadratic
{
    public static void main(String[] args)
    {
	double a,b,c,d,x1,x2;
	a=Double.parseDouble(args[0]);
	b=Double.parseDouble(args[1]);
	c=Double.parseDouble(args[2]);
	d=b*b-4*a*c;
	d=Math.sqrt(d);
	x1=(-b+d)/(2*a);
	x2=(-b-d)/(2*a);
	System.out.println("Root1: "+x1);
	System.out.println("Root2: "+x2);
    }
}