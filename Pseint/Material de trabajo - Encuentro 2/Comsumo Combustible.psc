//Escribir un programa que calcule cuántos litros de combustible consumió un automóvil. El
//usuario ingresará una cantidad de litros de combustible cargados en la estación y una
//cantidad de kilómetros recorridos, después, el programa calculará el consumo (km/lt) y se
//lo mostrará al usuario.
Algoritmo ComsumoCombustible
	Definir liters Como Real
	Definir kilometres Como Real
	Definir comsume Como Real
	
	Escribir "Ingrese los litros de combustible cargados"
	leer liters
	Escribir "Ingrese los kilometros recorridos"
	leer kilometres
	
	comsume=kilometres/liters
	
	Escribir "El auto consumió ", comsume, " km/lt"
	
	
FinAlgoritmo
