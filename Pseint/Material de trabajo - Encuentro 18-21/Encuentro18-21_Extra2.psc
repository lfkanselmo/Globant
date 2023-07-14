//Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el
//usuario y muestre por pantalla el promedio de la suma de todos los valores ingresados. 

Algoritmo promedioSumaVector
	Definir n, vector, suma, num, i Como Entero;
	Escribir "Ingrese cantidad de valores";
	Leer n
	Dimension vector[n];
	suma<-0;
	
	Para i=0 Hasta n-1 Con Paso 1 Hacer
		Escribir "Ingrese número";
		Leer num;
		suma<-suma+num;
	FinPara
	
	Escribir "El promedio de la suma de los valores del vector es: ", suma/n;
FinAlgoritmo
