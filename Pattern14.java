package week2_patterns;

public class Pattern14 {

	public static void main(String[] args) {
		int n=6,count=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
				System.out.print(i);
				count++;
			}
			System.out.println(" ");
		}

	}

}
