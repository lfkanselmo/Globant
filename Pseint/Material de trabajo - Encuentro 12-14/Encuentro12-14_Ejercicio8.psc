//Crear una función llamada "Login", que recibe un nombre de usuario y una contraseña y que
//devuelve Verdadero si el nombre de usuario es "usuario1" y si la contraseña es "asdasd".
//Además, la función calculara el número de intentos que se ha usado para loguearse, tenemos
//solo 3 intentos, si nos quedamos sin intentos la función devolverá Falso.

Algoritmo Logined
	
	Escribir login();
		
FinAlgoritmo

Funcion retorno<-login()
	Definir user, password Como Caracter;
	Definir retorno Como Logico;
	Definir intentos Como Entero;
	retorno<-Falso;
	
	Para intentos=3 Hasta 1 Con Paso -1 Hacer
		Escribir "Ingrese usuario";
		Leer user;
		Escribir "Ingrese contraseña";
		Leer password; 
		si (user=="usuario1" y password=="asdasd") Entonces
			retorno<-Verdadero
			intentos=0;
		SiNo
			Escribir "Credenciales no validas. Intente de nuevo";
			Escribir "";
			Escribir "--------------------------------------------"
		FinSi
	FinPara
	
FinFuncion
	