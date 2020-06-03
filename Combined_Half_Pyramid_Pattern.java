/* Implements the following pattern
 *
 **
 ***
 ****
 *****
 ******
 *****
 ****
 ***
 **
 *
 */
import java.util.Scanner;

public class Combined_Half_Pyramid_Pattern{
	void pyramid(int num) {
		int k=2;
		for(int i=0;i<2*num-1;i++) {
			for(int j=0;j<i;j++) {
				if((j<=i &&i<num)||(i>=num&&j<num-k))
				System.out.print("*");
				else {
			      k++;
			      break;
			}
			}
			System.out.println();
		
	}
	}
	public static void main(String args[]) {
	
		System.out.println("Enter the number of rows:");
		Scanner sc=new Scanner(System.in);
		int num =sc.nextInt();
		Combined_Half_Pyramid_Pattern py=new Combined_Half_Pyramid_Pattern();
		py.pyramid(num);
	}
}
