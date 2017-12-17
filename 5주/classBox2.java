
public class classBox2 {

	public static void main(String[] args) {
		
		classBox myBox=new classBox();
		myBox.set가로(10);
		myBox.set세로(20);
		myBox.set높이(50);
		
		System.out.println("가로의 길이는"+ myBox.get가로());
		System.out.println("세로의 길이는"+ myBox.get세로());
		System.out.println("높이는"+ myBox.get높이());
		System.out.println("부피는"+myBox.getVolume());
		// TODO Auto-generated method stub

	}

}
