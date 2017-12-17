class Person{
	String name;
	String address;
	String phonenumber;
	
	public Person() {
		name = null;
		address = null;
		phonenumber = null;
	}
	public Person(String n, String a, String p) {
		this.name = n;
		this.address = a;
		this.phonenumber=p;
	}
	public void setName(String n) {this.name=n;}
	public void setAddress(String a) {this.address=a;}
	public void setPhonenumber(String p) {this.phonenumber=p;}
	public String getName() {return this.name;}
	public String getaddress() {return this.address;}
	public String getphonenumber() {return this.phonenumber;}
}
class Customer extends Person{
	String id;
	int mileage;
	public Customer() {
		id = null;
		mileage = 0;
	}
	public Customer(String n, String a, String p, String i,int m) {
		super.name = n;
		super.address=a;
		super.phonenumber=p;
		this.id=i;
		this.mileage=m;
	}
	public void setId(String i) {this.id=i;}
	public void setMileage(int m) {this.mileage = m;}
	public String getId() {return this.id;}
	public int getMileage() {return this.mileage;}
	public void show()
	{
		System.out.println("이름 : "+ getName());
		System.out.println("주소 : "+ getaddress());
		System.out.println("전화번호 : "+getphonenumber());
		System.out.println("고객번호 : "+this.id);
		System.out.println("마일리지 : "+this.mileage);
	}
}
public class PersonTest{
	public static void main(String[]args) {
		Customer c = new Customer("박혜진","대전","010-8310-9027","201702020",100);
		c.show();
	}
}
