package striversA2Z.learnTheBasics;

public class Q9_printGFGNTimes {

	private static void printGfg(int N) {
		if(N==0) return;
		System.out.println("GFG");
		printGfg(--N);
	}
	
	public static void main(String[] args) {
		printGfg(5);
	}
}
