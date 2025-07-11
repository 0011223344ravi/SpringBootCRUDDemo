package org.example.springbootcruddemo.controller;

import jakarta.annotation.security.PermitAll;
import org.example.springbootcruddemo.entity.Student;
import org.example.springbootcruddemo.service.StduentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/insert")
    public String insert(@RequestBody  Student student){
        return    service.insertStudent(student);
    }
}
