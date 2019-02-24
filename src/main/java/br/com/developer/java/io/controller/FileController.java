package br.com.developer.java.io.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping( "/api" )
public class FileController { 
	
	@RequestMapping( value = "/file",method = RequestMethod.POST)
	public @ResponseBody String teste() 
	{
		return "Arquivo enviado...";
	}

}
