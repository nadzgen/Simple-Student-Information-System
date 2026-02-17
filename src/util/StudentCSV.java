package util;

import model.Student;
import java.io.*;
import java.util.*;

public class StudentCSV {

    private static final String FILE = "student.csv";

    public static List<Student> getAll() {
        List<Student> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE))) {
            br.readLine();
            String line;
            while ((line = br.readLine()) != null) {
                String[] d = line.split(",");
                list.add(new Student(
                        d[0], d[1], d[2],
                        d[3], Integer.parseInt(d[4]), d[5]
                ));
            }
        } catch (IOException e) { }
        return list;
    }

    public static void saveAll(List<Student> list) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE))) {
            bw.write("id,firstname,lastname,programCode,year,gender\n");
            for (Student s : list) {
                bw.write(s.getId()+","+s.getFirstname()+","+s.getLastname()+","+
                        s.getProgramCode()+","+s.getYear()+","+s.getGender()+"\n");
            }
        } catch (IOException e) { }
    }
}
