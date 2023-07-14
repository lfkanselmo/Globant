//Solicitar al usuario que ingrese un valor entre 1 y 7. EL programa debe mostrar por
//pantalla un mensaje que indique a qué día de la semana corresponde. Considere que el
//número 1 corresponde al día "Lunes", y así sucesivamente.

Algoritmo Dia_Semana
	Definir num Como Entero;
	num=0;
	
	Mientras (num<1 o num>7) Hacer
		Escribir "Ingrese número"
		Leer num;
		si (num<1 o num>7) Entonces
			Escribir "Valor ingresado incorrecto. intente de nuevo..."
		FinSi
	FinMientras
	
	Segun (num) Hacer
		1:
			Escribir "Lunes";
		2:
			Escribir "Martes";
		3:
			Escribir "Miércoles";
		4:
			Escribir "Jueves";
		5:
			Escribir "Viernes";
		6:
			Escribir "Sábado";
		7: 
			Escribir "Domingo";
	FinSegun
	
FinAlgoritmo
