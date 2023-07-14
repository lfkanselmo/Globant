//Una compa��a de seguros tiene contratados a n vendedores. Cada vendedor realiza
//m�ltiples ventas a la semana. La pol�tica de pagos de la compa��a es que cada vendedor
//recibe un sueldo base m�s un 10% extra por comisiones de sus ventas. El gerente de la
//compa��a desea saber, por un lado, cu�nto dinero deber� pagar en la semana a cada
//vendedor por concepto de comisiones de las ventas realizadas, y por otro lado, cu�nto
//deber� pagar a cada vendedor como sueldo total (sueldo base + comisiones). Para cada
//	vendedor ingresar cuanto es su sueldo base, cuantas ventas realiz� y cuanto cobr� por
//cada venta.

Algoritmo Seguros
	Definir nVentas, i, j, nVendedores Como Entero;
	Definir sueldoBase, comisiones, valorVenta, ventas Como Real;
	
	Escribir "Ingrese el n�mero de vendedores";
	Leer nVendedores;
	
	Para i=1 Hasta nVendedores Con Paso 1 Hacer
		ventas<-0;
		Escribir "Ingrese el sueldo base del vendedor ", i;
		Leer sueldoBase;
		Escribir "Ingrese el n�mero de ventas del vendedor ",i;
		Leer nVentas;
		
		Para j=1 Hasta nVentas Con Paso 1 Hacer
			Escribir "Valor de la venta ", j;
			leer valorVenta;
			ventas<-ventas+valorVenta;
		FinPara
		
		Escribir "El vendedor ", i, " hizo ", (ventas*0.10), " en comisiones.";
		Escribir "El sueldo total del vendedor ", i, " es: ", sueldoBase+(ventas*0.10);
		Escribir "---------------------------------------------------------------------"
		
	FinPara
	
FinAlgoritmo
