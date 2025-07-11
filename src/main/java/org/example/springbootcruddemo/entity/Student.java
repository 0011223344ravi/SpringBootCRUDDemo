package org.example.springbootcruddemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@Entity
public class Student {

      @Id

      private int id ;
      private String name ;
      private String department;
      private int age ;
}
