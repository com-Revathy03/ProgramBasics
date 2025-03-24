package set1;

import java.util.Scanner;

public class Prob1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String str = sc.next();
		char c = sc.next().charAt(0);
		
		System.out.println(num);
		System.out.println(str);
		System.out.println(c);
		sc.close();

	}

}
