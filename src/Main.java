import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Dispositivo> dispositivos = new ArrayList<>();

        try {
            dispositivos.add(new Laptop("Lenovo", "ThinkPad X1", 1200, 16));
            dispositivos.add(new Telefono("Samsung", "S22", 850, "Android"));
            dispositivos.add(new Laptop("HP", "Pavilion", 950, 8));
            dispositivos.add(new Telefono("Apple", "iPhone 13", 1100, "iOS"));
        }
        catch (DatoInvalidoException e) {
            System.out.println("Error al crear dispositivo: " + e.getMessage());
        }

        // Intento fallido para demostrar la excepción
        try {
            dispositivos.add(new Telefono("", "S10", -500, "Android"));
        } catch (DatoInvalidoException e) {
            System.out.println("EXCEPCIÓN CAPTURADA: " + e.getMessage());
        }

        System.out.println("\n=== LISTA DE DISPOSITIVOS REGISTRADOS ===");
        for (Dispositivo d : dispositivos) {
            System.out.println(d.mostrarInfo()); // polimorfismo
        }
    }
}

