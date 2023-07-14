//Crea una función EsMultiplo que reciba los dos números pasados por el usuario, validando
//que el primer número múltiplo del segundo y devuelva verdadero si el primer número es
//múltiplo del segundo, sino es múltiplo que devuelva falso.

Algoritmo Multiplos
	Definir num1, num2 Como Entero;
	Leer num1, num2;
	
	Escribir "¿El número ", num1, " es multiplo de ", num2, "?: ", esMultiplo(num1,num2);	
FinAlgoritmo

Funcion retorno <- esMultiplo(num1,num2)
	Definir retorno Como Logico;
	si (num1 mod num2 == 0) Entonces
		retorno<-Verdadero;
	SiNo
		retorno<-Falso;
	FinSi
FinFuncion
