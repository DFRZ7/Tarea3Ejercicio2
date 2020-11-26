package cr.ac.ucenfotec.tarea3.bl.entidades;

import java.time.LocalDate;
import java.util.ArrayList;

public class CuentaAhorroProgramado extends Cuenta {

    public CuentaAhorroProgramado(int numeroCuenta, double saldo, LocalDate fechaApertura, Cuenta dueno, ArrayList<Movimiento> movimientos) {
        super(numeroCuenta, saldo, fechaApertura, dueno, movimientos);
    }

    @Override
    public String toString() {
        return "CuentaAhorroProgramado{" +
                "numeroCuenta=" + numeroCuenta +
                ", saldo=" + saldo +
                ", fechaApertura=" + fechaApertura +
                ", dueno=" + dueno +
                ", movimientos=" + movimientos +
                '}';
    }

    @Override
    public String toCSVLine() {
        return null;
    }

}
