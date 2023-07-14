//Realizar un programa con el siguiente men� y le pregunte al usuario que quiere hacer hasta
//que ingrese la opci�n Salir:
//	A. Llenar Vector A. Este vector es de tama�o N y se debe llenar de manera aleatoria
//	usando la funci�n Aleatorio(valorMin, valorMax) de PseInt.
//	B. Llenar Vector B. Este vector tambi�n es de tama�o N y se llena de manera aleatoria.
//	C. Llenar Vector C con la suma de los vectores A y B. La suma se debe realizar elemento
//a elemento. Ejemplo: C = A + B
//	D. Llenar Vector C con la resta de los vectores B y A. La resta se debe realizar elemento a
//elemento. Ejemplo: C = B - A
//E. Mostrar. Esta opci�n debe permitir al usuario decidir qu� vector quiere mostrar: Vector
//	A, B, o C.
//	F. Salir.
Algoritmo menuVectores
	menu();	
FinAlgoritmo

//Men�
SubProceso menu()
	Definir option, vectorOption Como Caracter;
	Definir vectorA, vectorB, vectorC, n, i Como Entero;
	Definir vA, vB, vC Como Logico;
	vA<-Falso;
	vB<-Falso;
	vC<-Falso;
	Escribir "Ingrese el tama�o de los vectores";
	Leer n;
	Dimension vectorA[n];
	Dimension vectorB[n];
	Dimension vectorC[n];
	
	Hacer
		Escribir "-------------------------------------------------------";
		Escribir "Bienvenido al men�";
		Escribir "";
		Escribir "A. Llenar Vector A";
		Escribir "B. Llenar Vector B";
		Escribir "C. Llenar Vector C con la suma de los vectores A y B";
		Escribir "D. Llenar Vector C con la resta de los vectores B y A";
		Escribir "E. Mostrar";
		Escribir "F. Salir";
		Escribir "-------------------------------------------------------";
		Escribir "";
		Leer option;
		option<-Minusculas(option);
		
		//Acci�n realizada seg�n la elecci�n
		Segun option hacer
			"a":
				rellenado(vectorA,n,vA);
			"b":
				rellenado(vectorB,n,vB);
			"c":
				si (vA==Verdadero y vB==Verdadero) Entonces
					Para i=0 Hasta n-1 Con Paso 1 Hacer
						vectorC[i]<-vectorA[i]+vectorB[i];
					FinPara
					vC<-Verdadero;
					Escribir "";
					Escribir "Vector C rellenado con �xito";
					Escribir "";
				SiNo
					Escribir "";
					Escribir "Los vectores A o B todav�a no han sido rellenados. No es posible rellenar vector C";
					Escribir "";
				FinSi				
			"d":
				si (vA==Verdadero y vB==Verdadero) Entonces
					Para i=0 Hasta n-1 Con Paso 1 Hacer
						vectorC[i]<-vectorB[i]-vectorA[i];
					FinPara
					vC<-Verdadero;
					Escribir "";
					Escribir "Vector C rellenado con �xito";
					Escribir "";
				SiNo
					Escribir "";
					Escribir "Los vectores A o B todav�a no han sido rellenados. No es posible rellenar vector C";
					Escribir "";
				FinSi
			"e":
				
				Hacer
					Escribir "";
					Escribir "�Cu�l vector desea mostrar?";
					Escribir "A";
					Escribir "B";
					Escribir "C";
					Escribir "";
					Leer vectorOption;
					vectorOption<-Minusculas(vectorOption)
				Mientras Que (vectorOption<>"a" y vectorOption<>"b" y vectorOption<>"c")
				Escribir "";
				si (vectorOption=="a") Entonces
					mostrarVector(vectorA,n,vA);					
				SiNo
					Escribir "";
					si (vectorOption=="b") Entonces
						mostrarVector(vectorB,n,vB);
						
					SiNo
						Escribir "";
						si (vectorOption=="c") Entonces
							mostrarVector(vectorC,n,vC);							
						FinSi						
					FinSi					
				FinSi
				Escribir "";
			"f":
				Escribir "";
				Escribir "";
				Escribir "�dios, vuelva pronto";
				Escribir "";
			De Otro Modo:
				Escribir "";
				Escribir "El valor es incorrecto para este men�. Intente de nuevo";
		FinSegun
	Mientras Que (option<>"f") 
	
		
FinSubProceso

//SubProceso para mostrar el vector
SubProceso mostrarVector(vector Por Referencia, n, vLog)
	Definir i Como Entero;
	si (vLog==Verdadero) Entonces
		Para i=0 Hasta n-1 Con Paso 1 Hacer
			Escribir sin saltar "[",vector[i],"] ";
		FinPara
	SiNo
		Escribir "";
		Escribir "Este vector no est� rellenado";
		Escribir "";
	FinSi	
FinSubProceso

//SubProceso para rellenar los vectores.
SubProceso rellenado(vector Por Referencia, n, vLog Por Referencia)
	Definir i Como Entero;
	Para i=0 Hasta n-1 Con Paso 1 Hacer
		vector[i]<-Aleatorio(-100,100);							
	FinPara
	vLog<-Verdadero;
	Escribir "";
	Escribir "Vector A rellenado con �xito";
	Escribir "";
FinSubProceso
	