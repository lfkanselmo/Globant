//Una empresa de venta de productos por correo desea realizar una estadística de las ventas
//realizadas de cada uno de sus productos a lo largo de una semana. Distribuya luego 5
//productos en los 5 días hábiles de la semana. Se desea conocer:
//	a) Total de ventas por cada día de la semana.
//	b) Total de ventas de cada producto a lo largo de la semana.
//	c) El producto más vendido en cada semana.
//	d) El nombre, el día de la semana y la cantidad del producto más vendido.

Algoritmo ventas
	Definir matriz Como Entero;
	Dimension matriz(7,6);
	rellenar(matriz);
	totalProductos(matriz);
	ver(matriz);
	
FinAlgoritmo

//SubProceso para rellenar la matriz
SubProceso rellenar(matriz Por Referencia)
	Definir i,j Como Entero;
	Para i=0 Hasta 4 Con Paso 1 Hacer
		Para j=0 Hasta 4 Con Paso 1 Hacer
			matriz[i,j]<-Aleatorio(1,30);
		FinPara
	FinPara
FinSubProceso

//SubProceso para imprimir la matriz
SubProceso ver(matriz Por Referencia)
	Definir i,j Como Entero;
	Para i=0 Hasta 6 Con Paso 1 Hacer
		Para j=0 Hasta 5 Con Paso 1 Hacer
			Escribir sin saltar "[",matriz[i,j],"] ";
		FinPara
		Escribir "";
	FinPara
FinSubProceso

//SubProceso para el total de los productos
SubProceso totalProductos(matriz Por Referencia)
	Definir i,j,pMasVendido, suma,pMasVendidoSemana Como Entero;
	
	matriz[6,5]<-0;
	
	//Para contar el total por semana y el más vendido por día
	matriz[5,5]<-0;
	Para j=0 Hasta 4 Con Paso 1 Hacer
		suma<-0;
		pMasVendido<-0;
		Para i=0 Hasta 4 Con Paso 1 Hacer
			suma<-suma+matriz[i,j];	
			si (i<>0) Entonces
				si (matriz[i,j]>matriz[pMasVendido,j]) Entonces
					pMasVendido<-i;
				FinSi
			FinSi
		FinPara
		matriz[5,j]<-suma;
		matriz[6,j]<-pMasVendido+1;
	FinPara
	
	//Para contabilizar el total de productos
	Para i=0 hasta 5 Con Paso 1 Hacer
		suma<-0;
		Para j=0 Hasta 5 Con Paso 1 Hacer
			si (j<>5) Entonces
				suma<-suma+matriz[i,j];
			SiNo
				matriz[i,j]<-suma;
			FinSi
		FinPara
	FinPara
	
	//Contar el producto más vendido por semana
	pMasVendidoSemana<-0;
	Para i=1 Hasta 4 Con Paso 1 Hacer
		si (matriz[i,5]>matriz[i-1,5]) Entonces
			pMasVendidoSemana<-i+1;
		FinSi
	FinPara
	
	//mostrar el total de ventas por cada día de la semana
	Escribir "";
	Escribir "Total de ventas por cada día de la semana";
	Escribir "";
	Para i=0 Hasta 4 Con Paso 1 Hacer
		Segun i Hacer
			0:
				Escribir "Lunes: ",matriz[5,i];
			1:
				Escribir "Martes: ",matriz[5,i];
			2:
				Escribir "Miércoles: ",matriz[5,i];
			3:
				Escribir "Jueves: ",matriz[5,i];
			4:
				Escribir "Viernes: ",matriz[5,i];
				
		FinSegun
	FinPara
	
	//Mostrar el total de ventas de cada producto a lo largo de la semana
	Escribir "";
	Escribir "";
	Escribir "Total de ventas por cada día de la semana";
	Escribir "";
	Para i=0 Hasta 4 Con Paso 1 Hacer
		Segun i Hacer
			0:
				Escribir "El producto1: ",matriz[i,5];
			1:
				Escribir "El producto2: ",matriz[i,5];
			2:
				Escribir "El producto3: ",matriz[i,5];
			3:
				Escribir "El producto4: ",matriz[i,5];
			4:
				Escribir "El producto5: ",matriz[i,5];
		FinSegun
	FinPara
	
	//Mostrar el producto más vendido en cada semana
	Escribir "";
	Escribir "";
	Escribir "Total de ventas por cada día de la semana";
	Escribir "";
	Escribir "El producto más vendido en la semana fue: El producto",pMasVendidoSemana;
	
	//El nombre, el día de la semana y la cantidad del producto más vendido.
	Escribir "";
	Escribir "";
	Definir iM, jM Como Entero
	
	//Encontrar el día en que un producto se vendió más y la cantidad que se vendió, saber también qué producto fue
	Para i=0 Hasta 4 Con Paso 1 Hacer
		Para j=0 Hasta 4 Con Paso 1 Hacer
			si (i==0 y j==0) Entonces
				iM<-0;
				jM<-0;
			SiNo
				si (matriz[i,j]>matriz[iM,jM]) Entonces
					iM<-i;
					jM<-j;
				FinSi
			FinSi
		FinPara
	FinPara
	
	//El producto se vendió más y la cantidad que se vendió, saber también qué producto fue:
	Escribir "";
	Escribir "";
	Segun jM Hacer
		0:
			Escribir "El producto",iM+1," fue el el más vendido de la semana el día Lunes";
		1:
			Escribir "El producto",iM+1," fue el el más vendido de la semana el día Martes";
		2:
			Escribir "El producto",iM+1," fue el el más vendido de la semana el día Miércoles";
		3:
			Escribir "El producto",iM+1," fue el el más vendido de la semana el día Jueves";
		4:
			Escribir "El producto",iM+1," fue el el más vendido de la semana el día Viernes";
	FinSegun
	
FinSubProceso


	