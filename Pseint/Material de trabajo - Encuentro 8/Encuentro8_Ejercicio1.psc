//Teniendo en cuenta que la clave es "eureka", escribir un programa que nos pida ingresar
//una clave. Sólo se cuenta con 3 intentos para acertar, si fallamos los 3 intentos se deberá
//mostrar un mensaje indicándonos que hemos agotado esos 3 intentos. Si acertamos la
//clave se deberá mostrar un mensaje que indique que se ha ingresado al sistema correctamente.

Algoritmo Clave_Eureka
	Definir claveIngresada, clave Como Caracter;
	Definir intentos Como Entero;
	
	clave<-"eureka";
	intentos=3;
	
	Hacer
		Escribir "Ingrese clave";
		Leer claveIngresada;
		claveIngresada<-Minusculas(claveIngresada);
		si (claveIngresada<>"eureka") Entonces
			intentos<-intentos-1;
		SiNo
			intentos=0;
		FinSi
	Mientras Que (intentos>0)
	
	si (intentos==0 y claveIngresada=="eureka") Entonces
		Escribir "Se ingresó correctamente al sistema";
	SiNo
		Escribir "Se le agotaron los 3 intentos";
	FinSi
FinAlgoritmo
