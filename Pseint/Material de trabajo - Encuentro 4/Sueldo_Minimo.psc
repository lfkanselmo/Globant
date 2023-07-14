//Un hombre desea saber si su sueldo es mayor al sueldo mínimo, el programa le pedirá al
//	usuario su sueldo actual y el sueldo mínimo. Si el sueldo es mayor al mínimo se debe
//		mostrar un mensaje por pantalla indicándolo.

Algoritmo Sueldo_Minimo
	Definir sueldoMinimo, sueldo Como Real
	Escribir "Ingrese el valor del sueldo minimo: "
	leer sueldoMinimo
	Escribir "Ingrese el valor del sueldo: "
	leer sueldo
	
	si(sueldo<sueldoMinimo) Entonces
		Escribir "El sueldo es menor al minimo"
	SiNo
		Escribir "El sueldo es mayor al minimo"
	FinSi
FinAlgoritmo
