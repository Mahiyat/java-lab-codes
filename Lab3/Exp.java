class Exp
{
    String stmp="Mahiyat Tanzim";
    public String extract()
    {
	String stmp1=stmp.substring(0,stmp.indexOf(" "));
	stmp=stmp.substring(stmp.indexOf(" ")+1,stmp.length());
	return stmp1;
    }

    public static void main(String[] args)
    {
	String s1,s2;
	s1=extract();
	s2=extract();
	System.out.println("First Name: "+s1);
	System.out.println("Last Name: "+s2);
    }
}