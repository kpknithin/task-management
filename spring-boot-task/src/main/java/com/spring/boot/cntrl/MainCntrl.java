package com.spring.boot.cntrl;

import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainCntrl {
	
	@GetMapping(value = "home", produces="application/json")
	public ResponseEntity<Response> home(){
		Response res = new Response();
		res.setName("kavin");
		res.setAge(17);
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("name", res.getName());
		jsonObj.put("age", res.getAge());
		System.out.println("working fine");
		return new ResponseEntity<Response>(res,HttpStatus.OK);
	}

}
