package model;

public class Student {
    private String id, firstname, lastname, programCode, gender;
    private int year;

    public Student(String id, String firstname, String lastname,
                   String programCode, int year, String gender) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.programCode = programCode;
        this.year = year;
        this.gender = gender;
    }

    public String getId() { return id; }
    public String getFirstname() { return firstname; }
    public String getLastname() { return lastname; }
    public String getProgramCode() { return programCode; }
    public int getYear() { return year; }
    public String getGender() { return gender; }
}
