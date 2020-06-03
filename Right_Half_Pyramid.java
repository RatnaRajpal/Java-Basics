/* Implements the following pattern
	      *
	     **
	    ***
	   ****
	  *****
*/
import java.util.Scanner;

public class Right_Half_Pyramid {
	void pyramid(int num) {
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				if(j>=num-i-1) {
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		
		
	}
	}
	public static void main(String args[]) {
	
		System.out.println("Enter the number of rows:");
		Scanner sc=new Scanner(System.in);
		int num =sc.nextInt();
		Right_Half_Pyramid py=new Right_Half_Pyramid();
		py.pyramid(num);
	}
}
