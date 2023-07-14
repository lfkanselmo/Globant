//Una tienda ofrece para los meses de septiembre, octubre y noviembre un descuento del
//	10% sobre el total de la compra que realiza un cliente. Solicitar al usuario que ingrese un
//	mes y el importe de la compra. El programa debe calcular cuál es el monto total que se
//	debe cobrar al cliente e imprimirlo por pantalla.

Algoritmo Descuento
	Definir montoCompra Como Real;
	Definir mes Como Caracter;
	Escribir "Ingrese el mes";
	Leer mes;
	Escribir "Ingrese el monto de la compra del cliente";
	Leer montoCompra;
	
	mes<-Minusculas(mes);
	
	si(mes=="septiembre" o mes=="octubre" o mes=="noviembre") Entonces
			Escribir "Felicidades, le corresponde un descuento del 18%. Su compra será: ", montoCompra - (montoCompra*0.18);
		SiNo
			Escribir "Su monto de compra será: ", montoCompra;
		FinSi
	
FinAlgoritmo
