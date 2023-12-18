public class BicycleReg
{
    public static void main(String[] arg)
    {
	Bicycle myBike;
	myBike=new Bicycle("Jon Java");
	//myBike.setOwnerName("Jon Java");
	System.out.println(myBike.getOwnerName()+" owns a bicycle.");
	Bicycle myBike2=new Bicycle("Mahiyat Tanzim");
	//myBike2.setOwnerName("Mahiyat Tanzim");
	System.out.println(myBike2.getOwnerName()+" owns a bicycle.");
    }
}