package com.example.securelogin.domain.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class Config implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String value;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
