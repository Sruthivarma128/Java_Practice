package dayOne;

public class Increment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		x = x + 1; // increment by 1
		System.out.println(x);
		
		x++; // Post increment
		System.out.println(x);
		
		System.out.println(x++);
		System.out.println(x);
		
		System.out.println(++x); //Pre increment
		System.out.println(x);
		
		x += 5; // x = x + 5
		System.out.println(x);
		
		x *= 5; // x = x * 5
		System.out.println(x);
		
		x /= 5; // x = x / 5
		System.out.println(x);
		
		x -= 4; // x = x - 4
		System.out.println(x);
	}

}
