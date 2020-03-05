/**
 * 
 */
package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Student;
import com.demo.service.StudentService;

/**
 * @author Mehul
**/

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/get-students")
	public List<Student> getStudents() {
		return studentService.getAllStudents();
	}
	
	@PostMapping("/add-student")
	public String addStudent(@RequestBody Student student) {
		studentService.addStudent(student);
		return "added!";
	}
}
