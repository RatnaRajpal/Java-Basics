/*Implementation of Half Pyramid
*********
 *******
  *****
   ***
    *
*/
import java.util.Scanner;

public class Inverted_Full_Pyramid {
	void pyramid(int num) {
		for(int i=0;i<2*num;i++) {
			for(int j=0;j<2*num;j++) {
		       if(j>=i&&j<2*num-i-1) {
		    	   System.out.print("*");
		       }
		       else
		    	   System.out.print(" ");
			}
			System.out.print("\n");
		}
		
	}
	public static void main(String args[]) {
		System.out.println("Enter the number of rows:");
		Scanner sc=new Scanner(System.in);
		int num =sc.nextInt();
		Inverted_Full_Pyramid py=new Inverted_Full_Pyramid ();
		py.pyramid(num);
	}
}
