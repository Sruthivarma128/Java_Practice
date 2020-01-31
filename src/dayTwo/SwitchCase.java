package dayTwo;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks = 10;
		switch(marks)
		{
			case 100:
			case 95:
			case 90 :
				System.out.println("Very good");
				break;
			case 85:
			case 75:
			case 60 :
				System.out.println("Good");
				break;
			case 40 :
				System.out.println("Ok");
				break;
			default:
				System.out.println("Grades are not defined");
		}
			
	}

}
