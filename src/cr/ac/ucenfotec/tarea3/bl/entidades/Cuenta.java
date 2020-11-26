package cr.ac.ucenfotec.tarea3.bl.entidades;

import cr.ac.ucenfotec.tarea3.bl.interfaces.SerializacionCSV;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Cuenta implements SerializacionCSV {

    protected int numeroCuenta;
    protected double saldo;
    protected LocalDate fechaApertura;
    protected Cuenta dueno;
    protected ArrayList<Movimiento> movimientos;

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public LocalDate getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(LocalDate fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public Cuenta getDueno() {
        return dueno;
    }

    public void setDueno(Cuenta dueno) {
        this.dueno = dueno;
    }

    public ArrayList<Movimiento> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(ArrayList<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, double saldo, LocalDate fechaApertura, Cuenta dueno, ArrayList<Movimiento> movimientos) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.fechaApertura = fechaApertura;
        this.dueno = dueno;
        this.movimientos = movimientos;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "numeroCuenta=" + numeroCuenta +
                ", saldo=" + saldo +
                ", fechaApertura=" + fechaApertura +
                ", dueno=" + dueno +
                ", movimientos=" + movimientos +
                '}';
    }
}
