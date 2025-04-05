package striversA2Z.learnTheBasics;

public class Q05_armstrongNumber {
	public static boolean isArmstrong(int num) {
		int len = String.valueOf(num).length();
		
		int temp = num;
		int sum=0;
		
		while(temp>0) {
			int ld = temp%10;
			sum+= Math.pow(ld, len);
			temp=temp/10;
		}
		
		return sum==num;
	}
	
	public static void main(String[] args) {
		System.out.println(isArmstrong(1634));
	}
}
