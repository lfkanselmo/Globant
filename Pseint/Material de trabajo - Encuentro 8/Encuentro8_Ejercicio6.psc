//Se pide escribir un programa que calcule la suma de los N primeros n�meros pares. Es
//decir, si ingresamos el n�mero 5 como valor de N, el algoritmo nos debe realizar la suma
//de los siguientes valores: 2+4+6+8+10.

Algoritmo Suma_Pares
	Definir num, suma, c , counter Como Entero;
	suma=0;
	counter=0;
	num=0;
	
	Escribir "�Cu�ntos n�meros pares desea sumar?";
	Leer c;
	
	Hacer
		suma<-suma+num;
		counter<-counter+1;
		num<-num+2;
	Mientras Que (counter<=c) 
	
	Escribir "Suma total de los primeros ", c, " n�meros pares es: ", suma;
	
FinAlgoritmo
