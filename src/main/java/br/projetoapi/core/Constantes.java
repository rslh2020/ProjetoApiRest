package br.projetoapi.core;

import io.restassured.http.ContentType;

public interface Constantes {
	
	String APP_BASE_URL = "https://reqres.in/";
	Integer APP_PORT = 443;
	String APP_BASE_PATH = "/api";
	
	ContentType APP_CONTENT_TYPE = ContentType.JSON;
    long MAX_TIMEOUT = 5000L;	
}
