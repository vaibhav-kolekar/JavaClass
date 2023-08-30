package basic;

import java.util.Scanner;

public class CheckPallindrome {

	public static void main(String[] args) {
		String name = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter name: ");
		name = sc.nextLine();
		int j = name.length() - 1;
		int i = 0;
		boolean isPallindrome = true;
		while (i<=j) {
			if(name.charAt(i) != name.charAt(j))
			{
				isPallindrome = false;
			}
			
			i++;
			j--;
		}
		System.out.println("Is pallindrome: " + isPallindrome);
		
		sc.close();
	}

}
