package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.entity.Student;
import com.example.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;

	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	public List<Student> getstudent() {
		return studentRepository.findAll();
	}

	
	
	
	public Student updatestudent(Student student)
	{
		Student existingstudent=studentRepository.findById(student.getId()).orElse(null);
		existingstudent.setName(student.getName());
		existingstudent.setAddress(student.getAddress());
		existingstudent.setClassname(student.getClassname());
		return studentRepository.save(existingstudent);
		 
	}


}
