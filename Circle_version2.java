

/*
  Date	03-13-2018
  Version	2.0
 * 	Mohammad Haque
 * */
import java.util.*;
import java.util.Random;

public class Circle_version2 {
	public static void main(String[] args) {
    
    long before = System.currentTimeMillis();
	 System.out.println("Start Running Time "+before);	
		
	 long in=0;
	 long out=0;
	 long dots=0;
	 double ratio; 
	 
		
		Random random_m = new Random();	
		
      Random random_n = new Random();								
		
		for(dots = 0; dots < 4000000000L; dots++) {
			
			int X_c = random_m.nextInt();
			int  Y_c = random_n.nextInt();
			int diameter= (X_c*X_c + Y_c*Y_c);
			if(diameter<=1)
				in++;
			else 
				out++;
			
	}	
		ratio = ((double) in/dots);
		
		System.out.println("Total InSide dots: " + in);
		System.out.println("Total Outside dots: " + out);
		System.out.println("The Ratio of areas  : " + ratio);
		System.out.println("\n  PI Value is =" + ratio*4);
		System.out.print("Total Runing time :");
      System.out.println(System.currentTimeMillis()-before);
	}
}