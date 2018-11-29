package com.learn.spring.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet resSet, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setAge(resSet.getInt("age"));
		student.setId(resSet.getInt("id"));
		student.setName(resSet.getString("name"));
		
		return student;
	}

}
