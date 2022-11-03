// Calcular el valor de la posición fibonacci usando recursividad.

import java.util.*;



public class Main {
	public static  void main(String[] args){
		System.out.println(fib(5));
		System.out.println(fib_recursivo(5));

	}
	static int fib(int num){
		int previus=0;
		int next=1;
		int[] sequence=new int[num+1];
		sequence[0]=1;
		for(int i=1;i<num+1;i++){
			sequence[i]= next+previus;
			previus = next;
			next = sequence[i];
		}
		return sequence[num];
	}
	static int fib_recursivo(int num){
		if(num < 2){
			return 1;
		}else{
			return fib_recursivo(num-1) + fib_recursivo(num-2);
		}
	}
}
