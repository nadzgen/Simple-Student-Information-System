package util;

import model.Program;
import java.io.*;
import java.util.*;

public class ProgramCSV {

    private static final String FILE = "program.csv";

    public static List<Program> getAll() {
        List<Program> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE))) {
            br.readLine();
            String line;
            while ((line = br.readLine()) != null) {
                String[] d = line.split(",");
                list.add(new Program(d[0], d[1], d[2]));
            }
        } catch (IOException e) { }
        return list;
    }

    public static void saveAll(List<Program> list) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE))) {
            bw.write("code,name,collegeCode\n");
            for (Program p : list) {
                bw.write(p.getCode()+","+p.getName()+","+p.getCollegeCode()+"\n");
            }
        } catch (IOException e) { }
    }
}
