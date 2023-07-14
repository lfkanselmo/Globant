//Diseñe un algoritmo que lea un número de tres cifras y determine si es o no capicúa.

Algoritmo capicua
	Definir num, c1,c3 Como Entero
	Leer num
	c1<-trunc(num/100)
	c3<-num mod 10
	
	si (c1==c3) Entonces
		Escribir "El número es Capicúa"
	SiNo
		Escribir "El número no es Capicúa"
	FinSi
FinAlgoritmo
