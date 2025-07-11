package org.example.springbootcruddemo.service;

import org.example.springbootcruddemo.entity.Student;

import java.util.List;

public interface StduentService {

     public List<Student> fetchAllStudents();
     public Student getStudentById(int id);
     public String insertStudent(Student student);
     public String updateStudent(Student student);
     public String deleteStudent(int id);
}
