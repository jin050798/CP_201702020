class Plane{
	private String ������;
	private String ��;
	private int �°�;
	private static int planes = 0;
	public Plane()
	{
		this.������="�������";
		this.��="A380";
		this.�°�=500;
		planes++;
	}
	public Plane(String ��,String ��, int ��)
	{
		this.������=��;
		this.��=��;
		this.�°�=��;
		planes++;
	}
	public String get������()
	{
		return this.������;
	}
	public String get��()
	{
		return this.��;
	}
	public int get�°�()
	{
		return this.�°�;
	}
	public static int getPlanes()
	{
		return planes;
	}
	public void setPlane(String ��,int ��)
	{
		this.��=��;
		this.�°�=��;		
	}
}
public class PlaneTest {
	public static void main(String[] args) {
		Plane plane1=new Plane();
		Plane plane2=new Plane("�ں���","ak47",500);
		
		System.out.println(plane1.get������()+" "+plane1.get��()+" "+plane1.get�°�());
		plane2.setPlane("����", 200);
		System.out.println(plane2.get������()+" "+plane2.get��()+" "+plane2.get�°�());
		System.out.println("���۵� ����� �� : "+Plane.getPlanes());
	}
}
