//Es tu turno, dise�a un condicional anidado que le pregunte al usuario si quiere tomar t� o caf� y
//	en caso de que quiera tomar caf�, preguntar si solo o cortado y en caso de ser cortado, si
//			prefiere leche vegetal.

Algoritmo Desayuno
	
	Definir bebida, cafe, leche Como Caracter
	bebida="";
	cafe="";
	leche="";
	Mientras (bebida<>"c" y bebida<>"t") Hacer
		Escribir "Ingrese una C si desea tomar caf� o una T si desea tomar t�";
		Leer bebida;
		bebida<-Minusculas(bebida);
	FinMientras
	
	
	si (bebida=="t") Entonces
		Escribir "disfrute su t�";
	SiNo
		Mientras (cafe<>"1" y cafe<>"2") Hacer
			Escribir "Escriba 1 si lo desea solo. Escriba 2 si lo desea cortado";
			leer cafe;
			si (cafe<>"1" y cafe<>"2") Entonces
				Escribir "Ingreso no valido. intente de nuevo";
			FinSi
		FinMientras
		
		si(cafe=="2") Entonces
			Mientras (leche<>"1" y leche<>"2") Hacer
				Escribir "Escriba 1 si desea leche vegetal. Escriba 2 si no quiere leche vegetal";
				leer leche;
				si (leche<>"1" y leche<>"2") Entonces
					Escribir "Ingreso no valido. intente de nuevo";
				FinSi
			FinMientras
			
			si (leche=="1") Entonces
				Escribir "Disfrute su caf� cortado con leche vegetal";
			SiNo
				Escribir "Disfrute su caf� cortado";
			FinSi
			
		SiNo
			Escribir "Disfrute su caf� solo"
		FinSi
		
	FinSi
	
FinAlgoritmo
