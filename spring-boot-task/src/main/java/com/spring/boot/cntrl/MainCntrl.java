package com.spring.boot.cntrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.entity.Task;
import com.spring.boot.svc.TaskService;

@RestController
@RequestMapping("/")
public class MainCntrl {
	
	@Autowired TaskService taskSvc;
	
	@GetMapping(value = "home", produces="application/json")
	public ResponseEntity<List<Task>> home(){
		List<Task> taskList = taskSvc.getTask();
		System.out.println("working fine");
		return new ResponseEntity<List<Task>>(taskList,HttpStatus.OK);
	}

}
