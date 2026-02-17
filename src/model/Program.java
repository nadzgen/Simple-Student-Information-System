package model;

public class Program {
    private String code, name, collegeCode;

    public Program(String code, String name, String collegeCode) {
        this.code = code;
        this.name = name;
        this.collegeCode = collegeCode;
    }

    public String getCode() { return code; }
    public String getName() { return name; }
    public String getCollegeCode() { return collegeCode; }
}
