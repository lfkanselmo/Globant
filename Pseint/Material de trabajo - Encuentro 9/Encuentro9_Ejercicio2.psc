//Realizar un programa que pida una frase y el programa deberá mostrar la frase con un
//espacio entre cada letra. La frase se mostrará así: H o l a.

Algoritmo Cadena_Frase
	Definir frase, CadenaCorta Como Caracter;
	Definir i Como Entero;
	Escribir "Ingrese la frase";
	Leer frase;
	
	Para i<-0 Hasta Longitud(frase) Con Paso 1 Hacer
		CadenaCorta<-Subcadena(frase,i,i);
		Escribir CadenaCorta, "  " Sin Saltar;
	FinPara
FinAlgoritmo
