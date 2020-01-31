package dayTwo;

public class LogicalOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sub1 = 40;
		int sub2 = 60;
		if ((sub1 >= 35) && (sub2 >= 35))
		{
			System.out.println("Student is passed");
		}
		else
		{
			System.out.println("Student is failed");
		}
		if ((sub1 <= 35) || (sub2 <= 35))
		{
			System.out.println("Student is passed");
		}
		else
		{
			System.out.println("Student is failed");
		}
	}

}
