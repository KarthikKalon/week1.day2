package assignmet.week1.day2;

import java.util.Arrays;

public class Missingelements {
	public static void main(String[] args) {
		int[] num= {0,1,2,3,4,7,6,8};
		Arrays.sort(num);
	    for(int i=1;i <= num.length ;i++) {
	    	if (num[i]!=i) {
	    		System.out.println("Missing Element is :" + i);
	    		break;
	    	}
	    	
	    }
	} 

}
