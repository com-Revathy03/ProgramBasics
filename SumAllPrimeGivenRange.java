package array;

public class SumAllPrimeGivenRange {

	public static void main(String[] args) {
		int L=5,R=20;
		int n=R;
		int a[]=new int[n];
		int sum =0;
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(a[i]==0) {
				for(int j=i*2;j<n;j=j+i) {
					a[j]=1;
				}
			}
		}
		for(int i=L;i<R;i++) {
			if(a[i]==0) {
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}
}