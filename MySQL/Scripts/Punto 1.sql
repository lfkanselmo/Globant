/* CONSULTAS PUNTO 1*/
-- 1. Obtener los datos completos de los empleados.
SELECT * 
FROM EMPLEADOS;

-- 2. Obtener los datos completos de los departamentos.
SELECT * 
FROM DEPARTAMENTOS;

-- 3. Listar el nombre de los departamentos.
SELECT NOMBRE_DEPTO 
FROM DEPARTAMENTOS;

-- 4. Obtener el nombre y salario de todos los empleados.
SELECT NOMBRE, SAL_EMP 
FROM EMPLEADOS;

-- 5. Listar todas las comisiones.
SELECT NOMBRE, COMISION_EMP 
FROM EMPLEADOS;

-- 6. Obtener los datos de los empleados cuyo cargo sea ‘Secretaria’.
SELECT * 
FROM EMPLEADOS
WHERE CARGO_EMP = 'Secretaria';

-- 7. Obtener los datos de los empleados vendedores, ordenados por nombre alfabéticamente.
SELECT *
FROM EMPLEADOS
GROUP BY NOMBRE
HAVING CARGO_EMP = 'Vendedor';