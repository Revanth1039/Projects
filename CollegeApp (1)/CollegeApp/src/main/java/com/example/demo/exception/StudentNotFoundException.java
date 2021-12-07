package com.example.demo.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;
@ResponseStatus(value = HttpStatus.NOT_FOUND)

public class StudentNotFoundException extends RuntimeException{
	static final long serialVersionUID=-2398328;
	public StudentNotFoundException(String message){
		super(message);
	}

}
