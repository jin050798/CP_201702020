class Student{
	private String name;
	private int number;
	private String major;
	private int year;
	private double grade;
	public String getName() {return name;}
	public int getNumber() {return number;}
	public String getMajor() {return major;}
	public int getYear() {return year;}
	public double getGrade() {return grade;}
	public void setName(String n) {this.name=n;}
	public void setNumber(int nu) {this.number=nu;}
	public void setMajor(String m) {this.major=m;}
	public void setYear(int y) {this.year=y;}
	public void setGrade(double g) {this.grade=g;};
	public Student() {
		setName("박혜진");
		setNumber(0);
		setMajor("컴퓨터공학과");
		setYear(0);
		setGrade(0);
	}
	public Student (String n, int nu,String m,int y, double g) {
		setName(n);
		setNumber(nu);
		setMajor(m);
		setYear(y);
		setGrade(g);
	}
}
class Students extends Student{
	private String club;
	public Students(String n,int nu, String m, int y, double g,String club) {
		super(n,nu,m,y,g);
		setClub(club);
	}
	public String getClub() {return club;}
	public void setClub(String club) {this.club=club;}
	public String toString() {
		return "이름 : "+getName()+"학번 :"+getNumber()+"학과 :"+getMajor()+"이수학점 : "+getGrade()+"동아리 :"+getClub();
	}
	}
class Studentss extends Student{
	private boolean assistant;
	private double scholarship;
	public String getAssistant() {
		if(assistant==true)
			return "교육조교";
		else
			return "연구조교";
	}
	public void setAssistant(boolean assistant) {this.assistant=assistant;}
	public double getScholarship() {return scholarship;}
	public void setScholarship(double scholarship) {this.scholarship=scholarship;}
	public Studentss(String n, int nu, String m, int y, double g,boolean assistant,double scholarship) {
		super(n,nu,m,y,g);
		setAssistant(assistant);
		setScholarship(scholarship);
	}
	public String toString()
	{
		return "이름:"+getName()+"학번:"+getNumber()+"학과:"+getMajor()+"학년"+getYear()+"이수학점"+getGrade()+"유형"+getAssistant()+"장학유형:"+getScholarship();
	}
}
public class StudentTest{
	public static void main(String[]args) {
		Studentss s=new Studentss("박혜진",201702020,"컴퓨터공학과",2,4.0,true,0.3);
		Students ss=new Students("혜진",201702022,"컴퓨터공학과",3,2.4,"아르고스");
		System.out.println(s);
		System.out.println(ss);
	}
}