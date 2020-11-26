package cr.ac.ucenfotec.tarea3.bl.persistencia;

import cr.ac.ucenfotec.tarea3.bl.entidades.Cuenta;
import cr.ac.ucenfotec.tarea3.bl.entidades.CuentaAhorro;
import cr.ac.ucenfotec.tarea3.bl.entidades.Movimiento;
import cr.ac.ucenfotec.tarea3.bl.entidades.Retiro;

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

public class RetiroFAO extends MovimientoFAO{

    @Override
    public boolean save(Movimiento nuevoMovimiento) {

        ArrayList<String> lines = new ArrayList<>();
        lines.add(nuevoMovimiento.toCSVLine());
        try {
            Files.write(Paths.get("/Users/dfrz/Documents/testFiles/listaDeMovimiento.csv"), lines, StandardCharsets.UTF_8, StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Movimiento> findAll() {
        ArrayList<Movimiento> result = new ArrayList<>();
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("/Users/dfrz/Documents/testFiles/listaDeMovimiento.csv"));
            String currentLine = reader.readLine();
            while (currentLine != null) {
                result.add(new Retiro(currentLine));
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
