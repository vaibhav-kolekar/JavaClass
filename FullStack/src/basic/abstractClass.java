package basic;

abstract class EmployeeData {
	abstract void printData();
}

class Data extends EmployeeData {
	void printData() {
		String name = "Vaibhav";
		int age = 22;
		int id = 2;
		String address = "Mumbai";

		System.out.println("Employee details:- \n");
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
		System.out.println(address);
	}

}


public class abstractClass {
	public static void main(String a[]) {
		Data d = new Data();
		d.printData();
	}
}
