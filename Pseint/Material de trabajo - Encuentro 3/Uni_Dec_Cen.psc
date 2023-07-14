Algoritmo Uni_Dec_Cen
	Definir num Como Entero
	leer num
	escribir "Las unidades: ", num % 10	
	escribir "Las decenas: ", trunc((num % 100)/10)
	escribir "Las centenas: ", trunc(num/100)	
FinAlgoritmo
