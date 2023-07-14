//Realizar una funci�n que reciba un numero ingresado por el usuario y averig�e si el n�mero es
//capic�a o no (Por ejemplo: 12321). Nota: recordar el uso del MOD y el Trunc. No podemos
//		transformar el numero a cadena para realizar el ejercicio.

Algoritmo Enc12_Ej13
	definir num Como Entero
	Escribir "Por favor ingrese un n�mero: "
	leer num
	
	si EsCapicua(num) Entonces
		Escribir "Es capic�a! :)"
	SiNo
		Escribir "No es capic�a! :("
	FinSi
	
FinAlgoritmo

funcion retorno = EsCapicua(num)
	definir retorno Como Logico
	definir i, contador, extremoD, extremoI, aux Como Entero
	contador = 1
	aux = num
	
	Mientras trunc(aux/10) > 0 Hacer
		contador = contador + 1
		aux = trunc(aux/10)
	FinMientras
	
	para i = 1 hasta trunc(contador/2) Hacer
		extremoD = trunc(num/(10)^(contador-1))
		extremoI = num mod 10
		
		si extremoD == extremoI
			retorno = Verdadero
		SiNo
			retorno = falso
		FinSi
		
		num = num - trunc(num/(10)^(contador-i))
		num = num - num mod 10
		
	FinPara
	
FinFuncion


