-- CANDADO A
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
WHERE (jugadores.Posicion = 'C' OR jugadores.Posicion LIKE '%C%') AND equipos.Conferencia = 'East';

-- CANDADO B
-- Muestre la cantidad de jugadores que poseen más asistencias por partidos, que el numero de jugadores que tiene el equipo Heat.
SELECT COUNT(estadisticas.jugador) AS 'cantidad jugadores'
FROM estadisticas
WHERE estadisticas.Asistencias_por_partido > (
	SELECT COUNT(jugadores.Nombre)
    FROM jugadores
    WHERE jugadores.Nombre_equipo = 'Heat'
	);
    
-- La clave será igual al conteo de partidos jugados durante las temporadas del año 1999.
SELECT COUNT(codigo)
FROM partidos
WHERE temporada LIKE '%99%';

-- CANDADO C
/*
La posición del código será igual a la cantidad de jugadores que proceden de Michigan y forman
parte de equipos de la conferencia oeste.
Al resultado obtenido lo dividiremos por la cantidad de jugadores cuyo peso es mayor o igual a
195, y a eso le vamos a sumar 0.9945.
*/
SELECT COUNT(jugadores.codigo)
FROM jugadores
INNER JOIN equipos ON jugadores.Nombre_equipo = equipos.Nombre
WHERE jugadores.Procedencia = 'Michigan' AND equipos.Conferencia = 'West';

SELECT COUNT(codigo)
FROM jugadores
WHERE Peso >= 195;

/*
Para obtener el siguiente código deberás redondear hacia abajo el resultado que se devuelve de
sumar: el promedio de puntos por partido, el conteo de asistencias por partido, y la suma de
tapones por partido. Además, este resultado debe ser, donde la división sea central.
*/
SELECT AVG(estadisticas.Puntos_por_partido)
FROM estadisticas
INNER JOIN jugadores on estadisticas.jugador = jugadores.codigo
INNER JOIN equipos ON jugadores.Nombre_equipo = equipos.Nombre
WHERE equipos.Division = 'Central';

SELECT COUNT(estadisticas.Asistencias_por_partido)
FROM estadisticas
INNER JOIN jugadores on estadisticas.jugador = jugadores.codigo
INNER JOIN equipos ON jugadores.Nombre_equipo = equipos.Nombre
WHERE equipos.Division = 'Central';

SELECT SUM(estadisticas.Tapones_por_partido)
FROM estadisticas
INNER JOIN jugadores on estadisticas.jugador = jugadores.codigo
INNER JOIN equipos ON jugadores.Nombre_equipo = equipos.Nombre
WHERE equipos.Division = 'Central';

-- CANDADO D
-- Muestre los tapones por partido del jugador Corey Maggette durante la temporada 00/01. Este resultado debe ser redondeado. Nota: el resultado debe estar redondeado
SELECT SUM(estadisticas.Tapones_por_partido)
FROM estadisticas
LEFT JOIN jugadores ON estadisticas.jugador = jugadores.codigo
WHERE jugadores.Nombre = 'Corey Maggette' AND estadisticas.temporada = '00/01';

-- Para obtener el siguiente código deberás redondear hacia abajo, la suma de puntos por partido de todos los jugadores de procedencia argentina.
SELECT SUM(estadisticas.Puntos_por_partido)
FROM estadisticas
INNER JOIN jugadores ON estadisticas.jugador = jugadores.codigo
WHERE jugadores.Procedencia = 'Argentina';