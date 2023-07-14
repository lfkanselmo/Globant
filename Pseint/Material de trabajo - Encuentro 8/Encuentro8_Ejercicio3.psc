//Realizar un programa que solicite al usuario su c�digo de usuario (un n�mero entero
//mayor que cero) y su contrase�a num�rica (otro n�mero entero positivo). El programa no
//le debe permitir continuar hasta que introduzca como c�digo 1024 y como contrase�a
//4567. El programa finaliza cuando ingresa los datos correctos.

Algoritmo Password
	Definir userPassword, userCode Como Entero;
	
	Hacer
		Escribir "Ingrese el c�digo de usuario";
		Leer userCode;
		
		Mientras (userCode<0) Hacer
			Escribir "Recuerde que el c�digo de usuario debe ser un entero positivo";
			Leer userCode;
		FinMientras
		
		Escribir "Ingrese contrase�a";
		Leer userPassword;
		
		Mientras (userPassword<0) Hacer
			Escribir "Recuerde que la contrase�a de usuario debe ser un entero positivo";
			Leer userPassword;
		FinMientras
		
		si((userCode<>1024) o (userPassword<>4567)) Entonces
			Escribir "Err�. Intente de nuevo";
		FinSi
		
	Mientras Que ((userCode<>1024) o (userPassword<>4567))
FinAlgoritmo
