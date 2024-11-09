package striversA2Z.learnTheBasics.lec4_Know_Basic_Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2_reverseNumber {
	
	public static int reverse(int x) {
        int i = x>-1? x: x*(-1);
        int rev = 0;
        try{
            while(i>0){
                int temp = i%10;
                if(rev>(Integer.MAX_VALUE - temp)/10){
                    return 0;
                }
                rev = (rev*10) + temp;
                i= i/10;
            }
            return x>-1? rev:rev*(-1);
        }catch(NumberFormatException e){
            return 0;
        }
    }

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(read.readLine());

        System.out.println(reverse(t));
	}

}
