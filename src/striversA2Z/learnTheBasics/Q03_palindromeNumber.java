package striversA2Z.learnTheBasics;

public class Q03_palindromeNumber {
	
	public static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }else{
            int rev =0;
            int i= x;
            while(i!=0){
                rev = rev*10 + i%10;
                i /=10;
            }
            return x==rev;
        }
    }
	
	public static void main(String[] args) {
		System.out.println(isPalindrome(121));
	}
}
