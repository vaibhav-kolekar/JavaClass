package inheritance;

class ChildClass extends ParentClass{
	
	int b = 93;
	int a= 33;
	ParentClass p1 = new ParentClass();
	int c = p1.a;
//	c = 90;
	public void cDisplay() {
		System.out.println("Value of a: " + a + " Value of b: " + b);
	}
	
	final String msg = "Hello World";
	public void display() {
		System.out.println(msg);
	}
}

public class Runner {

	public static void main(String[] args) {
		
		ParentClass p = new ParentClass();
		System.out.println(p.msg);
		
		ChildClass c = new ChildClass();
		c.cDisplay();
		c.display();
		
	}

}
