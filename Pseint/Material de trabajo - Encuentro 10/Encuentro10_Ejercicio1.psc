//Una compañía de seguros tiene contratados a n vendedores. Cada vendedor realiza
//múltiples ventas a la semana. La política de pagos de la compañía es que cada vendedor
//recibe un sueldo base más un 10% extra por comisiones de sus ventas. El gerente de la
//compañía desea saber, por un lado, cuánto dinero deberá pagar en la semana a cada
//vendedor por concepto de comisiones de las ventas realizadas, y por otro lado, cuánto
//deberá pagar a cada vendedor como sueldo total (sueldo base + comisiones). Para cada
//	vendedor ingresar cuanto es su sueldo base, cuantas ventas realizó y cuanto cobró por
//cada venta.

Algoritmo Seguros
	Definir nVentas, i, j, nVendedores Como Entero;
	Definir sueldoBase, comisiones, valorVenta, ventas Como Real;
	
	Escribir "Ingrese el número de vendedores";
	Leer nVendedores;
	
	Para i=1 Hasta nVendedores Con Paso 1 Hacer
		ventas<-0;
		Escribir "Ingrese el sueldo base del vendedor ", i;
		Leer sueldoBase;
		Escribir "Ingrese el número de ventas del vendedor ",i;
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
