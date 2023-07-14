//Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la
//		nota se pedirá de nuevo hasta que la nota sea correcta.

Algoritmo Nota
	Definir vNota Como Real;
	Leer vNota;
	si (vNota>=0 y vNota<=10) Entonces
		Escribir "Nota ingresada admitida. Procesando...";
	SiNo
		Mientras (vNota<0 o vNota>10) Hacer
			Escribir "Nota ingresada no valida, siga intentando...";
			Leer vNota;
			si (vNota>=0 y vNota<=10) Entonces
				Escribir "Nota ingresada admitida. Procesando...";
			FinSi
		FinMientras
	FinSi
	
	
	
FinAlgoritmo
