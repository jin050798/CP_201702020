class Dog{
	private String name;
	public String breed;
	private int age;
	
	public Dog(String name, int age)
	{
		this.name=name;
		this.age=age;
		this.breed=null;
		System.out.println("������ �̸�  "+name+", ������ ����"+age);
	}
	public Dog(String name,String breed,int age)
	{
		this.name=name;
		this.breed=breed;
		this.age=age;
		System.out.println("������ �̸�"+name+",������ ����"+breed+",����������"+age);
	}
}
	public class Dogtest{
		public static void main(String[] args)
		{
			Dog dog1=new Dog("����",10);
			Dog dog2=new Dog("�̹�","��ũ���׸���",5);
		}
}