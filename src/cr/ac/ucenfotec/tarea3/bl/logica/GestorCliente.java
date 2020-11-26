package cr.ac.ucenfotec.tarea3.bl.logica;

import cr.ac.ucenfotec.tarea3.bl.entidades.Cliente;
import cr.ac.ucenfotec.tarea3.bl.persistencia.ClienteFAO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GestorCliente {

    private ClienteFAO clienteFAO = new ClienteFAO();

    public void storeCliente(String nombre, int identificacion, String direccion) {
        Cliente cliente = new Cliente(nombre, identificacion, direccion);
        clienteFAO.save(cliente);
    }

    public List<Cliente> findAllMaterial() {
        return clienteFAO.findAll();
    }

}
