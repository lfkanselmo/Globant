/*
atributos serán: nombreCurso, cantidadHorasPorDia,
cantidadDiasPorSemana, turno (mañana o tarde), precioPorHora y alumnos. Donde
alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
nombres de cada alumno.
 */
package Entities;

/**
 *
 * @author Krausser
 */
public class Cursos {
    private String cursoNombre;
    private int horasDiarias;
    private int diasSemanales;
    private String turno;
    private double precioPorHora;
    private String[] alumnos = new String[5];
    
    //constructores

    public Cursos() {
    }

    public Cursos(String cursoNombre, int horasDiarias, int diasSemanales, String turno, double precioPorHora) {
        this.cursoNombre = cursoNombre;
        this.horasDiarias = horasDiarias;
        this.diasSemanales = diasSemanales;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
    }
    
    //Getter & Setter

    public String getCursoNombre() {
        return cursoNombre;
    }

    public void setCursoNombre(String cursoNombre) {
        this.cursoNombre = cursoNombre;
    }

    public int getHorasDiarias() {
        return horasDiarias;
    }

    public void setHorasDiarias(int horasDiarias) {
        this.horasDiarias = horasDiarias;
    }

    public int getDiasSemanales() {
        return diasSemanales;
    }

    public void setDiasSemanales(int diasSemanales) {
        this.diasSemanales = diasSemanales;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }
    
    //toString

    @Override
    public String toString() {
        return "Cursos{" + "cursoNombre=" + cursoNombre + ", horasDiarias=" + horasDiarias + ", diasSemanales=" + diasSemanales + ", turno=" + turno + ", precioPorHora=" + precioPorHora + ", alumnos=" + alumnos + '}';
    }
    
}
