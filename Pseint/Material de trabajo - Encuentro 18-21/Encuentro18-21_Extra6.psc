//Crear una función que devuelva la diferencia que hay entre el valor más chico de un arreglo y
//su valor más grande.

Algoritmo diferencias
	Definir vector, i Como Entero;
	Dimension vector[10];
	
	rellenar(vector);
	Para i=0 Hasta 9 Con Paso 1 Hacer
		Escribir Sin Saltar "[",vector[i],"] "
	FinPara
	Escribir "";
	Escribir "";
	Escribir "La diferencia ente el valor mayor y el valor menor es: ", diferencia(vector);
	
FinAlgoritmo

//Proceso para rellenar el vector con números aleatorios.
SubProceso rellenar(vector Por Referencia)
	Definir i Como Entero;
	Para i=0 Hasta 9 Con Paso 1 Hacer
		vector[i]<-Aleatorio(0,100);
	FinPara
FinSubProceso

//función para calcular la diferencia
Funcion retorno<-diferencia(vector Por Referencia)
	Definir retorno, i, mayor, menor Como Entero;
	mayor<-vector[0];
	menor<-vector[0];
	Para i=1 Hasta 9 Con Paso 1 Hacer
		si (vector[i]>mayor) Entonces
			mayor<-vector[i];
		FinSi
		si (vector[i]<menor) Entonces
			menor<-vector[i];
		FinSi
	FinPara
	retorno<-mayor-menor;
FinFuncion
