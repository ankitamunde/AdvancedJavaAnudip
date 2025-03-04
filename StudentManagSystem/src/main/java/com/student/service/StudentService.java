package com.student.service;

import java.util.List;



import com.student.entity.Student;




public interface StudentService {

    // List all students
    List<Student> getAllStudents();

    // Create and save student
    Student saveStudent(Student student);

    // Get student by ID
    Student getStudentById(Long id);

    // Update student
    Student updateStudent(Student student);

    // Delete student by ID
    void deleteStudentById(Long id);
}
