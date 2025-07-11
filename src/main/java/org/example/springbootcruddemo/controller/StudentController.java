package org.example.springbootcruddemo.controller;

import jakarta.annotation.security.PermitAll;
import org.example.springbootcruddemo.entity.Student;
import org.example.springbootcruddemo.service.StduentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

      @Autowired
      private StduentService service;
     @GetMapping("/all")
    public List<Student> getAllStudents(){
        return service.fetchAllStudents();
     }

     @GetMapping("/findStudentById/{id}")
    public Student getStudentById(@PathVariable int id){
      return    service.getStudentById(id);
     }
}
