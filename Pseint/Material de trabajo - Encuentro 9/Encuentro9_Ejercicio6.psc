//Siguiendo el ejercicio 20 de los ejercicios principales, ahora deberemos hacer lo mismo
//pero que la cadena se muestre al revés. Por ejemplo, si tenemos la cadena: Hola,
//deberemos mostrar a l o H.

Algoritmo Cadena_Frase
	Definir frase, CadenaCorta Como Caracter;
	Definir i Como Entero;
	Escribir "Ingrese la frase";
	Leer frase;
	
	Para i<-(Longitud(frase)-1) Hasta 0 Con Paso -1 Hacer
		CadenaCorta<-Subcadena(frase,i,i);
		Escribir CadenaCorta, "  " Sin Saltar;
	FinPara
FinAlgoritmo
