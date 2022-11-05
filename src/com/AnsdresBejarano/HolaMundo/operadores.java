package com.AnsdresBejarano.HolaMundo;

public class operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Operadores 
		// + - * \ %
		
		int a = 2;
		int b = 5;
		int c = 0;
		System.out.println("\n");	
		System.out.println("*************OPERACIONES BASICAS*********");
		System.out.println("\n");	
		
		//Suma
		
		c = a + b;
		System.out.println("El resultado de la suma de  "+ a + " y "+ b + " es igual a: " + c);
		
		//Resta 
		
		c = a - b;
		System.out.println("El resultado de la resta de  "+ a + " y "+ b + " es igual a: " + c);
		
		//Multiplicacion
		c = a * b;
		System.out.println("El resultado de la multiplicacion de  "+ a + " y "+ b + " es igual a: " + c);
		//Divicion
		c = a / b;
		System.out.println("El resultado de la divicion de  "+ a + " y "+ b + " es igual a: " + c);
		//Modulo
		c = a % b;
		System.out.println("El resultado del modulo  de  "+ a + " y "+ b + " es igual a: " + c);
		
		
		//Operaciones de asignaciones con operacion
		// += -= *= /=
		System.out.println("\n");	
		System.out.println("*************OPERACIONES DE ASIGNACION CON OPERACION*********");
		System.out.println("\n");	
		
		c = 2;
		c += a; // c =c + a
		System.out.println("c+= - >>> " + c);
		
		c = 2;
		c -= a;		// c= c - a
		System.out.println("c-= - >>> " + c );		
		c = 2;
		c *= a;		// c= c - a
		System.out.println("c*= - >>> " + c);
		
		c = 2;
		c /= a;		// c= c - a
		System.out.println("c/= - >>> " + c);
		
		c = 2;
		c %= a;		// c= c - a
		System.out.println("c%= - >>> " + c);
		
		
		System.out.println("\n");	
		System.out.println("*************OPERADOR INCREMENTO (++) Y DECREMENTO (--) PREFIJO*********");
		System.out.println("\n");	
		int i = 3;
		++i;
		System.out.println("Incremento prefijo ++i " + i);
		--i;
		System.out.println("Decremento prefijo --i " + i);
		System.out.println("Impresion Decremento prefijo --i " + --i);
		System.out.println(" Decremento prefijo despues de impresion   " + i);
		
		System.out.println("\n");	
		System.out.println("*************OPERADOR INCREMENTO (++) Y DECREMENTO (--) POSFIJO*********");
		System.out.println("\n");	
		i = 3;
		i++;
		System.out.println("Incremento prefijo i++ " + i);
		i--;
		System.out.println("Decremento prefijo i-- " + i);
		System.out.println("Impresion Decremento posfijo --i " + i--);
		System.out.println(" Decremento posfijo despues de impresion   " + i);
		
		System.out.println("\n");	
		System.out.println("*************OPERADORES DE EQUIDAD*********");
		System.out.println("\n");
		
		a = 5;
		b = 4;
		
		System.out.println("a es igual a b (a==b)         "+ (a==b));
		System.out.println("a es distinto a b (a!=b))     "+ (a!=b));
		
		System.out.println("a es mayor a b (a > b)        "+ (a > b));
		System.out.println("a es menor a b (a < b)        "+ (a < b));
		
		System.out.println("a es mayor igual  a b (a>=b)  "+ (a>=b));
		System.out.println("a es menor igual a b (a<=b)   "+ (a<=b));
		
		
		
		System.out.println("\n");	
		System.out.println("*************OPERADORES DE ASOCIACION AND &&*********");
		System.out.println("\n");
		
		boolean q = false;
		boolean w = true;
		
		System.out.println("w && q ---->    " + (q && w));
		System.out.println("w || q ---->    " + (q || w));
		System.out.println("w !w q ---->    " + (!w));
		
		System.out.println("\n");	
		System.out.println("*************OPERADORES DE CONJUNCION O   &&*********");
		System.out.println("\n");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
