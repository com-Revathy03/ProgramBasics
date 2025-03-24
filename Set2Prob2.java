package set2;

import java.util.Scanner;

public class Prob2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the X value:");
		int x = sc.nextInt();
		
		for(int i=1;i<=1000;i++) {
			System.out.println(x*i);
		}
		sc.close();

	}

}
