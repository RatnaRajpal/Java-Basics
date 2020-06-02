//To print Fibonacci series using recursion
import java.util.Scanner;

public class Fibonacci_recursion {
	int n1,n2;
    Fibonacci_recursion(){
    	n1=0;
    	n2=1;
    }
	int output(int num) {
	    if(num==0 || num==1) { // n<=1
	    	return num;
	    }
	    else {
		return output(num-1)+output(num-2);
	}
	}
	public static void main(String args[]) {
		System.out.println("Enter the number upto which you want to print the fibonacci series");
		int num=new Scanner(System.in).nextInt();
		Fibonacci_recursion fibo=new Fibonacci_recursion();
		for(int i=0;i<num;i++) {
		System.out.println(fibo.output(i));
	}
}
}

