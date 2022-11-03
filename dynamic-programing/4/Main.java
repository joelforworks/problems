// Recorrer un array de forma recursiva.
import java.util.*;


class Main {
	public static void main(String[] args){
		int[] numeros = new int[10];
		for(int i =0;i<numeros.length;i++){
			numeros[i]=i;
		}
		recorrerArray(numeros,numeros.length-1);
	}
	static void recorrerArray(int[] array,int n){
		if(n!=0){
			System.out.println(array[n]);
			recorrerArray(array,n-1);
		}
	}
}


