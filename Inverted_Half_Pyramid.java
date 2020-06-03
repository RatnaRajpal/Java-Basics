/*Implementation of Half Pyramid
 ******
 *****
 ****
 ***
 **
 *
*/
import java.util.Scanner;

public class Inverted_Half_Pyramid {
	void pyramid(int num) {
		for(int i=0;i<num;i++) {
			for(int j=0;j<num-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String args[]) {
		System.out.println("Enter the number of rows:");
		Scanner sc=new Scanner(System.in);
		int num =sc.nextInt();
		Inverted_Half_Pyramid  py=new Inverted_Half_Pyramid ();
		py.pyramid(num);
	}

}
