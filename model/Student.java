package model;

public class Student {

    private int id;
    private String name;
    private String studentClass;
    private String email;
    private String password;

    public Student() {}

    public Student(String name, String studentClass, String email, String password) {
        this.name = name;
        this.studentClass = studentClass;
        this.email = email;
        this.password = password;
    }

    // Getters & Setters (Encapsulation)
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getStudentClass() { return studentClass; }
    public void setStudentClass(String studentClass) { this.studentClass = studentClass; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}