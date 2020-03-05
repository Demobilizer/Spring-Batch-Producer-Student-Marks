/**
 * 
 */
package com.demo.service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Student;
import com.demo.repository.StudentRepo;

/**
 * @author Mehul
**/

@Service
public class StudentService {

	@Autowired
	private StudentRepo studentRepo;

	/**
	 * @return 
	 * 
	 */
	public List<Student> getAllStudents() {
	    return studentRepo.findAll();
	}

	/**
	 * @param student
	 */
	public void addStudent(Student student) {
		studentRepo.save(student);
	}
	
}
