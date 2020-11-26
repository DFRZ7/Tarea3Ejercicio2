package cr.ac.ucenfotec.tarea3.bl.entidades;

import java.time.LocalDate;

public class Deposito extends Movimiento{

    public Deposito(LocalDate fechaMovimiento, String descripcion, double monto) {
        super(fechaMovimiento, descripcion, monto);
    }

    public Deposito(String currentLine) {
    }

    @Override
    public String toString() {
        return "Deposito{" +
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
