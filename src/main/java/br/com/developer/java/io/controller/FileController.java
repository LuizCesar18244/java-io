package br.com.developer.java.io.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import br.com.developer.java.io.model.ResponseModel;

@CrossOrigin
@RestController
@RequestMapping( "/api" )
public class FileController { 
	
	@RequestMapping( value = "/file",method = RequestMethod.POST)
	public @ResponseBody ResponseModel teste( @RequestParam("file") MultipartFile file )
	{
		if( file.isEmpty( ) )
			return new ResponseModel(0, "Arquivo Vazio!!!");
		
		InputStream inputStream;
		Scanner scanner = null;
		try
		{
			inputStream = file.getInputStream( );
			scanner = new Scanner( inputStream );
		} catch ( IOException e )
		{
			e.printStackTrace( );
			return new ResponseModel(0, "Arquivo Inválido!!!");
		}
		
		scanner.useDelimiter( " " );
		
		String conteudo = scanner.nextLine( );
		
		scanner.close( );
		
		return new ResponseModel(1, "Arquivo Enviado com sucesso!!!");
	}

}
