package cr.ac.ucenfotec.tarea3.bl.persistencia;

import cr.ac.ucenfotec.tarea3.bl.entidades.Cliente;
import cr.ac.ucenfotec.tarea3.bl.entidades.Cuenta;
import cr.ac.ucenfotec.tarea3.bl.entidades.CuentaAhorro;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class ClienteFAO {

    public boolean save(Cliente nuevoCliente) {
        ArrayList<String> lines = new ArrayList<>();
        lines.add(nuevoCliente.toCSVLine());
        try {
            Files.write(Paths.get("/Users/dfrz/Documents/testFiles/listaDeCliente.csv"), lines, StandardCharsets.UTF_8, StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public List<Cliente> findAll() {
        ArrayList<Cliente> result = new ArrayList<>();
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("/Users/dfrz/Documents/testFiles/listadeCliente.csv"));
            String currentLine = reader.readLine();
            while (currentLine != null) {
                result.add(new Cliente(currentLine));
                currentLine = reader.readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

}
