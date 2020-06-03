import java.util.Scanner;

/* Implements the following pattern
 *         *
 **       **
 ***     ***
 ****   ****
 ***** *****
 *********** 
 */
public class Half_Pyramid_pattern {
	void pyramid(int num) {
		for(int i=0;i<num;i++) {
			for(int j=0;j<num*2;j++) {
				if(j<=i||j>=2*num-i-1) {
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
		Half_Pyramid_pattern  py=new Half_Pyramid_pattern();
		py.pyramid(num);
	}
}
