/**
 * Estudiante: Joel Jaquez
 * Carne: 23369
 * Carrera: Ingenieria en Sistemas
 * Fecha de inicio: 14/9/2023
 * Fecha de finalizacion: 16/9/2023
 * Clase que Representa un curso ofrecido por la universidad.
 * Cada curso tiene un identificador, nombre, horario, duración, días en los que se imparte,
 * una cantidad determinada de estudiantes y una sede asociada.
 */

public class Curso {
    private String id; /** Identificador único del curso. */
    private String nombre; /** Nombre descriptivo del curso. */
    private String horario; /** Horario en el que se imparte el curso. */
    private String duracion; /** Duración total del curso en horas. */
    private String dias; /** Días de la semana en los que se imparte el curso. */
    private int cantidadEstudiantes; /** Cantidad máxima de estudiantes que pueden inscribirse al curso. */
    private int sede; /** Identificador de la sede donde se imparte el curso. */

     /**
     * Constructor que inicializa un nuevo objeto Curso con los datos proporcionados.
     *
     * @param id Identificador único del curso.
     * @param nombre Nombre descriptivo del curso.
     * @param horario Horario en el que se imparte el curso.
     * @param duracion Duración total del curso.
     * @param dias Días de la semana en los que se imparte el curso.
     * @param cantidadEstudiantes Cantidad máxima de estudiantes que pueden inscribirse al curso.
     * @param sede Identificador de la sede donde se imparte el curso.
     */

    public Curso(String id, String nombre, String horario, String duracion, String dias, int cantidadEstudiantes, int sede) {
        this.id = id;
        this.nombre = nombre;
        this.horario = horario;
        this.duracion = duracion;
        this.dias = dias;
        this.cantidadEstudiantes = cantidadEstudiantes;
        this.sede = sede;
    }

    // Getters y setters
    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public String getNombre() {
        return nombre;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario){
        this.horario = horario;
    }

    public String getDuracion(){
        return duracion;
    }

    public void setDuracion(String duracion){
        this.duracion = duracion;
    }

    public String getDias(){
        return dias;
    }

    public void setDias(String dias){
        this.dias = dias;
    }

    public int getCantidadEstudiantes(){
        return cantidadEstudiantes;
    }

    public void setCantidadEstudiantes(int cantidadEstudiantes){
        this.cantidadEstudiantes = cantidadEstudiantes;
    }

    public int getSede(){
        return sede;
    }

    public void setSede(int sede){
        this.sede = sede;
    }
}
