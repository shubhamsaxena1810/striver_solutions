package striversA2Z.learnTheBasics;

public class Q6_printAllDivisors {

	public static long sumOfDivisors(int n) {
        // code here
        long totalSum=0;
        for(int i=1;i<n+1;i++){
            for(int j=0;(j+1)*(j+1)<=i;j++){
                if(i%(j+1)==0){
                    totalSum+=(j+1);
                    if((j+1)*(j+1)!=i){
                        totalSum+=(i/(j+1));
                    }
                }
            }
        }
        return totalSum;
    }
	
	public static void main(String[] args) {
		System.out.println(sumOfDivisors(5));
	}
}
