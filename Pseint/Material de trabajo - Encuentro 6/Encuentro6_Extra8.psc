//Una empresa tiene personal de distintas áreas con distintas condiciones de contratación y
//formas de pago. El departamento de contabilidad necesita calcular los sueldos semanales
//(lunes a viernes) en base a las 3 modalidades de sueldo:
//a) comisión
//b) salario fijo + comisión, y
//c) salario fijo
//a) Para la modalidad salario por comisión se debe ingresar el monto total de las ventas
//realizadas en la semana, y el 40% de ese monto total corresponde al salario del
//empleado.
//b) Para la condición de salario fijo + comisión, se debe ingresar el valor que se paga por
//hora, la cantidad de horas trabajadas semanalmente y el monto total de las ventas en
//esa semana. En este tipo de contrato las horas extras no están contempladas y se fija
//como máximo 40 horas por semana. La comisión por las ventas se calcula como 25%
//del valor de venta total.
//c) Finalmente, para la modalidad de salario fijo se debe ingresar el valor que se paga
//por hora y la cantidad de horas trabajadas en la semana. En el caso de exceder las
//40 horas semanales, las horas extras se deben pagar con un extra del 50% del valor
//de la hora. Realizar un menú de opciones para poder elegir el tipo de contrato que tiene un empleado.

Algoritmo Forma_Pago
	Definir tipo, horas, horasExtra Como Entero;
	Definir ventasTotales, salarioEmpleado, valorHora Como Real;
	
	Escribir "Ingrese el número del tipo de contrato que posee el empleado";
	Escribir "1. para Comisión";
	Escribir "2. para Comisión + Salario fijo";
	Escribir "3. para Salario fijo";
	Leer tipo;
	salarioEmpleado<-0;
	horasExtra<-0;
	horas<-0;
	ventasTotales<-0;
	valorHora<-0;
	
	
	Mientras (tipo<1 o tipo>3) Hacer
		Escribir "Tipo de contrato ingresado es incorrecto. Intente de nuevo";
		Escribir "1. para Comisión";
		Escribir "2. para Comisión + Salario fijo";
		Escribir "3. para Salario fijo";
		Leer tipo;
	FinMientras
	
	
	Segun (tipo) Hacer
		1: 
			Escribir "Ingrese el monto total de las ventas realizadas en la semana"
			Leer ventasTotales;
			salarioEmpleado<-(ventasTotales*0.40);
			
		2:
			Escribir "Ingrese el valor que se paga por hora trabajada";
			Leer valorHora;
			Escribir "Ingrese la cantidad de horas totales que trabajó está semana";
			Leer horas;
			si (horas>40) Entonces
				horas<-40;
			FinSi
			Escribir "Ingrese el monto total de las ventas realizadas en la semana";
			Leer ventasTotales;
			
			salarioEmpleado<-(valorHora*horas) + (ventasTotales*0.25);
			
		3:
			Escribir "Ingrese el valor que se paga por hora trabajada";
			Leer valorHora;
			Escribir "Ingrese la cantidad de horas totales que trabajó está semana";
			Leer horas;
			si (horas>40) Entonces
				horasExtra<-horas-40;
			FinSi
			
			salarioEmpleado<-(horas*valorHora) + (horasExtra*(valorHora*0.50));
			
	FinSegun
	
	Escribir "El salario del empleado es: " , salarioEmpleado , ". Se pagan " , horasExtra , " horas extras.";
	
FinAlgoritmo
