package basic;

public class ExceptionDemo {

	public static void main(String[] args) {
		int a = 0;
		int b = 2;
		int c = 10;
		try {
			System.out.println(b/a);
		} catch (Exception e) {
			System.out.println("Exception occured in division");
		}
		try {
			System.out.println(b-c);
		} catch (Exception e) {
			System.out.println("Exception occured in subtraction");
		}
		finally {
			System.out.println("Operation performed");
		}
	}

}
