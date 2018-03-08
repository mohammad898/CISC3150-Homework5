


	
	/*
	Ssummarize:
	-------------
	 The distance from the random point to center(0, 0) is
	 d=sqrt(x^2+y^2). 
	If d>1, the point is outside the circle.
	 If d<=1, the point is inside the circle.
	
	 For picking 4 billion times random points,
	 I break 4 billion up to 20* 200,000,000,
	*/
	public class Circle{
		public static void main(String[] args){
			long before = System.currentTimeMillis();
			System.out.println("Start Runing Time "+before);	
			double X_c, Y_c, diameter;
			double sum=0; 
			int in=0;
			
			for(int a=0; a<20; a++){
				in=0;
				
				
				for(int b=0; b<200000000; b++){
					
					X_c= Math.random(); 
					Y_c= Math.random();
					
					diameter= Math.sqrt(X_c*X_c + Y_c*Y_c);
					
					if(diameter<=1){
						in++;
					}
				}
					
				sum=sum+in;
				
				System.out.println("***--running program-"+(a+1)*10+"%--***");	
			}
			
			System.out.println("\n  Pi value is: "+ sum*4/4000000000.0);
			
			long after = System.currentTimeMillis();
			System.out.println("Total Runing time"+(after-before));
		}
	}

//https://magoosh.com/gmat/2014/circle-problems-on-the-gmat/
//https://gmatclub.com/forum/a-circle-is-inscribed-in-a-quadrant-of-a-circle-of-radius-91162.html

//https://study.com/academy/lesson/quarter-circles-calculating-area-perimeter-radius.html