class Plane{
	private String Á¦ÀÛÀÚ;
	private String ¸ğµ¨;
	private int ½Â°´;
	private static int planes = 0;
	public Plane()
	{
		this.Á¦ÀÛÀÚ="¿¡¾î¹ö½º";
		this.¸ğµ¨="A380";
		this.½Â°´=500;
		planes++;
	}
	public Plane(String Á¦,String ¸ğ, int ½Â)
	{
		this.Á¦ÀÛÀÚ=Á¦;
		this.¸ğµ¨=¸ğ;
		this.½Â°´=½Â;
		planes++;
	}
	public String getÁ¦ÀÛÀÚ()
	{
		return this.Á¦ÀÛÀÚ;
	}
	public String get¸ğµ¨()
	{
		return this.¸ğµ¨;
	}
	public int get½Â°´()
	{
		return this.½Â°´;
	}
	public static int getPlanes()
	{
		return planes;
	}
	public void setPlane(String ¸ğ,int ½Â)
	{
		this.¸ğµ¨=¸ğ;
		this.½Â°´=½Â;		
	}
}
public class PlaneTest {
	public static void main(String[] args) {
		Plane plane1=new Plane();
		Plane plane2=new Plane("¹Úº´¿õ","ak47",500);
		
		System.out.println(plane1.getÁ¦ÀÛÀÚ()+" "+plane1.get¸ğµ¨()+" "+plane1.get½Â°´());
		plane2.setPlane("Áö´Ï", 200);
		System.out.println(plane2.getÁ¦ÀÛÀÚ()+" "+plane2.get¸ğµ¨()+" "+plane2.get½Â°´());
		System.out.println("Á¦ÀÛµÈ ºñÇà±â ¼ö : "+Plane.getPlanes());
	}
}
