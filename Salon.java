import java.util.HashMap;
import java.util.Map;


/**
 * Estudiante: Joel Jaquez
 * Carne: 23369
 * Carrera: Ingenieria en Sistemas
 * Fecha de inicio: 14/9/2023
 * Fecha de finalizacion: 16/9/2023
 * Clase que Representa un salón dentro de un edificio.
 * El salón tiene un número, capacidad, nivel y pertenece a un edificio específico.
 * Además, mantiene un registro de los cursos programados para diferentes horarios.
 */

public class Salon {
    private int numero; /** Número identificador del salón. */
    private int capacidad; /** Capacidad máxima de estudiantes que puede albergar el salón. */
    private String edificio; /** Nombre del edificio al que pertenece el salón. */
    private int nivel; /** Nivel o piso en el que se encuentra el salón dentro del edificio. */
    
     /**
     * Mapa que relaciona días y horarios con un curso específico.
     * Ejemplo de clave: "Lunes 7:00 a 8:00", Valor: Objeto Curso.
     */
    private Map<String, Curso> horarios; // Clave: "Lunes 7:00 a 8:00", Valor: Objeto Curso

   /**
     * Constructor que inicializa un nuevo objeto Salon.
     *
     * @param numero Número del salón.
     * @param capacidad Capacidad del salón.
     * @param nivel Nivel del salón en el edificio.
     * @param edificio Nombre del edificio al que pertenece el salón.
     */

    public Salon(int numero, int capacidad, int nivel, String edificio) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.nivel = nivel;
        this.edificio = edificio;
        this.horarios = new HashMap<>();
    }

    /**
     * Asigna un curso a un horario específico del salón.
     *
     * @param dia Día de la semana.
     * @param hora Rango de hora, por ejemplo: "7:00 a 8:00".
     * @param curso Curso a asignar al horario.
     * @return true si el curso se asignó exitosamente, false si ya hay un curso en ese horario o si supera la capacidad.
     */

    public boolean asignarCurso(String dia, String hora, Curso curso) {
        String clave = dia + " " + hora;
        if (!horarios.containsKey(clave) && curso.getCantidadEstudiantes() <= this.capacidad) {
            horarios.put(clave, curso);
            return true;
        }
        return false;
    }

    /**
     * Obtiene el curso asignado a un horario específico.
     *
     * @param dia Día de la semana.
     * @param hora Rango de hora.
     * @return Curso asignado al horario. Null si no hay curso en ese horario.
     */

    public Curso obtenerCurso(String dia, String hora) {
        return horarios.get(dia + " " + hora);
    }

    // Getters y setters

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getEdificio() {
        return edificio;
    }

    public void setEdificio(String edificio) {
        this.edificio = edificio;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    /**
     * Obtiene el mapa de horarios del salón.
     *
     * @return Mapa de horarios.
     */

    public Map<String, Curso> getHorarios() {
        return horarios;
    }
}
