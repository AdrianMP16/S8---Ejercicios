package Ejercicio2;

public class MarioBros extends Juego {

    private int nivelMaximo;

    public MarioBros(String nombre, String plataforma, double precio, int nivelMaximo)
            throws DatoInvalidoException {
        super(nombre, plataforma, precio);
        if (nivelMaximo <= 0) {
            throw new DatoInvalidoException("El nivel máximo debe ser positivo.");
        }
        this.nivelMaximo = nivelMaximo;
    }

    @Override
    public String mostrarDetalles() {
        return "[Mario Bros] " + nombre + " | Plataforma: " + plataforma +
                " | Precio: $" + precio + " | Nivel Máximo: " + nivelMaximo;
    }
}

