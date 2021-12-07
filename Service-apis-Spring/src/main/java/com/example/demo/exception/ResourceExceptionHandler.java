package com.example.demo.exception;

import java.util.Date;

import org.json.JSONObject;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ResourceExceptionHandler extends ResponseEntityExceptionHandler{
	//Not found Exception
	@ExceptionHandler(ResourceNotFoundException.class)
	   public ResponseEntity<?> studentNotFoundHandling(ResourceNotFoundException ex,WebRequest wr){
		   ResourceException se=new ResourceException(new Date(),"This is not found",wr.getDescription(false));
	       return new ResponseEntity<>(se,HttpStatus.NOT_FOUND);
	   }
	
	//Handle other invalid methods
   @Override
	protected ResponseEntity<Object> handleExceptionInternal(Exception ex, Object body, HttpHeaders headers,
			HttpStatus status, WebRequest request) {
	    JSONObject jo=new JSONObject();
		jo.put("status", status.value());
		jo.put("error", status.getReasonPhrase());
		jo.put("message", "Method is not allowed please check it");
		return new ResponseEntity<>(jo.toString(),status);
	}

	//For handling post data with incorrect details ie: BadRequest
	@Override
	protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		// TODO Auto-generated method stub
		JSONObject jo=new JSONObject();
		jo.put("status", status.value());
		jo.put("error", status.getReasonPhrase());
		jo.put("message", "Please post correct details");
		return new ResponseEntity<>(jo.toString(),status);
	}
}
