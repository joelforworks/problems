// Sumar los números números naturales hasta N (se lo damos nosotros) de forma recursiva.
import java.util.*;


class Main{
	public static void main(String[] args){
		System.out.println(sumar(10));
	}
	static int sumar(int n){
		if(n==0){return 0;}
		if(n==1){return 1;}
		return n+sumar(n-1);
	}
}
