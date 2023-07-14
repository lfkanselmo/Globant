//Escriba un programa que solicite dos n�meros enteros (m�nimo y m�ximo). A
//continuaci�n, se debe pedir al usuario que ingrese n�meros enteros situados entre el
//m�ximo y m�nimo. Cada vez que un n�mero se encuentre entre ese intervalo, se sumara
//uno a una variable. El programa terminar� cuando se escriba un n�mero que no
//pertenezca a ese intervalo, y al finalizar se debe mostrar por pantalla la cantidad de
//n�meros ingresados dentro del intervalo.

Algoritmo Max_Min
	Definir max, min, contador, num Como Entero;
	Definir breaker Como Logico;
	Escribir "Ingrese valor minimo";
	Leer min
	Escribir "Ingrese valor m�ximo";
	Leer max;
	contador<-0;
	breaker=Verdadero;
	
	Mientras (min>max o min==max) Hacer
		Escribir "los valores ingrados para minimo y m�ximo no son apropiados, intente de nuevo";
		Escribir "Ingrese valor minimo";
		Leer min
		Escribir "Ingrese valor m�ximo";
		Leer max;
	FinMientras
	

	Mientras (breaker==Verdadero) Hacer
		Escribir "Ingrese n�mero";
		Leer num;
		si(num<min o num>max) Entonces
			breaker<-Falso;
		SiNo
			contador<-contador+1;
		FinSi
	FinMientras
	
	Escribir "Se ingresaron " , contador , " n�meros";
	
FinAlgoritmo
