package striversA2Z.learnTheBasics;

public class Q11_printNto1 {
	private static void printNos(int n) {
		if(n==0) return;
		
		System.out.println(n);
		printNos(--n);
	}
	
	public static void main(String[] args) {
		printNos(10);
	}
}
