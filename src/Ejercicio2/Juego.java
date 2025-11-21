package Ejercicio2;

public abstract class Juego {

    protected String nombre;
    protected String plataforma;
    protected double precio;

    public Juego(String nombre, String plataforma, double precio) throws DatoInvalidoException {
        setNombre(nombre);
        setPlataforma(plataforma);
        setPrecio(precio);
    }

    public void setNombre(String nombre) throws DatoInvalidoException {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new DatoInvalidoException("El nombre del juego no puede estar vacío.");
        }
        this.nombre = nombre;
    }

    public void setPlataforma(String plataforma) throws DatoInvalidoException {
        if (plataforma == null || plataforma.trim().isEmpty()) {
            throw new DatoInvalidoException("La plataforma no puede estar vacía.");
        }
        this.plataforma = plataforma;
    }

    public void setPrecio(double precio) throws DatoInvalidoException {
        if (precio <= 0) {
            throw new DatoInvalidoException("El precio debe ser positivo.");
        }
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract String mostrarDetalles(); // Polimorfismo
}

