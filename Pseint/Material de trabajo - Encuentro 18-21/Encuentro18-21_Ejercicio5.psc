//Realizar un programa que rellene un vector de tama�o N, con valores ingresados por el
//usuario. A continuaci�n, se deber� crear una funci�n que reciba el vector y devuelva el valor
//m�s grande del vector.

Algoritmo Mayor
	Definir vector, n, max Como Entero;
	max<-0;
	Escribir "Ingrese el tama�o del vector";
	Leer n;
	Dimension vector[n];
	max<-comprobarMayor(n,vector);
	Escribir "El valor m�s grande del vector es: ", max;
FinAlgoritmo

//funci�n para comprobar el valor mayor
Funcion max<-comprobarMayor(n, vector Por Referencia)
	Definir i, max Como Entero;
	max<-0;
	Escribir "Vamos a rellenar el vector";
	Para i=0 Hasta n-1 Con Paso 1 Hacer
		Leer vector[i];
		si (i==0) Entonces
			max<-vector[i];
		SiNo
			si (vector[i]>max) Entonces
				max<-vector[i];
			FinSi
		FinSi
	FinPara
FinFuncion
	