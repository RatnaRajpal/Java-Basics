/*Implementation of Half Pyramid
*
**
***
****
*****
******
*/
import java.util.Scanner;
public class Half_Pyramid {
		
		void pyramid(int num) {
			for(int i=0;i<num;i++) {
				for(int j=0;j<=i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		public static void main(String args[]) {
			System.out.println("Enter the number of rows:");
			Scanner sc=new Scanner(System.in);
			int num =sc.nextInt();
			Half_Pyramid  py=new Half_Pyramid ();
			py.pyramid(num);
		}
}
