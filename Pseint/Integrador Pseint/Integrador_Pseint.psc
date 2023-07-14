Algoritmo Integrador
	Definir m Como Entero;
	Definir muestra, matriz Como Caracter;
	muestra<-"ACDDCADBCDABDBBA";
	muestra<-Mayusculas(muestra);
	
	si ((Longitud(muestra) == 9) o (Longitud(muestra) == 16) o (Longitud(muestra) == 1369)) Entonces
		m<-(Longitud(muestra))^(1/2);
		Dimension matriz(m,m);
		rellenarM(matriz,muestra,m);
		verM(matriz,m);
		Escribir "";
		evaluarMuestra(matriz,m);
	SiNo
		Escribir "La muestra no es valida";
	FinSi
	
	
FinAlgoritmo

//SubProceso para rellenar la matriz
SubProceso rellenarM(matriz Por Referencia, muestra,m)
	Definir i,j,k Como Entero;
	k<-0;
	Para i=0 Hasta m-1 Con Paso 1 Hacer
		Para j=0 Hasta m-1 Con Paso 1 Hacer
			matriz[i,j]<-Subcadena(muestra,k,k);
			k<-k+1;
		FinPara
	FinPara
FinSubProceso

//SubProceso para mostrar la matriz
SubProceso verM(matriz,m)
	Definir i,j Como Entero;
	Para i=0 Hasta m-1 Con Paso 1 Hacer
		Para j=0 Hasta m-1 Con Paso 1 Hacer
			Escribir Sin Saltar "[",matriz[i,j],"] ";
		FinPara
		Escribir "";
	FinPara
FinSubProceso

//SubProceso para evaluar la muestra
SubProceso evaluarMuestra(matriz,m)
	Definir i,j Como Entero;
	Definir base1, base2 Como Caracter;
	Definir genZ Como Logico;
	genZ<-Verdadero;
	base1<-matriz[0,0];
	base2<-matriz[0,m-1];
	
	Para i=0 Hasta m-1 Con Paso 1 Hacer
		si (matriz[i,i]==base1 y matriz[i,(m-1)-i]==base2) Entonces
			genZ<-Verdadero;
		SiNo
			genZ<-Falso;
		FinSi
	FinPara
	
	si (genZ==Verdadero) Entonces
		Escribir "El gen Z está presente en esta muestra";
	SiNo
		Escribir "No se encuentran rastros del gen Z en esta muestra";
	FinSi
FinSubProceso
	