//Realizar una función que reciba un numero ingresado por el usuario y averigüe si el número es
//capicúa o no (Por ejemplo: 12321). Nota: recordar el uso del MOD y el Trunc. No podemos
//transformar el numero a cadena para realizar el ejercicio.

Algoritmo Capicula
	Definir num Como Entero;
	Leer num;
	Escribir "¿El número ", num, " es capicúa?: ",capicular(num);
FinAlgoritmo

Funcion retorno<-capicular(num)
	Definir retorno Como Logico;
	Definir numero2, i, temporal, digito, contador Como Entero;
	contador<-0;
	temporal<-num;
	numero2<-0;
	
	Mientras (temporal > 0) Hacer
		temporal<-trunc(temporal/10);
		contador<-contador+1;
	FinMientras
	temporal<-num;
	
	Para i=1 Hasta contador Con Paso 1 Hacer
		digito<- temporal mod 10;
		temporal<- trunc(temporal/10);
		
		numero2<-numero2+(digito*(10^(contador-i)))
	FinPara
	
	si (num==numero2) Entonces
		retorno<-Verdadero
	sino
		retorno<-falso;
	FinSi
	
FinFuncion
	