//Dado un n�mero de dos cifras, dise�e un algoritmo que permita obtener el n�mero
//	invertido. Ejemplo, si se introduce 23 que muestre 32.
Algoritmo Turn_Number
	definir num, c1, c2 Como Entero
	leer num
	c1<-num mod 10
	c2<-trunc(num/10)
	Escribir "El invertido de ", num," es: ",(c1*10)+c2
FinAlgoritmo
