package cr.ac.ucenfotec.tarea3.bl.persistencia;

import cr.ac.ucenfotec.tarea3.bl.entidades.Movimiento;

import java.util.List;

public abstract class MovimientoFAO {

    public abstract boolean save (Movimiento nuevoMovimiento);

    public abstract List<Movimiento> findAll();

}
