//Una distribuidora de Nescafé tiene 4 representantes que viajan por toda la Argentina
//ofreciendo sus productos. Para tareas administrativas el país está dividido en cinco zonas:
//		Norte, Sur, Este, Oeste y Centro. Mensualmente almacena sus datos y obtiene distintas
//		estadísticas sobre el comportamiento de sus representantes en cada zona. Se desea hacer un
//	programa que lea el monto de las ventas de los representantes en cada zona y calcule luego:
//		a) el total de ventas de una zona introducida por teclado
//		b) el total de ventas de un vendedor introducido por teclado en cada una de las zonas
//		c) el total de ventas de todos los representantes.

Algoritmo nescafeDistribuidora
	Definir matriz,vectorVentasVendedor Como Entero
	Definir vectorNombres Como Caracter;
	Dimension vectorNombres[4],vectorVentasZonas[5],vectorVentasVendedor[4];
	Dimension matriz[4,5];
	rellenar(matriz);
	rellenarNombres(vectorNombres);
	Escribir "";
	Escribir "";
	ver(matriz);
	Escribir "";
	Escribir "";
	totalZona(matriz);
	Escribir "";
	Escribir "";
	totalVendedor(vectorNombres,matriz);
	Escribir "";
	Escribir "";
	todasVentasVendedores(matriz);
FinAlgoritmo

//SubProceso para ver la matriz
SubProceso ver(matriz Por Referencia)
	Definir i,j Como Entero
	Para i=0 Hasta 3 Con Paso 1 Hacer
		Para j=0 Hasta 4 Con Paso 1 Hacer
			Escribir Sin Saltar "[",matriz[i,j],"] ";
		FinPara
		Escribir "";
	FinPara
FinSubProceso

//SubProceso para rellenar la matriz
SubProceso rellenar(matriz Por Referencia)
	Definir i,j Como Entero;
	Para i=0 Hasta 3 Con Paso 1 Hacer
		Para j=0 Hasta 4 Con Paso 1 Hacer
			matriz[i,j]<-Aleatorio(1,50);
		FinPara
	FinPara
FinSubProceso

//Rellenar vector de nombres
SubProceso rellenarNombres(vectorNombres Por Referencia)
	Definir i Como Entero;
	Para i=0 Hasta 3 Con Paso 1 Hacer
		Escribir "Ingrese nombre del vendedor ", i+1;
		Leer vectorNombres[i];
	FinPara
FinSubProceso

//el total de ventas de una zona introducida por teclado
SubProceso totalZona(matriz Por Referencia)
	Definir i,j,suma,n, ventasZonas Como Entero;
	//Rellenar el vector de ventas por cada zona
	
	Hacer
		Escribir "ingrese la zona";
		Escribir "1. Norte";
		Escribir "2. Sur";
		Escribir "3. Este";
		Escribir "4. Oeste";
		Escribir "5. Centro";
		Leer n;
		si (n<1 o n>4) Entonces
			Escribir "";
			Escribir "Valor ingresado incorrectos. Intente de nuevo";
			Escribir "";
		FinSi
	Mientras Que (n<1 o n>5)
	
	suma<-0;
	Para i=0 Hasta 3 Con Paso 1 Hacer
		suma<-suma+matriz[i,n-1]
	FinPara
	ventasZonas<-suma;
	
	//mostrar el total de la zona introducida
	Segun n Hacer
		1:
			Escribir "En la zona Norte se vendió:",ventasZonas;
		2:
			Escribir "En la zona Sur se vendió:",ventasZonas;
		3:
			Escribir "En la zona Este se vendió:",ventasZonas;
		4:
			Escribir "En la zona Oeste se vendió:",ventasZonas;
		5:
			Escribir "En la zona Centro se vendió:",ventasZonas;
	FinSegun
FinSubProceso

//el total de ventas de un vendedor introducido por teclado en cada una de las zonas
SubProceso totalVendedor(vectorNombres Por Referencia, matriz Por Referencia)
	Definir i,suma,n, ventasVendedor Como Entero;
	Hacer
		Escribir "ingrese el número correspondiente al nombre del vendedor";
		Escribir "1. ",vectorNombres[0];
		Escribir "2. ",vectorNombres[1];
		Escribir "3. ",vectorNombres[2];
		Escribir "4. ",vectorNombres[3];
		Leer n;
		
		si (n<1 o n>4) Entonces
			Escribir "";
			Escribir "Valor ingresado incorrectos. Intente de nuevo";
			Escribir "";
		FinSi
	Mientras Que n<1 o n>4

	suma<-0;
	Para i=0 Hasta 4 Con Paso 1 Hacer
		Segun i Hacer
			0:
				Escribir "El vendedor ",vectorNombres[n-1], " vendió ", matriz[n-1,i], " en la zona Norte";
			1:
				Escribir "El vendedor ",vectorNombres[n-1], " vendió ", matriz[n-1,i], " en la zona Sur";
			2:
				Escribir "El vendedor ",vectorNombres[n-1], " vendió ", matriz[n-1,i], " en la zona Este";
			3:
				Escribir "El vendedor ",vectorNombres[n-1], " vendió ", matriz[n-1,i], " en la zona Oeste";
			4:
				Escribir "El vendedor ",vectorNombres[n-1], " vendió ", matriz[n-1,i], " en la zona Centro";
		FinSegun
	FinPara
FinSubProceso

//el total de ventas de todos los representantes.
SubProceso todasVentasVendedores(matriz Por Referencia)
	Definir i,j, suma Como Entero;
	suma<-0;
	Para i=0 Hasta 3 Con Paso 1 Hacer
		Para j=0 Hasta 4 Con Paso 1 Hacer
			suma<-suma+matriz[i,j];
		FinPara
	FinPara
	Escribir "El número total de ventas hechas por los vendedores es de: ",suma;
FinSubProceso
	