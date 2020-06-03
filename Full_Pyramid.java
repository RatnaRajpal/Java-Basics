/*Implementation of Half Pyramid
            *
           ***
          *****
         *******
        *********
       ***********
*/
import java.util.Scanner;

public class Full_Pyramid {
	void pyramid(int num) {
		for(int i=0;i<num;i++) {
			for(int j=0;j<2*num;j++) {
				if((j>=num-i-1)&&(j<num+i)) {
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
		Full_Pyramid py=new Full_Pyramid ();
		py.pyramid(num);
	}
}
