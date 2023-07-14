//Realizar un programa que rellene un vector con 5 valores ingresados por el usuario y los
//muestre por pantalla.

Algoritmo arreglo
	Definir vector, i Como Entero;
	Dimension vector[5];
		
	Escribir "Ingrese valores del arreglo";
	Para i=0 Hasta 4 Con Paso 1 Hacer
		Leer vector[i];
	FinPara
	
	Escribir "";
	Escribir "";
	Para i=0 Hasta 4 Con Paso 1 Hacer
		si (i==4) Entonces
			Escribir "[",vector[i],"]";
		SiNo
			Escribir Sin Saltar "[",vector[i],"],";
		FinSi
	FinPara
FinAlgoritmo
	