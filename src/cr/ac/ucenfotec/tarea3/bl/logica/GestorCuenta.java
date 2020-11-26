package cr.ac.ucenfotec.tarea3.bl.logica;

import cr.ac.ucenfotec.tarea3.bl.entidades.Cuenta;
import cr.ac.ucenfotec.tarea3.bl.entidades.CuentaAhorro;
import cr.ac.ucenfotec.tarea3.bl.entidades.CuentaAhorroProgramado;
import cr.ac.ucenfotec.tarea3.bl.entidades.CuentaCorriente;
import cr.ac.ucenfotec.tarea3.bl.persistencia.CuentaAhorroFAO;
import cr.ac.ucenfotec.tarea3.bl.persistencia.CuentaAhorroProgramadoFAO;
import cr.ac.ucenfotec.tarea3.bl.persistencia.CuentaCorrienteFAO;
import cr.ac.ucenfotec.tarea3.bl.persistencia.CuentaFAO;
import cr.ac.ucenfotec.tarea3.bl.tipos.TipoCuenta;

import java.util.ArrayList;
import java.util.List;

public class GestorCuenta {

    private CuentaAhorroFAO cuentaAhorroFAO = new CuentaAhorroFAO();
    private CuentaAhorroProgramadoFAO cuentaAhorroProgramadoFAO = new CuentaAhorroProgramadoFAO();
    private CuentaCorrienteFAO cuentaCorrienteFAO = new CuentaCorrienteFAO();

    public boolean guardar(Cuenta nuevaCuenta) {

        try {
            CuentaFAO objPersistente = determinarObjetoFAO(nuevaCuenta);
            return objPersistente.save(nuevaCuenta);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public List<Cuenta> listAll (TipoCuenta tipoCuenta) {
        try{
            CuentaFAO objPersistente = determinarObjetoFAO(tipoCuenta);
            return  objPersistente.findAll();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return new ArrayList<>();
    }

    private CuentaFAO determinarObjetoFAO(Cuenta nuevaCuenta) throws Exception {

        if (nuevaCuenta instanceof CuentaAhorro) {
            return this.cuentaAhorroFAO;
        }
        if (nuevaCuenta instanceof CuentaAhorroProgramado) {
            return this.cuentaAhorroProgramadoFAO;
        }
        if (nuevaCuenta instanceof CuentaCorriente) {
            return this.cuentaCorrienteFAO;
        }
        throw new Exception("Tipo de Material Desconocido!");
    }

    private CuentaFAO determinarObjetoFAO(TipoCuenta tipo) throws Exception {

        if (TipoCuenta.CUENTAAHORRO.equals (tipo)) {
            return this.cuentaAhorroFAO;
        }
        if (TipoCuenta.CUENTAAHORROPROGRAMADO.equals (tipo)) {
            return this.cuentaAhorroProgramadoFAO;
        }
        if (TipoCuenta.CUENTACORRIENTE.equals (tipo)) {
            return this.cuentaCorrienteFAO;
        }
        throw new Exception("Tipo de Material Desconocido!");
    }

}
