package set2;

import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First name:");
		System.out.println("Enter the Last name:");
		System.out.println("Enter the Input:");
		
		String fName = sc.next();
		String lName = sc.next();
		int inputNum = sc.nextInt();
		
		for(int i=1;i<=inputNum;i++) {
			System.out.println(fName +""+ lName);
		}
		sc.close();
	}

}
