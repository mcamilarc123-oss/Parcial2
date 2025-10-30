package persona1;
import java.util.Scanner;
public class Persona1 {

    // Clase Persona
    static class Persona {
        private String nombre;
        private String nif;
        private String fechaNac;

        public Persona(String nombre, String nif, String fechaNac) {
            this.nombre = nombre;
            this.nif = nif;
            this.fechaNac = fechaNac;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getNif() {
            return nif;
        }

        public void setNif(String nif) {
            this.nif = nif;
        }

        public String getFechaNac() {
            return fechaNac;
        }

        public void setFechaNac(String fechaNac) {
            this.fechaNac = fechaNac;
        }
    }

    // Clase Jugador que hereda de Persona
    static class Jugador extends Persona {
        private int numFed;

        public Jugador(String nombre, String nif, String fechaNac, int numFed) {
            super(nombre, nif, fechaNac);
            this.numFed = numFed;
        }

        public int getNumFed() {
            return numFed;
        }

        public void setNumFed(int numFed) {
            this.numFed = numFed;
        }
    }

    // Método principal para probar el código
    public static void main(String[] args) {
        Jugador jugador = new Jugador("María Camila", "12345678X", "2000-01-01", 999);

        System.out.println("Nombre: " + jugador.getNombre());
        System.out.println("NIF: " + jugador.getNif());
        System.out.println("Fecha de nacimiento: " + jugador.getFechaNac());
        System.out.println("Número de federación: " + jugador.getNumFed());
    }
}
