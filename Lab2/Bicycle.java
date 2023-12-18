class Bicycle
{
    private String ownerName;
    
    public String getOwnerName()
    {
	return ownerName;
    }

    public void setOwnerName(String name)
    {
	ownerName=name;
    }

    public static void main(String[] arg)
    {
	Bicycle myBike;
	myBike=new Bicycle();
	myBike.setOwnerName("Jon Java");
	System.out.println(myBike.getOwnerName()+" owns a bicycle.");
	Bicycle myBike2=new Bicycle();
	myBike2.setOwnerName("Mahiyat Tanzim");
	System.out.println(myBike2.getOwnerName()+" owns a bicycle.");
    }
}