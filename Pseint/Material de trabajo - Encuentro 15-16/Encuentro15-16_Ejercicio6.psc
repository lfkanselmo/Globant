//Realizar un subproceso que reciba una letra y muestre un mensaje si esa letra esta entre las
//		letras "M" y "T". Recordar que Pseint le da un valor num�rico a cada letra a trav�s del C�digo
//		Ascii, lo que nos deja usar operadores relacionales con letras y cadenas.

Algoritmo entreM_T
	Definir letra Como Caracter;
	Leer letra;
	letra<-Minusculas(letra);
	
	entre(letra);
	
FinAlgoritmo

SubProceso entre(letra)
	si (letra<"t" y letra>"m") Entonces
		Escribir "La letra ", Mayusculas(letra), " se encuentra entre M y T";
	SiNo
		Escribir "La letra ", Mayusculas(letra), " NO se encuentra entre M y T";
	FinSi
FinSubProceso
	