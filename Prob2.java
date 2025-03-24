package set1;

import java.util.Scanner;

public class Prob2 {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int num3 = sc.nextInt();
			int sum = num1+num2+num3;
			if(sum==180) {
				System.out.println("Triangle can be formed");			
			}else {
				System.out.println("Triangle can't be formed");
			}
			sc.close();
	}

}
