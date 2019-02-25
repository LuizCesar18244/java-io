package br.com.developer.java.io.model;

public class ResponseModel {
	private int    codigo;
	private String mensagem;
	
	public ResponseModel( int codigo, String mensagem ) {
		this.codigo   = codigo;
		this.mensagem = mensagem;
	}
	
	public int getCodigo( ) {
		return codigo;
	}
	
	public String getMensagem( ) {
		return mensagem;
	}
}
