//Si se compran menos de cinco llantas el precio es de $3000 cada una, si se compran
//		entre 5 y 10 el precio es de $2500, y si se compran más de 10 el precio es $2000.
//			Obtener la cantidad de dinero que una persona tiene que pagar por cada una de las
//			llantas que compra, y el monto total que tiene que pagar por el total de la compra.

Algoritmo Llant4s
	Definir llantas Como Entero;
	Definir clave Como Logico;
	clave=Falso;
	Mientras (clave==Falso) Hacer
		Leer llantas;
		si (llantas<1) Entonces
			Escribir "Valor ingresado erroneo. Intente de nuevo";
		SiNo
			clave=Verdadero;
		FinSi
		
	FinMientras
	
	si (llantas<5) Entonces
		Escribir "Paga $3000 por cada llanta y en total paga: " , (3000*llantas);
	SiNo
		si (llantas>=5 y llantas<=10) Entonces
			Escribir "Paga $2500 por cada llanta y en total paga: " , (2500*llantas);
		SiNo
			Escribir "Paga $2000 por cada llanta y en total paga: " , (2000*llantas);
		FinSi
	FinSi
FinAlgoritmo
