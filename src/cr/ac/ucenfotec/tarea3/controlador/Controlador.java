package cr.ac.ucenfotec.tarea3.controlador;

import cr.ac.ucenfotec.tarea3.bl.entidades.Cliente;
import cr.ac.ucenfotec.tarea3.ui.UI;

public class Controlador {

    private final UI interfaz = new UI();

    public void ejecutarPrograma(){
        int op;
        do {
            interfaz.mostrarMenu();
            op = interfaz.leerOpcion();
            procesarOpcion(op);
        } while (op != 15);
    }

    private void procesarOpcion(int op) {

        switch (op) {
            case 1 -> registrarCliente();
            case 2 -> registrarCuenta();
            case 3 -> realizarRetiro();
            case 4 -> realizarDeposito();
            case 5 -> {
                interfaz.imprimir("Gracias, te esperamos pronto!");
                System.exit(0);
            }
            default -> System.out.println("Opcion desconocida!");
        }
    }

    private void realizarDeposito() {
    }

    private void realizarRetiro() {
    }

    private void registrarCuenta() {




    }

    private void registrarCliente() {

        interfaz.imprimir("Nombre?");
        String nombre = interfaz.leerString();
        interfaz.imprimir("ID?");
        int ID = interfaz.leerEntero();
        interfaz.imprimir("Direccion?");
        String direccion = interfaz.leerString();
        Cliente clienteTemporal = new Cliente(nombre, ID, direccion);
        //gestorPersona.guardar(estudianteTemporal);
        //String nombre, int identificacion, String direccion;

    }
}
