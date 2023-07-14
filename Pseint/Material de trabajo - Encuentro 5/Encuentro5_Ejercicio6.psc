//Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
//	es una ?A?. Si la primera letra es una ?A?, se deberá de imprimir un mensaje por pantalla
//	que diga "CORRECTO", en caso contrario, se deberá imprimir "INCORRECTO". Nota:
//		investigar la función Subcadena de PseInt.

Algoritmo Primera_Letra
	definir palabra, letra Como Caracter;
	leer palabra;
	letra<-Subcadena(palabra,0,0);
	
	si (letra=="A" o letra=="a" o letra=="Á" o letra=="á") Entonces
		Escribir "CORRECTO";
	SiNo
		Escribir "INCORRECTO";
	FinSi
	
FinAlgoritmo
