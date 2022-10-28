package job_guarantee;

public class PrintIneuron {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;
		//Below code will print "I"
		for(int i=0;i<n;i++) {
			
			//Below code will print "I"
			for(int j=0;j<n;j++) {
				
				if(i==0 || i==n-1 || j==n/2) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			
			System.out.print("   "); //this code for extra space between alphabate
			//Below code will print "N"
			for(int j=0;j<n;j++) {
				
				if(j==0 || i==j || j==n-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			
			System.out.print("   "); //this code for extra space between alphabate
			//Below code will print "E"
			for(int j=0;j<n;j++) {
				
				if(i==0|| i==n/2 || i==n-1 || j==0) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			
			System.out.print("   "); //this code for extra space between alphabate
			
			//Below code will print "U"
			for(int j=0;j<n;j++) {
				
				if((i==n-1 && (j!=0 && j!=n-1)) || (j==0 && i!=n-1) || (j==n-1 && i!=n-1)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			
			
			System.out.print("   "); //this code for extra space between alphabate
			//Below code will print "R"
			for(int j=0;j<n;j++) {
				
				if(j==0 || (i==0 && j != n-1) || (i==n/2 && j != n-1) || (j==n-1 && (i!=0 && i!= n/2))) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
		
			
			
			System.out.print("   "); //this code for extra space between alphabate
			//Below code will print "O"
			for(int j=0;j<n;j++) {
				
				if((i==0 && (j!=0 && j!=n-1)) || (i==n-1 && (j!= 0 && j!=n-1)) || (j==0 && (i!=0 && i!= n-1)) || (j==n-1 && (i!=0 && i!= n-1))) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			
			System.out.print("   "); //this code for extra space between alphabate
			
			//Below code will print "N"
			for(int j=0;j<n;j++) {
				
				if(j==0 || i==j || j==n-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
		
		

		
		
		
		

	}

}
