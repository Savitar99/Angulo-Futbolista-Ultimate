package com.edu.ubosque.prg.entity;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "parameter")
public class Parameter implements Serializable {

	
	private static final long serialVersionUID = 3128686447784382592L;

	@Id
	private int id;

	private String descriptionParameter;

	private int numberValue;

	private String parameterCode;

	private String parameterType;

	private String textValue;

	public Parameter() {
	}
	
	public Parameter(int id) {
		this.id = id;
	}

	
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescriptionParameter() {
		return this.descriptionParameter;
	}

	public void setDescriptionParameter(String descriptionParameter) {
		this.descriptionParameter = descriptionParameter;
	}

	public int getNumberValue() {
		return this.numberValue;
	}

	public void setNumberValue(int numberValue) {
		this.numberValue = numberValue;
	}
	

	public String getParameterCode() {
		return this.parameterCode;
	}

	public void setParameterCode(String parameterCode) {
		this.parameterCode = parameterCode;
	}

	public String getParameterType() {
		return this.parameterType;
	}

	public void setParameterType(String parameterType) {
		this.parameterType = parameterType;
	}

	
	public String getTextValue() {
		return this.textValue;
	}

	public void setTextValue(String textValue) {
		this.textValue = textValue;
	}

}