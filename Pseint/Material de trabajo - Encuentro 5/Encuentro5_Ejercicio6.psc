//Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
//	es una ?A?. Si la primera letra es una ?A?, se deber� de imprimir un mensaje por pantalla
//	que diga "CORRECTO", en caso contrario, se deber� imprimir "INCORRECTO". Nota:
//		investigar la funci�n Subcadena de PseInt.

Algoritmo Primera_Letra
	definir palabra, letra Como Caracter;
	leer palabra;
	letra<-Subcadena(palabra,0,0);
	
	si (letra=="A" o letra=="a" o letra=="�" o letra=="�") Entonces
		Escribir "CORRECTO";
	SiNo
		Escribir "INCORRECTO";
	FinSi
	
FinAlgoritmo
