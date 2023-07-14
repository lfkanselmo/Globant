//Continuando el ejercicio anterior, ahora se pedirá una frase o palabra y se validara si la
//	primera letra de la frase es igual a la última letra de la frase. Se deberá de imprimir un
//	2 mensaje por pantalla que diga "CORRECTO", en caso contrario, se deberá imprimir
//	"INCORRECTO".

Algoritmo Letras_Iguales
	definir frase, letra1, letra2 Como Caracter;
	Definir length Como Entero;
	leer frase;
	letra1<-Subcadena(frase,0,0);
	length<-longitud(frase);
	letra2<-Subcadena(frase,(length-1),(length-1));
	
	si (letra1==letra2) Entonces
		Escribir "CORRECTO";
	SiNo
		Escribir "INCORRECTO";
	FinSi
FinAlgoritmo
