//Realizar una funci�n que valide si un n�mero es impar o no. Si es impar la funci�n debe
//devolver un verdadero, si no es impar debe devolver falso. Nota: la funci�n no debe tener
//mensajes que digan si es par o no, eso debe pasar en el Algoritmo.

Algoritmo ParInpar
	Definir num Como Entero;
	Leer num;
	Escribir "�El n�mero ", num, " es par?: ", par_inpar(num);
FinAlgoritmo

Funcion retorno<-par_inpar(num)
	Definir retorno Como Logico
	si (num mod 2 == 0) Entonces
		retorno<-Verdadero;
	SiNo
		retorno<-Falso;
	FinSi
FinFuncion
