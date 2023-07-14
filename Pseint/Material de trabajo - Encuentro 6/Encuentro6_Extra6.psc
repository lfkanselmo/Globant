Algoritmo Manzanas
	Definir kilos,valorManzanas Como Real;
	Escribir "Ingrese cantidad de kilos a comprar";
	Leer kilos;
	Escribir "Ingrese el valor de las manzanas por cada kilo";
	Leer valorManzanas;
	

	si (0<kilos y kilos<=2) Entonces
		Escribir "Tiene descuento del 0%. Valor a pagar: " , (kilos*valorManzanas);
	SiNo
		si (2.01<kilos y kilos<=5) Entonces
			Escribir "Tiene descuento del 10%. Valor a pagar: " , (kilos*valorManzanas)-((kilos*valorManzanas)*0.10);
		SiNo
			si (5.01<kilos y kilos<=10) Entonces
				Escribir "Tiene descuento del 15%. Valor a pagar: " , (kilos*valorManzanas)-((kilos*valorManzanas)*0.15);
			SiNo
				si (kilos>10) Entonces
					Escribir "Tiene descuento del 20%. Valor a pagar: " , (kilos*valorManzanas)-((kilos*valorManzanas)*0.20);
					
				FinSi
			FinSi
		FinSi
	FinSi
	
	
	Escribir "FIN";
	
FinAlgoritmo
