//Escribir un programa que calcule cu�ntos litros de combustible consumi� un autom�vil. El
//usuario ingresar� una cantidad de litros de combustible cargados en la estaci�n y una
//cantidad de kil�metros recorridos, despu�s, el programa calcular� el consumo (km/lt) y se
//lo mostrar� al usuario.
Algoritmo ComsumoCombustible
	Definir liters Como Real
	Definir kilometres Como Real
	Definir comsume Como Real
	
	Escribir "Ingrese los litros de combustible cargados"
	leer liters
	Escribir "Ingrese los kilometros recorridos"
	leer kilometres
	
	comsume=kilometres/liters
	
	Escribir "El auto consumi� ", comsume, " km/lt"
	
	
FinAlgoritmo
