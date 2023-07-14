//Escriba un programa para obtener el grado de eficiencia de un operario de una f�brica de
//	tornillos, de acuerdo a las siguientes dos condiciones que se le imponen para un per�odo
//	de prueba:
//		x Producir menos de 200 tornillos defectuosos.
//		x Producir m�s de 10000 tornillos sin defectos.
//	x El grado de eficiencia se determina de la siguiente manera:
//		x Si no cumple ninguna de las condiciones, grado 5.
//			x Si s�lo cumple la primera condici�n, grado 6.
//				x Si s�lo cumple la segunda condici�n, grado 7.
//					x Si cumple las dos condiciones, grado 8.

Algoritmo Grado_Eficiencia
	Definir numDefectuosos, numSinDefectos Como Entero;
	Escribir "Ingrese la cantidad de tornillos defectuosos: ";
	Leer numDefectuosos;
	Escribir "ingrese la cantidad de tornillos sin defectos";
	Leer numSinDefectos;
	
	si ((numDefectuosos>200) y (numSinDefectos<10000)) Entonces
		Escribir "Grado 5";
	SiNo
		si ((no(numDefectuosos>200)) y (numSinDefectos<10000)) Entonces
			Escribir "Grado 6";
		SiNo
			si ((numDefectuosos>200) y (no(numSinDefectos<10000))) Entonces
				Escribir "Grado 7";
			SiNo
				Escribir "Grado 8";
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo
