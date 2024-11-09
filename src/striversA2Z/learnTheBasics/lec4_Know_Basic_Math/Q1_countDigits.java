package striversA2Z.learnTheBasics.lec4_Know_Basic_Math;


//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class Q1_countDigits {
 public static void main(String args[]) throws IOException {
     BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
     int t = Integer.parseInt(read.readLine());
     while (t-- > 0) {
         int N = Integer.parseInt(read.readLine());
         Solution ob = new Solution();
         System.out.println(ob.evenlyDivides(N));

         System.out.println("~");
     }
 }
}
//} Driver Code Ends




//User function Template for Java


class Solution{
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
}