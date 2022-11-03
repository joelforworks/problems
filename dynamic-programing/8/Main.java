import java.util.*;

class Main {
	public static void main(String[] args){
		System.out.println(calcularPotenciaRecursivo(2,8));
	}
	static int calcularPotenciaRecursivo(int num,int exponente){
		if(exponente==1){
			return num;
		}else{
			return num*calcularPotenciaRecursivo(num,exponente-1);
		}
	}
}
