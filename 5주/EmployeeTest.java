
class Employee{
	private String name;
	private String phonenumber;
	private int income;
	
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name=n;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String p) {
		phonenumber = p;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int i) {
		income=i;
	}

	}

public class EmployeeTest {

	public static void main(String[] args) {
		Employee myEmployee=new Employee();
		myEmployee.setName("������");
		myEmployee.setPhonenumber("010-8310-9027");
		myEmployee.setIncome(100000);
		
		System.out.println("������ �̸��� "+myEmployee.getName());
		System.out.println("������ ��ȭ��ȣ�� "+myEmployee.getPhonenumber());
		System.out.println("������ "+myEmployee.getIncome()+"����");
		// TODO Auto-generated method stub

	}

}
