package org.example.springbootcruddemo.service.impl;

import org.example.springbootcruddemo.entity.Student;
import org.example.springbootcruddemo.repo.StudentRepo;
import org.example.springbootcruddemo.service.StduentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
 @Service
public class StudentImpl implements StduentService {

     @Autowired
     private StudentRepo studentRepo;
    @Override
    public List<Student> fetchAllStudents() {
        return studentRepo.findAll();
    }

    @Override
    public Student getStudentById(int id) {
        return studentRepo.findById(id).get();
    }

    @Override
    public String insertStudent(Student student) {

        studentRepo.save(student);
        return " Student inserted successfully";
    }

    @Override
    public String updateStudent(Student student) {

        Student s  =studentRepo.findById(student.getId()).get();
         s.setDepartment(student.getDepartment());
         s.setAge(student.getAge());
         studentRepo.save(s);
        return "updated successfully ";
    }

    @Override
    public String deleteStudent(int id) {
         studentRepo.deleteStudentById(id);
        return "deleted the student with id "+id;
    }
}
