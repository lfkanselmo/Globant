//Un ciclista parte de una ciudad A a las HH horas, MM minutos y SS segundos. El tiempo
//de viaje hasta llegar a otra ciudad B es de T segundos. Escribir un algoritmo que
//	determine la hora de llegada a la ciudad B.
Algoritmo Arrive_Time
	definir horaI, minutosI, SegundosI, t, horaF, horaF2, minutosF, segundosF, t_Inicial, t_Final Como Entero
	Escribir "Ingrese la hora de partida desde la ciudad A: "
	Leer horaI, minutosI, SegundosI
	Escribir "Ingrese el tiempo de viaje en segundos: "
	Leer t
	t_Inicial<- (horaI*3600)+(minutosI*60)+SegundosI
	t_Final<-t_Inicial+t
	horaF<-trunc(t_Final/3600)
	horaF2<-horaF
	Si horaF>23 Entonces
		horaF<-horaF-24
	SiNo
		horaF<-horaF2
	Fin Si
	minutosF<- trunc((t_Final mod 3600)/60)
	segundosF<- t_Final-(horaF2*3600)-(minutosF*60)
	Escribir "La llegada es a las : ", horaF, " horas con: ", minutosF, " minutos y: ", segundosF, " segundos"
FinAlgoritmo
