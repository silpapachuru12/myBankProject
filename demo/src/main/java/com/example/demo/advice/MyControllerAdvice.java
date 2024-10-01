package com.example.demo.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.demo.globalExceptionHandler.EmptyInputException;

@ControllerAdvice
public class MyControllerAdvice {
	@ExceptionHandler(EmptyInputException.class)
	ResponseEntity<String>handleEmptyInput(EmptyInputException emptyinputException){
		return new ResponseEntity<String>("Input field is Empty, Please look into it", HttpStatus.BAD_REQUEST);
	}

}
