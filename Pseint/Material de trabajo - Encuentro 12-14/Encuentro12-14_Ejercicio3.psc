//Crea una funci�n EsMultiplo que reciba los dos n�meros pasados por el usuario, validando
//que el primer n�mero m�ltiplo del segundo y devuelva verdadero si el primer n�mero es
//m�ltiplo del segundo, sino es m�ltiplo que devuelva falso.

Algoritmo Multiplos
	Definir num1, num2 Como Entero;
	Leer num1, num2;
	
	Escribir "�El n�mero ", num1, " es multiplo de ", num2, "?: ", esMultiplo(num1,num2);	
FinAlgoritmo

Funcion retorno <- esMultiplo(num1,num2)
	Definir retorno Como Logico;
	si (num1 mod num2 == 0) Entonces
		retorno<-Verdadero;
	SiNo
		retorno<-Falso;
	FinSi
FinFuncion
