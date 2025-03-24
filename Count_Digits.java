package week2_maths;

public class Count_Digits {

	public static void main(String[] args) {
		int n=34567,count=0;
		
		while(n>0) {
			count=count+1;
			n=n/10;
		}
		System.out.println(count);

	}

}
