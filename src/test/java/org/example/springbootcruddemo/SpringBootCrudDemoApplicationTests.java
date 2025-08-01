/*
package org.example.springbootcruddemo;

import org.example.springbootcruddemo.entity.Student;
import org.example.springbootcruddemo.repo.StudentRepo;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
class SpringBootCrudDemoApplicationTests {

     @LocalServerPort
    private int port;
  @Autowired
  private StudentRepo studentRepo;

   private static String baseUrl = "http://localhost:";

   public static TestRestTemplate testRestTemplate;

    @BeforeAll
    public static void init(){
        testRestTemplate  =new TestRestTemplate();
    }
     @BeforeEach
     public void setUp(){
        baseUrl=baseUrl.concat(port+"").concat("/student");
     }

    @Test
  public void findAllStudentTest(){
        List<Student> sList  = testRestTemplate.getForObject(baseUrl.concat("/all"), List.class);

        assertEquals(0, sList.size());

    }

     @Test
     public void insertStudent(){
        Student st = new Student(101,"Ravi","CSE",28);
         String str  = testRestTemplate.postForObject(baseUrl.concat("/insert"),st, String.class);
        //assertEquals(" Student inserted successfully",str);

    }

    @Test
    void contextLoads() {
    }

}
*/
