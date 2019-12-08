package com.example.trabalho.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	//passa o id do obj que tentei encontrar e não encontrei
	public ResourceNotFoundException(Object id) {
		super("Resource not found. Id " + id);
	}

}
