package striversA2Z.learnTheBasics;

public class Q04_lcmAndGcd {
	private static Long gcd(Long a,Long b){
        if(a==b){
            return a;
        }else if(a>b){
            if(a%b!=0){
                return gcd(a%b,b);
            }else{
                return b;
            }
        }else{
            if(b%a!=0){
                return gcd(a,b%a);
            }else{
                return a;
            }
        }
    }
	
	private static Long[] lcmAndGcd(Long a, Long b) {
        // code here
        Long x =a; 
        Long y = b;
        Long[] arr = new Long[2];
        Long gcd = gcd(a,b);
        arr[0] = gcd * (x/gcd) * (y/gcd);
        arr[1] = gcd;
        return arr;
    }
	
	public static void main(String[] args) {
		Long a = (long) 14;
		Long b = (long) 8;
		
		Long[] arr = lcmAndGcd(a,b);
		System.out.println("LCM: "+ arr[0] + " GCD: "+ arr[1]);
	}
}
