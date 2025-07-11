package org.example.springbootcruddemo.repo;

import org.example.springbootcruddemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {


    void deleteStudentById(int id);
}
