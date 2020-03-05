/**
 * 
 */
package com.demo.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.demo.model.Student;

/**
 * @author Mehul
**/

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

	/**
	 * @param oneMinBack
	 * @return
	 */
	
	//@Query("select s from Student s where s.created >= :created")
	//List<Student> findAllLastMin(@Param("created") Date created);

}
