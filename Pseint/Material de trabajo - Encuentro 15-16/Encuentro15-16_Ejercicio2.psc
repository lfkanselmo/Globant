//Crear un procedimiento que calcule la temperatura media de un d�a a partir de la temperatura
//m�xima y m�nima. Crear un programa principal, que, utilizando un procedimiento, vaya
//pidiendo la temperatura m�xima y m�nima de n d�as y vaya mostrando la media de cada d�a. El
//programa pedir� el n�mero de d�as que se van a introducir.

Algoritmo TempPromedio
	Definir n Como Entero;
	Escribir "Ingrese el n�mero de d�as";
	Leer n;
	
	promediar(n);
	
FinAlgoritmo

SubProceso promediar(n)
	Definir i Como Entero;
	Definir promedio, minima, maxima Como Real;
	promedio<-0;
	
	Para i=1 Hasta n Con Paso 1 Hacer
		Escribir "Ingrese la temperatura maxima del d�a ", i, " en grados Celsius";
		Leer maxima;
		Escribir "Ingrese la temperatura minima del d�a ", i, " en grados Celsius";
		Leer minima;
		
		promedio<-(maxima+minima)/2
		Escribir "Temperatura promedio del d�a ", i, " es: ", promedio, "�C"
		Escribir "";
		Escribir "";
		Escribir "--------------------------------------------------------"
	FinPara
FinSubProceso
	