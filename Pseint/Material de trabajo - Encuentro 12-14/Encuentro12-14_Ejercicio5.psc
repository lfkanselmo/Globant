//Realizar una funci�n que reciba un numero ingresado por el usuario y averig�e si el n�mero es
//primo o no. Un n�mero es primo cuando es divisible s�lo por 1 y por s� mismo, por ejemplo: 2,
//	3, 5, 7, 11, 13, 17, etc.

//Teorema: Basta con probar s�lo hasta la ra�z cuadrada del n�mero.

Algoritmo Primos
	Definir num Como Entero;
	Leer num;
	
	Escribir "�El n�mero ", num, " es primo?: ", primo(num);
	
FinAlgoritmo

Funcion retorno<-primo(num)
	Definir retorno Como Logico;
	Definir i Como Entero;
	
	Para i=2 Hasta trunc((num)^(1/2))	Con Paso 1 Hacer
		si(num mod i == 0) Entonces
			retorno<-Falso;
			i<-trunc(num^(1/2));
			
		SiNo
			retorno<-Verdadero;
		FinSi
	FinPara
	
FinFuncion
	