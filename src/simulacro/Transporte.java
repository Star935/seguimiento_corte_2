package simulacro;

public enum Transporte {
    BUS("10 personas", "lento"), TREN ("59 personas","rapido"),
    BARCO("23 personas","muy lento"), MOTO ("2 personas","depende"),
    AVION("20 personas","muy rapido");

    public String Capacidad;
    public String TipoMotor;

    Transporte(String Capacidad, String TipoMotor) {
        this.Capacidad = Capacidad;
        this.TipoMotor = TipoMotor;
    }
    public String getCapacidad() { return Capacidad; }
    public String getTipoMotor() { return TipoMotor; }

    abstract class descripcion {
        abstract String mostrarDescripcion();
    }

}
