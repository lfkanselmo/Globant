//Se debe realizar un programa que:
//1o) Pida por teclado un número (entero positivo).
//2o) Pregunte al usuario si desea introducir o no otro número.
//3o) Repita los pasos 1o y 2o mientras que el usuario no responda n/N (no).
//4o) Muestre por pantalla la suma de los números introducidos por el usuario.

Algoritmo Suma_Ingresada
	Definir suma, num Como Entero;
	Definir clave Como Caracter;
	Definir repet Como Logico;
	repet<-Verdadero;
	suma<-0;
	
	Hacer
		Escribir "Ingrese número";
		Leer num;
		Mientras (num<=0) Hacer
			Escribir "número no valido. Intente de nuevo";
			Leer num;
		FinMientras
		suma<-suma+num;
		
		Escribir "¿Desea introducir otro número? S o N";
		Leer clave;
		clave<-Minusculas(clave);
		
		Mientras (clave<>"s" y clave<>"n") Hacer
			Escribir "incorrecto. Ingrese S o N";
			Leer clave;
			clave<-Minusculas(clave);
		FinMientras
		
	Mientras Que (clave<>"n")
	
	Escribir "----------------------------------------------------";
	Escribir "La suma de los números ingresados es: ", suma;
FinAlgoritmo
