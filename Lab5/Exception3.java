import java.util.*;

class Exception3
{
    static void printDiamond(int n)
    {
	int i,j,m,k;
	char[][] arr=new char[100][100];
	m=(n-1)/2;
        for(i=0;i<=m;i++)
        {
            for(j=m-i;j<=m+i;j++)
            {
                arr[i][j]='*';
            }

            for(j=0;j<m-i;j++)
            {
                arr[i][j]=' ';
            }

            for(j=m+i+1;j<n;j++)
            {
                arr[i][j]=' ';
            }
        }

        for(i=m;i<n;i++)
        {
            k=i-m;

            for(j=k;j<=(n-1)-k;j++)
            {
                arr[i][j]='*';
            }

            for(j=0;j<k;j++)
            {
                arr[i][j]=' ';
            }

            for(j=n-k;j<n;j++)
            {
                arr[i][j]=' ';
            }
        }
	for(i=0;i<n;i++)
	{
	    for(j=0;j<n;j++)
	    {
		System.out.print(arr[i][j]);
	    }
	    System.out.print("\n");
	}
    }

    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	try
	{
	    assert(n>0);
	    printDiamond(n);
	}
	catch(AssertionError e)
	{
	    System.out.println("AssertionError is captured: Size should be greater than 0.");
	}
    }
}