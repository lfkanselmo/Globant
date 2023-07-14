//Leer tres n�meros que denoten una fecha (d�a, mes, a�o) y comprobar que sea una
//fecha v�lida. Si la fecha no es v�lida escribir un mensaje de error por pantalla. Si la fecha
//es v�lida se debe imprimir la fecha cambiando el n�mero que representa el mes por su
//nombre. Por ejemplo: si se introduce 1 2 2006, se deber� imprimir "1 de febrero de 2006".

Algoritmo Fecha
	Definir nDia, nMes, nAno Como Entero;
	Definir llaveCorrecta Como Logico;
	Definir tCristo, mes Como Caracter;
	llaveCorrecta=Falso;
	tCristo="";
	mes="";
	nDia=0;
	nMes=0;
	nAno=0;
	
	Mientras (llaveCorrecta==Falso) Hacer
		Escribir "Ingrese el A�o";
		Leer nAno;
		
		si (nAno<0) Entonces
			tCristo="A.C."
		FinSi
		llaveCorrecta=Verdadero;
	FinMientras
	llaveCorrecta=Falso;
	
	Mientras (llaveCorrecta=Falso) Hacer
		Escribir "Escriba el n�mero del Mes";
		Leer nMes;
		
		si (nMes<1 o nMes>12) Entonces
			Escribir "Valor incorrecto, intente de nuevo";
		SiNo
			llaveCorrecta=Verdadero;
		FinSi
	FinMientras
	
	llaveCorrecta=Falso;
	
	Segun (nMes) Hacer
		1:
			Mientras (llaveCorrecta==Falso) Hacer
				Escribir "Ingrese el n�mero de D�a";
				Leer nDia;
				si (nDia<1 o nDia>31) Entonces
					Escribir "Valor incorrecto, intente de nuevo";
				SiNo
					llaveCorrecta=Verdadero;
					mes="Enero";
				FinSi
			FinMientras
			
		2:
			Mientras (llaveCorrecta==Falso) Hacer
				Escribir "Ingrese el n�mero de D�a";
				Leer nDia;
				si (nDia<1 o nDia>28) Entonces
					Escribir "Valor incorrecto, intente de nuevo";
				SiNo
					llaveCorrecta=Verdadero;
					mes="Febrero";
				FinSi
			FinMientras
			
		3:
			Mientras (llaveCorrecta==Falso) Hacer
				Escribir "Ingrese el n�mero de D�a";
				Leer nDia;
				si (nDia<1 o nDia>31) Entonces
					Escribir "Valor incorrecto, intente de nuevo";
				SiNo
					llaveCorrecta=Verdadero;
					mes="Marzo";
				FinSi
			FinMientras
			
		4:
			Mientras (llaveCorrecta==Falso) Hacer
				Escribir "Ingrese el n�mero de D�a";
				Leer nDia;
				si (nDia<1 o nDia>30) Entonces
					Escribir "Valor incorrecto, intente de nuevo";
				SiNo
					llaveCorrecta=Verdadero;
					mes="Abril";
				FinSi
			FinMientras
			
		5:
			Mientras (llaveCorrecta==Falso) Hacer
				Escribir "Ingrese el n�mero de D�a";
				Leer nDia;
				si (nDia<1 o nDia>31) Entonces
					Escribir "Valor incorrecto, intente de nuevo";
				SiNo
					llaveCorrecta=Verdadero;
					mes="Mayo";
				FinSi
			FinMientras
			
		6:
			Mientras (llaveCorrecta==Falso) Hacer
				Escribir "Ingrese el n�mero de D�a";
				Leer nDia;
				si (nDia<1 o nDia>30) Entonces
					Escribir "Valor incorrecto, intente de nuevo";
				SiNo
					llaveCorrecta=Verdadero;
					mes="Junio";
				FinSi
			FinMientras
			
		7:
			Mientras (llaveCorrecta==Falso) Hacer
				Escribir "Ingrese el n�mero de D�a";
				Leer nDia;
				si (nDia<1 o nDia>31) Entonces
					Escribir "Valor incorrecto, intente de nuevo";
				SiNo
					llaveCorrecta=Verdadero;
					mes="Julio";
				FinSi
			FinMientras
			
		8:
			Mientras (llaveCorrecta==Falso) Hacer
				Escribir "Ingrese el n�mero de D�a";
				Leer nDia;
				si (nDia<1 o nDia>31) Entonces
					Escribir "Valor incorrecto, intente de nuevo";
				SiNo
					llaveCorrecta=Verdadero;
					mes="Agosto";
				FinSi
			FinMientras
			
		9:
			Mientras (llaveCorrecta==Falso) Hacer
				Escribir "Ingrese el n�mero de D�a";
				Leer nDia;
				si (nDia<1 o nDia>30) Entonces
					Escribir "Valor incorrecto, intente de nuevo";
				SiNo
					llaveCorrecta=Verdadero;
					mes="Septiembre";
				FinSi
			FinMientras
			
		10: 
			Mientras (llaveCorrecta==Falso) Hacer
				Escribir "Ingrese el n�mero de D�a";
				Leer nDia;
				si (nDia<1 o nDia>31) Entonces
					Escribir "Valor incorrecto, intente de nuevo";
				SiNo
					llaveCorrecta=Verdadero;
					mes="Octubre";
				FinSi
			FinMientras
			
		11:
			Mientras (llaveCorrecta==Falso) Hacer
				Escribir "Ingrese el n�mero de D�a";
				Leer nDia;
				si (nDia<1 o nDia>30) Entonces
					Escribir "Valor incorrecto, intente de nuevo";
				SiNo
					llaveCorrecta=Verdadero;
					mes="Noviembre";
				FinSi
			FinMientras
			
		12:
			Mientras (llaveCorrecta==Falso) Hacer
				Escribir "Ingrese el n�mero de D�a";
				Leer nDia;
				si (nDia<1 o nDia>31) Entonces
					Escribir "Valor incorrecto, intente de nuevo";
				SiNo
					llaveCorrecta=Verdadero;
					mes="Diciembre";
				FinSi
			FinMientras
			
	FinSegun
	
	Escribir nDia , " de ", mes ," de " , nAno , tCristo;
	
FinAlgoritmo
