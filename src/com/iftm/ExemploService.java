package com.iftm;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface ExemploService {

	@WebMethod
	int calcula(int id);
	
	@WebMethod
	String nome();

}
