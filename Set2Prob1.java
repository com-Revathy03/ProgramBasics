package set2;

import java.util.Scanner;

public class Prob1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the X value:");
		System.out.println("Enter the Y value:");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		for(int i=1;i<=y;i++) {
			System.out.println(x);
		}
		sc.close();

	}

}
