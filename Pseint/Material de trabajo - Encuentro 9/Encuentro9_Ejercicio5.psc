//Escribir un programa que calcule la suma de los N primeros n�meros naturales. El valor
//de N se leer� por teclado. 

Algoritmo N_Naturales
	Definir n, suma, i Como Entero;
	suma=0;
	
	Escribir "�ingrese el n�mero natural hasta donde desea sumar?";
	Leer n;
	
	para i<-1 Hasta n Con Paso 1 Hacer
		suma<-suma+i;
	FinPara
	
	Escribir "La suma de los primeros ", n, " n�meros naturales es: ", suma;
	
FinAlgoritmo
