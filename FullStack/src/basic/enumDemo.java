package basic;

public class enumDemo {

	public enum Days{MOn, TUE, WED, THU, FRI, SAT, SUN};
	public static void main(String[] args) {
		Days d2[] = Days.values();
		System.out.println(d2[4]);
	}

}
