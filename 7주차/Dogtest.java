class Dog{
	private String name;
	public String breed;
	private int age;
	
	public Dog(String name, int age)
	{
		this.name=name;
		this.age=age;
		this.breed=null;
		System.out.println("강아지 이름  "+name+", 강아지 나이"+age);
	}
	public Dog(String name,String breed,int age)
	{
		this.name=name;
		this.breed=breed;
		this.age=age;
		System.out.println("강아지 이름"+name+",강아지 종류"+breed+",강아지나이"+age);
	}
}
	public class Dogtest{
		public static void main(String[] args)
		{
			Dog dog1=new Dog("코코",10);
			Dog dog2=new Dog("미미","요크셔테리어",5);
		}
}