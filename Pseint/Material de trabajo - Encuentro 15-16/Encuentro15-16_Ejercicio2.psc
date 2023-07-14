//Crear un procedimiento que calcule la temperatura media de un día a partir de la temperatura
//máxima y mínima. Crear un programa principal, que, utilizando un procedimiento, vaya
//pidiendo la temperatura máxima y mínima de n días y vaya mostrando la media de cada día. El
//programa pedirá el número de días que se van a introducir.

Algoritmo TempPromedio
	Definir n Como Entero;
	Escribir "Ingrese el número de días";
	Leer n;
	
	promediar(n);
	
FinAlgoritmo

SubProceso promediar(n)
	Definir i Como Entero;
	Definir promedio, minima, maxima Como Real;
	promedio<-0;
	
	Para i=1 Hasta n Con Paso 1 Hacer
		Escribir "Ingrese la temperatura maxima del día ", i, " en grados Celsius";
		Leer maxima;
		Escribir "Ingrese la temperatura minima del día ", i, " en grados Celsius";
		Leer minima;
		
		promedio<-(maxima+minima)/2
		Escribir "Temperatura promedio del día ", i, " es: ", promedio, "ºC"
		Escribir "";
		Escribir "";
		Escribir "--------------------------------------------------------"
	FinPara
FinSubProceso
	