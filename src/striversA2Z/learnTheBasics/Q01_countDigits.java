package striversA2Z.learnTheBasics;


//{ Driver Code Starts
//Initial Template for Java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Q01_countDigits {
	
	static int evenlyDivides(int N){
	     // code here
	     Integer count=0;
	     Integer og = N;
	     while(N!=0){
	         Integer temp = N%10;
	         N=N/10;
	         if(temp!=0 && og%temp==0){
	             count+=1;
	         }
	     }
	     return count;
	 }
	
	
 public static void main(String args[]) throws IOException {
     BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
     int N = Integer.parseInt(read.readLine());
     System.out.println(evenlyDivides(N));     
     
 }
}
