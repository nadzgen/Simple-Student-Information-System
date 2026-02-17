package util;

import java.util.regex.Pattern;

public class Validator {

    public static boolean validStudentId(String id) {
        return Pattern.matches("\\d{4}-\\d{4}", id);
    }

    public static boolean studentExists(String id) {
        return StudentCSV.getAll()
                .stream().anyMatch(s -> s.getId().equals(id));
    }

    public static boolean programExists(String code) {
        return ProgramCSV.getAll()
                .stream().anyMatch(p -> p.getCode().equals(code));
    }

    public static boolean collegeExists(String code) {
        return CollegeCSV.getAll()
                .stream().anyMatch(c -> c.getCode().equals(code));
    }

    public static boolean programUsed(String code) {
        return StudentCSV.getAll()
                .stream().anyMatch(s -> s.getProgramCode().equals(code));
    }

    public static boolean collegeUsed(String code) {
        return ProgramCSV.getAll()
                .stream().anyMatch(p -> p.getCollegeCode().equals(code));
    }
}
