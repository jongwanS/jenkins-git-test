package com.jwlim.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwlim.api.model.ResponseMsg;


@RestController
public class ApiController {
	
	@GetMapping(value = "/api/call", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseMsg> getApiCall(
    	) {
		ResponseMsg msg = new ResponseMsg();
		msg.setStatus("200")
		   .setMessage("api test")
		   .build();
		
        return new ResponseEntity<ResponseMsg>(msg, HttpStatus.OK);
    }
	
	@PostMapping(value = "/api/call", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseMsg> getPostCall(
    	) {
		ResponseMsg msg = new ResponseMsg();
		msg.setStatus("200")
		   .setMessage("api test")
		   .build();
		
        return new ResponseEntity<ResponseMsg>(msg, HttpStatus.OK);
    }
	
	@PutMapping(value = "/api/call", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseMsg> getPutCall(
    	) {
		ResponseMsg msg = new ResponseMsg();
		msg.setStatus("405")
		   .setMessage("api test method not allowed")
		   .build();
		
        return new ResponseEntity<ResponseMsg>(msg, HttpStatus.METHOD_NOT_ALLOWED);
    }
}
