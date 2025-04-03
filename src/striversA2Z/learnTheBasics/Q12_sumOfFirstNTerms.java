package striversA2Z.learnTheBasics;

public class Q12_sumOfFirstNTerms {

	static long sum = 0;
	private static long sumOfSeries(int n) {
		if(n==0) return sum;
		
		sum += (n*n*n);
		return sumOfSeries(--n);
	}
	
	public static void main(String[] args) {
		System.out.println(sumOfSeries(5));
	}
}
