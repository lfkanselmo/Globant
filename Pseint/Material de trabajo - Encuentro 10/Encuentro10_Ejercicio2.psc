//Realizar un programa que lea un número entero (tamaño del lado) y a partir de él cree
//un cuadrado de asteriscos de ese tamaño. Los asteriscos sólo se verán en el borde del
//cuadrado, no en el interior.
// ****
// *  *
// *  *
// ****

Algoritmo Cuadrado_Estrellado
	Definir lado, i, j Como Entero;
	Escribir "Ingrese el valor del lado";
	Leer lado;
	
	para i<-1 Hasta lado Con Paso 1 Hacer
		para j<-1 Hasta lado Con Paso 1 Hacer
			si (j<>1 y j<>lado y i<>1 y i<>lado) Entonces
				Escribir Sin Saltar " ";
			SiNo
				Escribir Sin Saltar "*";
			FinSi
		FinPara	
		Escribir "";
	FinPara
	
	
	
FinAlgoritmo
