package Ejercicio2;

public class CarreraVehiculos extends Juego {

    private int cantidadVehiculos;

    public CarreraVehiculos(String nombre, String plataforma, double precio, int cantidadVehiculos)
            throws DatoInvalidoException {
        super(nombre, plataforma, precio);
        if (cantidadVehiculos <= 0) {
            throw new DatoInvalidoException("La cantidad de vehículos debe ser positiva.");
        }
        this.cantidadVehiculos = cantidadVehiculos;
    }

    @Override
    public String mostrarDetalles() {
        return "[Carrera Vehículos] " + nombre + " | Plataforma: " + plataforma +
                " | Precio: $" + precio + " | Vehículos: " + cantidadVehiculos;
    }
}

