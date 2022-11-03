import java.util.*;

class Main {
	public static void main(String[] args){
		int[][] matrix = new int [10][10];
		for(int i=0;i<matrix.length;i++){
			for(int e=0;e<matrix[i].length;e++){
				matrix[i][e]=e;
			}
		}


		recorrerMatrixFila(matrix,0,0);


	}
	static void recorrerMatrixColumna(int[][] matrix,int fila,int columna){
		if(columna != matrix[fila].length){
			System.out.print(matrix[fila][columna]);
			recorrerMatrixColumna(matrix,fila,columna+1);
		}
	}
	static void recorrerMatrixFila(int[][] matrix,int fila,int columna){
		if(fila != matrix.length){
			recorrerMatrixColumna(matrix,fila,columna);
			System.out.println();
			recorrerMatrixFila(matrix,fila+1,columna);
		}
	}
}
