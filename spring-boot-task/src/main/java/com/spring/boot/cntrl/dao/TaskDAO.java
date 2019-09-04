package com.spring.boot.cntrl.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.boot.entity.Task;

@Repository
public class TaskDAO {

	@Autowired JdbcTemplate jdbcTemplate;
	
	private static String SELECT = "SELECT * FROM TASK";

	public List<Task> getTask() {
		return jdbcTemplate.query(SELECT,
				new BeanPropertyRowMapper<Task>(Task.class));
	}
}
