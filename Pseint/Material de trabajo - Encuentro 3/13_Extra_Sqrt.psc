//Realizar un algoritmo que lea un número y que muestre su raíz cuadrada y su raíz cúbica.
//	PSeInt no tiene ninguna función predefinida que permita calcular la raíz cúbica, ¿Cómo se
//	puede calcular?
Algoritmo Sqrt
	definir num, r_Cuad, r_Cub Como real
	Leer num
	r_Cuad=num^(1/2)
	r_Cub<-num^(1/3)
	Escribir "el número ", num, " Tiene raíz cuadrada: ", r_Cuad, " y raíz cúbica: ", r_Cub
FinAlgoritmo
