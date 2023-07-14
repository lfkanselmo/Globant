//Pide al usuario dos números y muestra la "distancia" entre ellos (el valor absoluto de su
//diferencia, de modo que el resultado sea siempre positivo).
Algoritmo Valor_Absoluto_diferencia
	Definir num1, num2, dif Como Real
	Escribir "Ingrese los números: "
	leer num1, num2
	dif = num1-num2
	Si dif<0 Entonces
		dif<-dif*(-1)
	SiNo
		acciones_por_falso
	Fin Si
	Escribir "La diferencia es"
FinAlgoritmo
