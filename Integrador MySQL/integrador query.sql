
-- Teniendo el máximo de asistencias por partido, muestre cuantas veces se logró dicho máximo.
SELECT count(Asistencias_por_partido)
FROM estadisticas
WHERE Asistencias_por_partido = (
	SELECT MAX(Asistencias_por_partido)
	FROM estadisticas
);

-- Muestre la suma total del peso de los jugadores, donde la conferencia sea Este y la posición sea centro o esté comprendida en otras posiciones.
SELECT SUM(peso)
FROM jugadores
INNER JOIN equipos ON jugadores.Nombre_equipo = equipos.Nombre
WHERE jugadores.Posicion = 'C' AND equipos.Conferencia = 'East';
