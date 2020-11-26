package cr.ac.ucenfotec.tarea3.bl.persistencia;

import cr.ac.ucenfotec.tarea3.bl.entidades.Cuenta;

import java.util.List;

public abstract class CuentaFAO {

    public abstract boolean save(Cuenta nuevacUENTA);

    public abstract List<Cuenta> findAll();


}
