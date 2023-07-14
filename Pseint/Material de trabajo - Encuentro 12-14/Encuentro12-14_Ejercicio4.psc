//Realizar un programa que pida al usuario una frase y una letra a buscar en esa frase. La
//función debe devolver la cantidad de veces que encontró la letra. Nota: recordar el uso de la
//función Subcadena().

Algoritmo FraseLetra
	Definir frase, letra Como Caracter;
	Definir pasa Como Entero;
	Escribir "Ingrese la frase";
	Leer frase;
	
	Hacer
		Escribir "Ingrese la letra a buscar";
		Leer letra;
		pasa<-Longitud(letra);
	Mientras Que (pasa<>1)
	
	Escribir "La letra ", Mayusculas(letra) , " aparece ", buscar(frase, letra), " en la frase";
	
FinAlgoritmo

Funcion cantidad<-buscar(frase, letra)
	Definir cantidad, nLetras, i Como Entero;
	cantidad<-0;
	nLetras<-Longitud(frase);
	Para i<-0 Hasta nLetras Con Paso 1 Hacer
		si (Subcadena(frase,i,i)==letra) Entonces
			cantidad<-cantidad+1;
		FinSi
	FinPara
FinFuncion
	