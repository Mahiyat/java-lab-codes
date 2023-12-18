import java.time.*;

public class days
{
    public static void main(String[] args)
    {
	int n;
	n=Integer.parseInt(args[0]);
	LocalDate ld=LocalDate.now();
	ld=ld.plusDays(n);
	System.out.println("The weekday is "+ld.getDayOfWeek()+".");
    }
}