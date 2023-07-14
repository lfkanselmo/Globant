//Realizar un programa que rellene un vector de tama�o N, con valores ingresados por el
//usuario. A continuaci�n, se debe buscar un elemento dentro del arreglo (el n�mero a buscar
//tambi�n debe ser ingresado por el usuario). El programa debe indicar la posici�n donde se
//encuentra el valor. En caso que el n�mero se encuentre repetido dentro del arreglo se deben
//imprimir todas las posiciones donde se encuentra ese valor.
//Finalmente, en caso que el n�mero a buscar no est� adentro del arreglo se debe mostrar un
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
	Escribir "A continuaci�n escriba los valores del vector";
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
		Escribir "El n�mero buscado no est� dentro del arreglo";
	FinSi
	Escribir "";
FinSubProceso
