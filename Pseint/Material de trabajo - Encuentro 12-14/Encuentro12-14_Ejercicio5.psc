//Realizar una función que reciba un numero ingresado por el usuario y averigüe si el número es
//primo o no. Un número es primo cuando es divisible sólo por 1 y por sí mismo, por ejemplo: 2,
//	3, 5, 7, 11, 13, 17, etc.

//Teorema: Basta con probar sólo hasta la raíz cuadrada del número.

Algoritmo Primos
	Definir num Como Entero;
	Leer num;
	
	Escribir "¿El número ", num, " es primo?: ", primo(num);
	
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
	