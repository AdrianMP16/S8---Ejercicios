public class Telefono extends Dispositivo {

    private String sistema;

    public Telefono(String marca, String modelo, double precio, String sistema) throws DatoInvalidoException {
        super(marca, modelo, precio);
        this.sistema = sistema;
    }

    @Override
    public String mostrarInfo() {
        return "[Teléfono] " + super.mostrarInfo() + ", Sistema Operativo: " + sistema;
    }
}

