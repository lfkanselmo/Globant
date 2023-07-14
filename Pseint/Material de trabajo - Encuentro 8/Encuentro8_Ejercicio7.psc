//Programar un juego donde la computadora elige un número al azar entre 1 y 10, y a
//continuación el jugador tiene que adivinarlo. La estructura del programa es la siguiente:
//1o) El programa elige al azar un número n entre 1 y 10.
//2o) El usuario ingresa un número x.
//3o) Si x no es el número exacto, el programa indica si n es más grande o más pequeño
//que el número ingresado.
//4o) Repetimos desde 2) hasta que x sea igual a n.
//El programa tiene que imprimir los mensajes adecuados para informarle al usuario qué
//hacer y qué pasó hasta que adivine el número.

Algoritmo Adivina_Numero
	Definir numIngresado, numSecreto Como Entero;

	
	numSecreto<-aleatorio(1,10);
	
	Hacer
		Escribir "Ingrese número";
		Leer numIngresado;
		
		si (numIngresado==numSecreto) Entonces
			Escribir "Correcto. Adivinaste el número secreto. Era el ", numSecreto;
		SiNo
			si (numIngresado<numSecreto) Entonces
				Escribir "el número que ingresaste es menor al número secreto";
				Escribir "---------------------------------------------------"
			SiNo
				Escribir "el número que ingresaste es mayor al número secreto";
				Escribir "---------------------------------------------------"
			FinSi
		FinSi
		
	Mientras Que (numIngresado<>numSecreto)
	
FinAlgoritmo
