package cr.ac.ucenfotec.tarea3.ui;

import java.io.PrintStream;
import java.util.Scanner;

public class UI {

    private PrintStream output = new PrintStream(System.out);
    private Scanner input = new Scanner(System.in).useDelimiter("\n");

    public void mostrarMenu () {
        output.println("Bienvenido a el banco Los Lavadores Dot Com: ");
        output.println("1. Registrar Cliente");
        output.println("2. Registrar Cuenta");
        output.println("3. Realizar Retiro");
        output.println("4. Realizar Deposito");
        output.println("5. Salir");
    }

    public int leerOpcion () {
        output.println("Su opcion es: ");
        return input.nextInt();
    }

    public void imprimir (String msj) {
        output.println(msj);
    }

    public String leerString () {
        return input.next();
    }

    public int leerEntero() {
        return input.nextInt();
    }

}
