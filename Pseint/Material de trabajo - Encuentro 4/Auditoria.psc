Algoritmo auditoria
	Definir emails, S_Ejecutivos, S_Emergencia, contador Como Entero
	emails = 6
	S_Ejecutivos = 3
	S_Emergencia = 2
	contador<-1
	
	Escribir contador,". Ingresar sesión"
	contador<-contador+1
	Escribir contador,". Completar la hoja de cálculo"
	contador<-contador+1
	Escribir contador,". Revisar correo electrónico"
	contador<-contador+1
	Si emails < 10 Entonces
		Escribir contador,". Revisar correo de voz." 
		Escribir "¿Qué cantidad de solicitudes de emergencia hay?"
		contador<-contador+1
		leer S_Emergencia
		Si S_Emergencia > 0 Entonces
			Escribir contador,". Realizar solicitudes de emergencia"
			contador<-contador+1
		Fin Si
		escribir "que cantidad de solicitudes de los ejecutivos hay?"
		
		leer S_Ejecutivos
		Si S_Ejecutivos > 0 Entonces
			Escribir contador, ". Realizar solicitudes de los ejecutivos"
			contador<-contador+1
		Fin Si
		Escribir contador,". Enviar correo eletronico de actualización"
		contador<-contador+1
	Fin Si
	Escribir contador,". Apagar computadora..."
	contador<-contador+1
	Escribir contador, ". Regar planta"	
FinAlgoritmo
