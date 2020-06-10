package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Student;
import com.example.service.StudentService;

@RestController

public class StudentController {
	@Autowired
	private StudentService studentService;
	@PostMapping("/addStudent")   /*adding of students*/
	public Student addstudent(@RequestBody Student student)
	{
		System.out.println("inside add student"+student.toString());
		return studentService.saveStudent(student);
	}
	
	@GetMapping("/getstudents")  /*getting of students information*/
	public List<Student> GetAllStudent()
	{
		return studentService.getstudent();
	}
	@PutMapping("/update")    /* updation of students table*/
	public Student studentupdate(@RequestBody Student student)
	{
		return studentService.updatestudent(student);
		
	}
	
	
	
	
	
	
	

}
