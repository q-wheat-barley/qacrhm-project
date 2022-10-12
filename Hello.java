package hello;

public class Hello {

	public static void main(String[] args) {
		int count = (int)(Math.random() * 5) + 1;
		for (int i = 0; i < count; i++) {
			System.out.println("Hello");
		}
	}

}
