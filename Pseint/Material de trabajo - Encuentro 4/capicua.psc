//Dise�e un algoritmo que lea un n�mero de tres cifras y determine si es o no capic�a.

Algoritmo capicua
	Definir num, c1,c3 Como Entero
	Leer num
	c1<-trunc(num/100)
	c3<-num mod 10
	
	si (c1==c3) Entonces
		Escribir "El n�mero es Capic�a"
	SiNo
		Escribir "El n�mero no es Capic�a"
	FinSi
FinAlgoritmo
