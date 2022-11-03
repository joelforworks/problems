// Buscar un elemento de un array de forma recursiva.
import java.util.*;

class Main {
	public static void main(String[] args){

		int[] numeros = new int[10];
		for(int i=0;i<numeros.length;i++){
			numeros[i]=i;
		}
		System.out.print(buscarArray(numeros,4,0));
	}
	static int buscarArray(int[] array,int numeroBusrcar,int posicion){
		if(array[posicion]!=numeroBusrcar && posicion==array.length-1){
			System.out.print("El numero no existe.");
			return 0;
		}else if(array[posicion]==numeroBusrcar){
			System.out.println(array[posicion]);
			return posicion;
		}
		return buscarArray(array,numeroBusrcar,posicion+1);
	}
}
