package dao;

import model.Student;
import util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentDAO {

    public boolean registerStudent(Student s) {
        try {
            Connection conn = DBConnection.getConnection();

            String sql = "INSERT INTO students(name, class, email, password) VALUES (?, ?, ?, ?)";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, s.getName());
            ps.setString(2, s.getStudentClass());
            ps.setString(3, s.getEmail());
            ps.setString(4, s.getPassword());

            ps.executeUpdate();
            return true;

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }
}