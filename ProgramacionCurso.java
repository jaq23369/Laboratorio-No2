import java.util.Date;

/**
 * Estudiante: Joel Jaquez
 * Carne: 23369
 * Carrera: Ingenieria en Sistemas
 * Fecha de inicio: 14/9/2023
 * Clase que representa la programación de un curso en un salón y fecha específicos.
 */

public class ProgramacionCurso {
    private Curso curso; // Curso programado
    private Date fecha; // Fecha de programación del curso
    private Salon salon; // Salón asignado para el curso

    /**
     * Constructor de la clase ProgramacionCurso.
     *
     * @param curso Curso programado.
     * @param fecha Fecha de programación del curso.
     * @param salon Salón asignado para el curso.
     */
    public ProgramacionCurso(Curso curso, Date fecha, Salon salon) {
        this.curso = curso;
        this.fecha = fecha;
        this.salon = salon;
    }

    /**
     * Método que devuelve el curso programado.
     *
     * @return Curso programado.
     */
    public Curso getCurso() {
        return curso;
    }

    /**
     * Método que establece el curso programado.
     *
     * @param curso Curso programado.
     */
    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    /**
     * Método que devuelve la fecha de programación del curso.
     *
     * @return Fecha de programación del curso.
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * Método que establece la fecha de programación del curso.
     *
     * @param fecha Fecha de programación del curso.
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * Método que devuelve el salón asignado al curso.
     *
     * @return Salón asignado al curso.
     */
    public Salon getSalon() {
        return salon;
    }

    /**
     * Método que establece el salón asignado al curso.
     *
     * @param salon Salón asignado al curso.
     */
    public void setSalon(Salon salon) {
        this.salon = salon;
    }
}
