package com.iftm;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface = "com.iftm.ExemploService")
public class ExemploServiceImpl implements ExemploService {

	@WebMethod
	public int calcula(int id) {
		return id + 10;
	}

	@WebMethod
	public String nome() {
		return "Hugo César Rodrigues dos Santos";
	}

}
