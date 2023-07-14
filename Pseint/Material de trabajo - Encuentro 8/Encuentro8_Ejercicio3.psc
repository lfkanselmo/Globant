//Realizar un programa que solicite al usuario su código de usuario (un número entero
//mayor que cero) y su contraseña numérica (otro número entero positivo). El programa no
//le debe permitir continuar hasta que introduzca como código 1024 y como contraseña
//4567. El programa finaliza cuando ingresa los datos correctos.

Algoritmo Password
	Definir userPassword, userCode Como Entero;
	
	Hacer
		Escribir "Ingrese el código de usuario";
		Leer userCode;
		
		Mientras (userCode<0) Hacer
			Escribir "Recuerde que el código de usuario debe ser un entero positivo";
			Leer userCode;
		FinMientras
		
		Escribir "Ingrese contraseña";
		Leer userPassword;
		
		Mientras (userPassword<0) Hacer
			Escribir "Recuerde que la contraseña de usuario debe ser un entero positivo";
			Leer userPassword;
		FinMientras
		
		si((userCode<>1024) o (userPassword<>4567)) Entonces
			Escribir "Erró. Intente de nuevo";
		FinSi
		
	Mientras Que ((userCode<>1024) o (userPassword<>4567))
FinAlgoritmo
