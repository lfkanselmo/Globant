Algoritmo practicoGuia4
	menu();	
FinAlgoritmo

//Función para calcular la superficie
Funcion retorno<-calcularSuperficie(ancho, alto)
	Definir retorno Como Real;
	retorno<-ancho*alto;
FinFuncion

//Función para calcular el volumen
Funcion retorno<-calcularVolumen(ancho, largo, espesor)
	Definir retorno Como Real;
	retorno<-ancho*espesor*largo;
FinFuncion

//SubProceso para el menú
SubProceso menu()
	Definir option Como Entero;
	
	Hacer
		Escribir "------------------------------------";
		Escribir "Seleccione el número de la opción: ";
		Escribir "1. Calcular muro de ladrillo";
		Escribir "2. Calcular viga de hormigón";
		Escribir "3. Calcular columnas de hormigón"
		Escribir "4. Calcular contrapisos";
		Escribir "5. Calcular techo";
		Escribir "6. Calcular pisos";
		Escribir "7. Calcular pintura";
		Escribir "8. Calcular iluminación";
		Escribir "9. Salir";
		Escribir "------------------------------------";
		Leer option;
		
		Segun option Hacer
			1: 
				calcularMuro();
			2:
				calcularViga();
			3:
				calcularColumna();
			4:
				calcularContrapisos();
			5:
				calcularTecho();
			6:
				calcularPisos();
			7:
				calcularPintura();
			8:
				calcularIluminacion();
			9:
				Escribir "";
				Escribir "";
				Escribir "Ádios. Vuelva pronto";
				Escribir "";
				Escribir "";
		FinSegun
		
	Mientras Que (option<>9)	

FinSubProceso

//SubProceso para calcular un muro
SubProceso calcularMuro()
	Definir grosor Como Entero;
	Definir largo, ancho, cemento, ladrillos, arena, superficie Como Real;
	ladrillos<-0;
	Hacer
		Escribir "Ingrese el grosor deseado";
		Escribir "1. 20cm";
		Escribir "2. 30cm";
		Leer grosor;
	Mientras Que (grosor<>1 y grosor<>2)
	
	
	Escribir "Ingrese el largo en metros";
	Leer largo;
	Escribir "Ingrese el ancho en metros";
	Leer ancho;
	
	superficie<-calcularSuperficie(ancho,largo);
	
	si (grosor==1) Entonces
		cemento<-superficie*15.2;			//kg
		arena<-superficie*0.115;				//m^3
		ladrillos<-redon((superficie*120));
	SiNo
		cemento<-superficie*10.9;			//kg
		arena<-superficie*0.09;				//m^3
		ladrillos<-superficie*90;
	FinSi
	
	Escribir "";
	Escribir "";
	Escribir "La superficie del muro es: ", superficie, " m^2";
	Escribir "para el muro se necesitarán: ";
	Escribir cemento, " Kg de cemento";
	Escribir arena, " m^3 de arena";
	Escribir ladrillos, " ladrillos";
	Escribir "";
	Escribir "";	
FinSubProceso

//SubProceso para calcular una viga
SubProceso calcularViga()
	Definir largo Como Real;
	Escribir "Ingrese el largo de la viga en metros";
	Leer largo;
	
	Escribir "";
	Escribir "";
	Escribir "para la viga de hormigón se necesitarán: ";
	Escribir largo*3, " m de hierro del 4";
	Escribir largo*4, " m de hierro del 8";
	Escribir largo*0.02, " m^3 de piedra"; 			//m^3
	Escribir largo*0.02, " m^3 de arena";			//m^3
	Escribir largo*9, " Kg de cemento";			//Kg
	Escribir "";
	Escribir "";
	
FinSubProceso

SubProceso calcularColumna()
	Definir largo Como Real;
	Escribir "Ingrese el largo de la columna en metros";
	Leer largo;
	
	Escribir "";
	Escribir "";
	Escribir "para la columna de hormigón se necesitarán: ";
	Escribir largo*7.5, " Kg de cemento";
	Escribir largo*0.016, " m^3 de arena";
	Escribir largo*0.016 " m^3 de piedra";
	Escribir largo*6, " m de hierro del 10";
	Escribir largo*3, " m de hierro del 4";
	Escribir "";
	Escribir "";	
FinSubProceso

//SubProceso para calcular contrapisos
SubProceso calcularContrapisos()
	Definir espesor, ancho, largo, volumen Como Real;
	Escribir "Ingrese el espesor en metros";
	Leer espesor;
	Escribir "Ingrese el ancho en metros";
	Leer ancho;
	Escribir "Ingrese el largo en metros";
	Leer largo;
	
	volumen<-calcularVolumen(ancho,largo, espesor);
	
	Escribir "";
	Escribir "";
	Escribir "para el contrapisos se necesitarán: ";
	Escribir volumen*105, " Kg de cemento";
	Escribir largo*0.45, " m^3 de arena";
	Escribir largo*0.9 " m^3 de piedra";
	Escribir "";
	Escribir "";		
FinSubProceso

//SubProceso para calcular techo
SubProceso calcularTecho()
	Definir espesor, ancho, largo, volumen Como Real;
	Escribir "Ingrese el espesor en metros";
	Leer espesor;
	Escribir "Ingrese el ancho en metros";
	Leer ancho;
	Escribir "Ingrese el largo en metros";
	Leer largo;
	
	volumen<-calcularVolumen(ancho,largo, espesor); 
	
	Escribir "";
	Escribir "";
	Escribir "para el contrapisos se necesitarán: ";
	Escribir volumen*33, " Kg de cemento";
	Escribir volumen*0.072, " m^3 de arena";
	Escribir volumen*0.072 " m^3 de piedra";
	Escribir volumen*7, " m de hierro del 8";
	Escribir volumen*4, " m de hierro del 6";
	Escribir "";
	Escribir "";
FinSubProceso

//SubProceso para calcular pisos
SubProceso calcularPisos()
	Definir largo, ancho, superficie Como Real;
	Escribir "Ingrese el largo en metros";
	Leer largo;
	Escribir "Ingrese el ancho en metros";
	Leer ancho;
	
	superficie<-calcularSuperficie(largo, ancho);
	superficie<-superficie+(superficie*0.10);
	
	Escribir "";
	Escribir "";
	Escribir "La superficie será: ", superficie;
	Escribir "";
	Escribir "";
FinSubProceso

//SubProceso para calcular pintura
SubProceso calcularPintura() 
	Definir superficie Como Real;
	Escribir "Ingrese la superficie del muro en m^2";
	Leer superficie;
	
	Escribir "";
	Escribir "";
	Escribir "Se necesitan ", superficie*(1/6), " litros de pintura";
	Escribir "";
	Escribir "";
FinSubProceso

//SubProceso para calcular iluminación
SubProceso calcularIluminacion()
	Definir superficie Como Real;
	Escribir "Ingrese la superficie del cuarto";
	Leer superficie;
	
	Escribir "";
	Escribir "";
	Escribir "La cantidad mínima de iluminación es: ", superficie*0.2;
	Escribir "";
	Escribir "";
FinSubProceso
	