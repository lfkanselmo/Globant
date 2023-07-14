//Realizar un procedimiento que permita intercambiar el valor de dos variables de tipo entero.
//La variable A, debe terminar con el valor de la variable B.

Algoritmo Intercambio
	Definir a, b Como Entero;
	Leer a, b;
	
	intercambiar(a,b);
	
FinAlgoritmo

SubProceso intercambiar(a Por Referencia,b Por Referencia)
	Definir aux Como Entero;
	aux<-a;
	a<-b;
	b<-aux;
	
	Escribir "La variabla A: ", a, " y B: ", b;
FinSubProceso
	