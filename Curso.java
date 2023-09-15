/**
 * Estudiante: Joel Jaquez
 * Carne: 23369
 * Carrera: Ingenieria en Sistemas
 * Fecha de inicio: 14/9/2023
 * Clase que representa un curso de la universidad.
 */

public class Curso {
    private String codigo; // Código del curso
    private String nombre; // Nombre del curso
    private int creditos; // Créditos del curso

    /**
     * Constructor de la clase Curso.
     *
     * @param codigo Código del curso.
     * @param nombre Nombre del curso.
     * @param creditos Créditos del curso.
     */
    public Curso(String codigo, String nombre, int creditos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
    }

    /**
     * Método que devuelve el código del curso.
     *
     * @return Código del curso.
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Método que establece el código del curso.
     *
     * @param codigo Código del curso.
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Método que devuelve el nombre del curso.
     *
     * @return Nombre del curso.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que establece el nombre del curso.
     *
     * @param nombre Nombre del curso.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que devuelve los créditos del curso.
     *
     * @return Créditos del curso.
     */
    public int getCreditos() {
        return creditos;
    }

    /**
     * Método que establece los créditos del curso.
     *
     * @param creditos Créditos del curso.
     */
    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
}
