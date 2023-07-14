//Escribir un programa que calcule la suma de los N primeros números naturales. El valor
//de N se leerá por teclado. 

Algoritmo N_Naturales
	Definir n, suma, i Como Entero;
	suma=0;
	
	Escribir "¿ingrese el número natural hasta donde desea sumar?";
	Leer n;
	
	para i<-1 Hasta n Con Paso 1 Hacer
		suma<-suma+i;
	FinPara
	
	Escribir "La suma de los primeros ", n, " números naturales es: ", suma;
	
FinAlgoritmo
