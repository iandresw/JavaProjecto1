package com.AnsdresBejarano.HolaMundo;

public class HolaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola Mundo");
		short i = 0; // 2 bytes
		byte  j = 0; // 1 bytes
		int   k = 0; // 4 bytes
		long  l = 0; // 8 bytes
		
		i = 125;
		j = 33;
		k = 115454;
		l = 93698523;
	
		float estatura1 = 0.0f; // si es float es necesario pner la f y es decimal
		double resultado = 932.999; 
		//Almacena un caracter solo ocupada 2 bytes	
		char genero = 'F';
		
		//booleano true o false
		
		boolean status = true;
		boolean existe = false;
		
		
		//declarando arreelgo de enteros
		
		int[] miArreglo; // declaro el arreglo sn tamanio
		int[] miArreglo2 = new int[5]; //declaro el arreglo con un tama;io definido
		
		//ingresando datos enteros al arreglo
		miArreglo2[0] = 1;
		miArreglo2[1] = 4;
		miArreglo2[2] = 5;
		miArreglo2[3] = 17;
		miArreglo2[4] = 18;
		
		double[][] miArregloDouble2D = new double[3][3]; //arreglo de una matriz o de dos dimenciones declarado con su tamanio
		
		miArregloDouble2D[0][0] = 2.6;
		miArregloDouble2D[1][0] = 3.6;
		miArregloDouble2D[2][0] = 4.6;
		miArregloDouble2D[0][1] = 5.6;
		miArregloDouble2D[1][1] = 6.6;
		miArregloDouble2D[2][1] = 7.6;
		miArregloDouble2D[0][2] = 8.6;
		miArregloDouble2D[1][2] = 9.6;
		miArregloDouble2D[2][2] = 10.6;
		
		System.out.println(miArregloDouble2D[2][2]);
		
		//Arreglo de tres dimenciones
		
		char[][][] miArregloDouble3D = new char[3][3][3];
		
		miArregloDouble3D[1][1][1] = 'm';
		
		System.out.println(miArregloDouble3D[1][1][1]);
	}

}
