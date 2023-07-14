//Realizar un programa que rellene dos vectores al mismo tiempo, con 5 valores aleatorios y los
//muestre por pantalla.

Algoritmo vectores
	Definir vector1, vector2 Como Entero;
	Dimension vector1[5],vector2[5];
	
	rellenar(vector1,vector2);
	ver(vector1);
	ver(vector2);
	
FinAlgoritmo

//SubProceso para rellenar los vectores
SubProceso rellenar(vector1 Por Referencia, vector2 Por Referencia)
	Definir i Como Entero;
	Para i=0 Hasta 4 Con Paso 1 Hacer
		vector1[i]<-Aleatorio(0,100);
		vector2[i]<-Aleatorio(0,100);
	FinPara
FinSubProceso

//Subproceso para imprimir los vectores
SubProceso ver(vector Por Referencia)
	Definir i Como Entero;
	Para i=0 Hasta 4 Con Paso 1 Hacer
		Escribir Sin Saltar "[",vector[i],"] ";
	FinPara
	Escribir "";
	Escribir "";
FinSubProceso
	