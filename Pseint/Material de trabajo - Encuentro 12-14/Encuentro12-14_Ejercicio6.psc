//Realizar una función que calcule y retorne la suma de todos los divisores del número n
//distintos de n. El valor de n debe ser ingresado por el usuario.

Algoritmo SumaDivisores
	Definir num Como Entero;
	Leer num;
	Escribir "La suma de los divisores de ", num, " es: ", calcular(num);	
FinAlgoritmo

Funcion suma<-calcular(n)
	Definir suma, i Como Entero;
	suma<-0;
	
	Para i=1 Hasta n-1 Con Paso 1 Hacer
		si (n mod i == 0) Entonces
			suma<-suma+i;
		FinSi
	FinPara
FinFuncion
	