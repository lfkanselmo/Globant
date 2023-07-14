//Crear una matriz que contenga 3 columnas y la cantidad filas que decida el usuario. Las dos
//primeras columnas contendrán valores enteros ingresados por el usuario y en la 3 columna se
//deberá almacenar el resultado de sumar el número de la primera y segunda columna. Mostrar
//la matriz de la siguiente forma:
//	3 + 5 = 8
//	4 + 3 = 7
//	1 + 4 = 5

Algoritmo matrizSuma
	Definir matriz,n Como Entero;
	Escribir "Ingrese la cantidad de filas que desea para la matriz";
	Leer n;
	Dimension matriz(n,3);
	
	rellenar(matriz,n);
FinAlgoritmo

//SubProceso para rellenar la matriz
SubProceso rellenar(matriz Por Referencia, n)
	Definir i, j Como Entero;
	Para i=0 Hasta n-1 Con Paso 1 Hacer
		Para j=0 Hasta 2 Con Paso 1 Hacer
			si (j<>2) Entonces
				Escribir "Ingrese valor ",j+1, " de la fila ", i+1;
				Leer matriz[i,j];
			SiNo
				matriz[i,j]<-matriz[i,j-1]+matriz[i,j-2];
			FinSi
		FinPara
	FinPara
	
	//Mostrar la matriz
	Para i=0 Hasta n-1 Con Paso 1 Hacer
		Para j=0 Hasta 2 Con Paso 1 Hacer
			si (j==0) Entonces
				Escribir Sin Saltar "[",matriz[i,j] ,"] + ";
			SiNo
				si (j==1) Entonces
					Escribir Sin Saltar"[",matriz[i,j] ,"] = ";
				SiNo
					si (j==2) Entonces
						Escribir Sin Saltar"[",matriz[i,j] ,"] ";
					FinSi
				FinSi
			FinSi
		FinPara
		Escribir "";
	FinPara
FinSubProceso
	