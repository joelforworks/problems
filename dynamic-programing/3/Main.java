// Factorial de un número.
import java.util.*;

class Main {
	public static void main(String[] args){
		System.out.println(factorial(10));
	}
	static int factorial(int n){
		if(n<=1){return 1;}
		return n*factorial(n-1);
	}
}
