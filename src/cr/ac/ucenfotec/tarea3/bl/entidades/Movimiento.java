package cr.ac.ucenfotec.tarea3.bl.entidades;

import cr.ac.ucenfotec.tarea3.bl.interfaces.SerializacionCSV;

import java.time.LocalDate;

public abstract class Movimiento implements SerializacionCSV {

    protected LocalDate fechaMovimiento;
    protected String descripcion;
    protected double monto;

    public LocalDate getFechaMovimiento() {
        return fechaMovimiento;
    }

    public void setFechaMovimiento(LocalDate fechaMovimiento) {
        this.fechaMovimiento = fechaMovimiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Movimiento() {
    }

    public Movimiento(LocalDate fechaMovimiento, String descripcion, double monto) {
        this.fechaMovimiento = fechaMovimiento;
        this.descripcion = descripcion;
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "Movimiento{" +
                "fechaMovimiento=" + fechaMovimiento +
                ", descripcion='" + descripcion + '\'' +
                ", monto=" + monto +
                '}';
    }
}
