package cr.ac.ucenfotec.tarea3.bl.persistencia;

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

public class CuentaCorrienteFAO extends CuentaFAO {

    @Override
    public boolean save(Cuenta nuevaCuenta) {

        ArrayList<String> lines = new ArrayList<>();
        lines.add(nuevaCuenta.toCSVLine());
        try {
            Files.write(Paths.get("/Users/dfrz/Documents/testFiles/listaDeCuenta.csv"), lines, StandardCharsets.UTF_8, StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Cuenta> findAll() {
        ArrayList<Cuenta> result = new ArrayList<>();
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("/Users/dfrz/Documents/testFiles/listaDeCuenta.csv"));
            String currentLine = reader.readLine();
            while (currentLine != null) {
                result.add(new CuentaAhorro(currentLine));
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
