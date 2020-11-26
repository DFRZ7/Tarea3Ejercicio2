package cr.ac.ucenfotec.tarea3.bl.logica;

import cr.ac.ucenfotec.tarea3.bl.entidades.Deposito;
import cr.ac.ucenfotec.tarea3.bl.entidades.Movimiento;
import cr.ac.ucenfotec.tarea3.bl.entidades.Retiro;
import cr.ac.ucenfotec.tarea3.bl.persistencia.DepositoFAO;
import cr.ac.ucenfotec.tarea3.bl.persistencia.MovimientoFAO;
import cr.ac.ucenfotec.tarea3.bl.persistencia.RetiroFAO;
import cr.ac.ucenfotec.tarea3.bl.tipos.TipoMovimiento;

import java.util.ArrayList;
import java.util.List;

public class GestorMovimiento {

    private RetiroFAO retiroFAO = new RetiroFAO();
    private DepositoFAO depositoFAO = new DepositoFAO();

    public boolean guardar(Movimiento nuevoMovimiento) {

        try {
            MovimientoFAO objPersistente = determinarObjetoFAO(nuevoMovimiento);
            return objPersistente.save(nuevoMovimiento);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public List<Movimiento> listAll (TipoMovimiento tipoMovimiento) {
        try{
            MovimientoFAO objPersistente = determinarObjetoFAO(tipoMovimiento);
            return  objPersistente.findAll();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return new ArrayList<>();
    }

    private MovimientoFAO determinarObjetoFAO(Movimiento nuevoMovimiento) throws Exception {

        if (nuevoMovimiento instanceof Retiro) {
            return this.retiroFAO;
        }
        if (nuevoMovimiento instanceof Deposito) {
            return this.depositoFAO;
        }
        throw new Exception("Tipo de Material Desconocido!");
    }

    private MovimientoFAO determinarObjetoFAO(TipoMovimiento tipo) throws Exception {

        if (TipoMovimiento.RETIRO.equals (tipo)) {
            return this.retiroFAO;
        }
        if (TipoMovimiento.DEPOSITO.equals (tipo)) {
            return this.depositoFAO;
        }
        throw new Exception("Tipo de Material Desconocido!");
    }

}
