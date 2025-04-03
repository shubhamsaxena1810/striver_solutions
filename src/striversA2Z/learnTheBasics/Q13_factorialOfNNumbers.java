package striversA2Z.learnTheBasics;

import java.util.ArrayList;

public class Q13_factorialOfNNumbers {
	
	private static int i =1;
	private static ArrayList<Long> arr = new ArrayList<>();
	static ArrayList<Long> factorialNumbers(long n) {
        int fact = i;
        long prod = 1;
        while(fact>1) {
        	prod*=fact;
        	fact--;
        }
        
        if(prod<=n) {
        	arr.add(prod);
        	i++;
        	return factorialNumbers(n); 
        }else {
        	return arr;       	
        }
    }
	
	public static void main(String[] args) {
		System.out.println(factorialNumbers(6));
	}
}
