package striversA2Z.learnTheBasics;

public class Q10_print1ToN {
	static int i=1;
	private static void printNos(int n) {
		if(n==0) return;
		
		System.out.println(i++);
		printNos(--n);
	}
	
	public static void main(String[] args) {
		printNos(10);
	}
}
