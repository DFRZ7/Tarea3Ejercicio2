package cr.ac.ucenfotec.tarea3.bl.entidades;

import java.time.LocalDate;

public class Retiro extends Movimiento{

    public Retiro(LocalDate fechaMovimiento, String descripcion, double monto) {
        super(fechaMovimiento, descripcion, monto);
    }

    public Retiro(String currentLine) {
    }

    @Override
    public String toString() {
        return "Retiro{" +
                "fechaMovimiento=" + fechaMovimiento +
                ", descripcion='" + descripcion + '\'' +
                ", monto=" + monto +
                '}';
    }

    @Override
    public String toCSVLine() {
        return null;
    }
}
