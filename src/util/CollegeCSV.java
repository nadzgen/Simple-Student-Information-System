package util;

import model.College;
import java.io.*;
import java.util.*;

public class CollegeCSV {

    private static final String FILE = "college.csv";

    public static List<College> getAll() {
        List<College> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE))) {
            br.readLine();
            String line;
            while ((line = br.readLine()) != null) {
                String[] d = line.split(",");
                list.add(new College(d[0], d[1]));
            }
        } catch (IOException e) { }
        return list;
    }

    public static void saveAll(List<College> list) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE))) {
            bw.write("code,name\n");
            for (College c : list) {
                bw.write(c.getCode()+","+c.getName()+"\n");
            }
        } catch (IOException e) { }
    }
}
