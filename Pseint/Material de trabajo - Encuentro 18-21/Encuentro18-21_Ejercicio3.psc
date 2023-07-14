//Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el
//usuario. A continuación, se debe buscar un elemento dentro del arreglo (el número a buscar
//también debe ser ingresado por el usuario). El programa debe indicar la posición donde se
//encuentra el valor. En caso que el número se encuentre repetido dentro del arreglo se deben
//imprimir todas las posiciones donde se encuentra ese valor.
//Finalmente, en caso que el número a buscar no está adentro del arreglo se debe mostrar un
//mensaje.

Algoritmo Buscar
	Definir n Como Entero;
	Escribir "Ingrese la cantidad de valores del vector";
	Leer n;
	Definir vector Como Entero;
	Dimension vector[n];
	
	rellenar(n,vector);
	buscando(n,vector);
FinAlgoritmo

SubProceso rellenar(n,vector Por Referencia)
	Definir i Como Entero;
	Escribir "A continuación escriba los valores del vector";
	Para i=0 Hasta n-1 Con Paso 1 Hacer
		Leer vector[i];
	FinPara
FinSubProceso

SubProceso buscando(n,vector Por Referencia)
	Definir i, nBuscado Como Entero;
	Definir hay Como Logico;
	Escribir "Ingrese el valor a buscar en el vector";
	Leer nBuscado;	
	hay<-Falso;
	Para i=0 Hasta n-1 Con Paso 1 Hacer
		si (nBuscado==vector[i]) Entonces
			Escribir Sin Saltar i, " ";
			hay<-Verdadero;
		FinSi
	FinPara
	
	si(hay==Falso) Entonces
		Escribir "El número buscado no está dentro del arreglo";
	FinSi
	Escribir "";
FinSubProceso
