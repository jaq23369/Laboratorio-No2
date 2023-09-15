import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class DriverProgram {
    public static void main(String[] args) {
        HashMap<Integer, Sede> sedes = new HashMap<>();
        ArrayList<Curso> cursos = new ArrayList<>();

        // Cargar archivo de salones
        try (BufferedReader br = new BufferedReader(new FileReader("Salones.csv"))) {
            br.readLine();
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int id_sede = Integer.parseInt(data[0]);
                String edificioNombre = data[1];
                int id_salon = Integer.parseInt(data[2]);
                int capacidad = Integer.parseInt(data[3]);
                int nivel = Integer.parseInt(data[4]);  // Suponiendo que el nivel es el siguiente dato en tu archivo CSV.

                Sede sede = sedes.get(id_sede);
                if (sede == null) {
                    sede = new Sede(id_sede);
                    sedes.put(id_sede, sede);
                }

                // Buscar el edificio en la sede
                Edificio edificio = null;
                for (Edificio e : sede.getEdificios()) {
                    if (e.getNombre().equals(edificioNombre)) {
                        edificio = e;
                        break;
                    }
                }
                
                if (edificio == null) {
                    edificio = new Edificio(edificioNombre);
                    sede.agregarEdificio(edificio);
                }
                
                Salon salon = new Salon(id_salon, capacidad, nivel, edificioNombre); // Aquí es donde agregamos los datos adicionales.
                edificio.agregarSalon(salon);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo de salones.");
        }

        // Código para cargar cursos desde archivo (omitiendo para simplificar).

        // Mostrar información
        for (Sede sede : sedes.values()) {
            System.out.println("Sede: " + sede.getIdSede());
            for (Edificio edificio : sede.getEdificios()) {
                System.out.println("\tEdificio: " + edificio.getNombre());
                for (Salon salon : edificio.getSalones()) {
                    System.out.println("\t\tSalón Número: " + salon.getNumero());
                    System.out.println("\t\tCapacidad: " + salon.getCapacidad());
                }
            }
        }
    }
}

