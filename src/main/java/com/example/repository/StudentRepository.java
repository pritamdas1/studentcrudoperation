package com.example.repository;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Student;
@Configuration
public interface StudentRepository extends JpaRepository<Student, Integer>{


Student findByName(String name);
}
