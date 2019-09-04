package com.spring.boot.svc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.dao.TaskDAO;
import com.spring.boot.entity.Task;

@Service
public class TaskService {

	@Autowired TaskDAO task;
	
	public List<Task> getTask(){
		return task.getTask();
	}
}
