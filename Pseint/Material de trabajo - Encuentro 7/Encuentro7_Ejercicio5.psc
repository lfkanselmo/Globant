//Escriba un programa que solicite dos números enteros (mínimo y máximo). A
//continuación, se debe pedir al usuario que ingrese números enteros situados entre el
//máximo y mínimo. Cada vez que un número se encuentre entre ese intervalo, se sumara
//uno a una variable. El programa terminará cuando se escriba un número que no
//pertenezca a ese intervalo, y al finalizar se debe mostrar por pantalla la cantidad de
//números ingresados dentro del intervalo.

Algoritmo Max_Min
	Definir max, min, contador, num Como Entero;
	Definir breaker Como Logico;
	Escribir "Ingrese valor minimo";
	Leer min
	Escribir "Ingrese valor máximo";
	Leer max;
	contador<-0;
	breaker=Verdadero;
	
	Mientras (min>max o min==max) Hacer
		Escribir "los valores ingrados para minimo y máximo no son apropiados, intente de nuevo";
		Escribir "Ingrese valor minimo";
		Leer min
		Escribir "Ingrese valor máximo";
		Leer max;
	FinMientras
	

	Mientras (breaker==Verdadero) Hacer
		Escribir "Ingrese número";
		Leer num;
		si(num<min o num>max) Entonces
			breaker<-Falso;
		SiNo
			contador<-contador+1;
		FinSi
	FinMientras
	
	Escribir "Se ingresaron " , contador , " números";
	
FinAlgoritmo
