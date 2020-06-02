import java.util.Scanner;

public class Vowel_consonant {
	public static void main(String args[]) {
		System.out.println("Enter the Aplhabet:");
		char alpha=new Scanner(System.in).next().charAt(0);
		alpha=Character.toLowerCase(alpha);
		if(alpha=='a'||alpha=='e'||alpha=='i'||alpha=='o'||alpha=='u') {
			System.out.println("Vowel!!");
		}
		else {
			System.out.println("Consonant!!");
		}
}
}
