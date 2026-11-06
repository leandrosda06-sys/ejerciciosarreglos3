
public class Sensor {
    private String nombre;
    private String tipo;
    private double lectura;

    public Sensor(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.lectura = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getLectura() {
        return lectura;
    }

    public void setLectura(double lectura) {
        if (!Double.isNaN(lectura) &&
                !Double.isInfinite(lectura)) {
            this.lectura = lectura;
        } else {
            System.out.println("Lectura no valida");
        }
    }

    public void actualizarLectura(double nuevaLectura) {
        setLectura(nuevaLectura);
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Lectura: " + lectura);
    }
}
