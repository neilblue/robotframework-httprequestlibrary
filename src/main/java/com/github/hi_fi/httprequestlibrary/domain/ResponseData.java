package com.github.hi_fi.httprequestlibrary.domain;

import java.util.Map;

import com.google.gson.Gson;

public class ResponseData {
	public int status_code;
	public String text;
	public String content;
	@SuppressWarnings("rawtypes")
	public Map json;


	public int getStatusCode() {
		return status_code;
	}


	public void setStatusCode(int status_code) {
		this.status_code = status_code;
	}


	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
		this.content = text;
		try {
			this.json = new Gson().fromJson(text, Map.class);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public String toString() {
		return new Gson().toJson(this);
	}

}
