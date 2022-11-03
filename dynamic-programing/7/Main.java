import java.util.*;

class Main {
	public static void main(String[] args){
		//System.out.println(invertirNumero(2234525,10,""));
		invertirNumero(1234,10,"");
	}
	static void invertirNumero(int numero,int digit,String newNumero){
		int lastNumero=0;
		String invert = "";
		if(numero%digit!=numero){
			lastNumero = numero%digit;
			newNumero += lastNumero;
			// numero = numero/10;
			invertirNumero(numero/10,digit,newNumero);
		}else{
			lastNumero = numero%digit;
			newNumero += lastNumero;
			invert = newNumero;
		}
		System.out.println(invert);
	}
}
