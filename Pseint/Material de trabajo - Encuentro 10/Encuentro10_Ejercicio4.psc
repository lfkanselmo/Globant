//La función factorial se aplica a números enteros positivos. El factorial de un número
//entero positivo (!n) es igual al producto de los enteros positivos desde 1 hasta n:
//n! = 1 * 2 * 3 * 4 * 5 * (n-1) * n
//Escriba un programa que calcule las factoriales de todos los números enteros desde el 1
//hasta el 5.

Algoritmo Factorial
	Definir n, i, j, facto como entero;
	Escribir "Ingrese el valor de N para calcular el factorial";
	Leer n;
	
	Escribir "1! = 1";	
	Para i=2 Hasta n Con Paso 1 Hacer
		facto<-1;
		Escribir Sin Saltar i,"! = ";
		Para j=1 Hasta i Con Paso 1 Hacer
			si (j==i) Entonces
				Escribir Sin Saltar j;
			sino
				Escribir Sin Saltar j, " * ";
			FinSi
		
			facto<-facto*j;
			
		FinPara
		
		Escribir " = ", facto;
	FinPara
	
FinAlgoritmo
