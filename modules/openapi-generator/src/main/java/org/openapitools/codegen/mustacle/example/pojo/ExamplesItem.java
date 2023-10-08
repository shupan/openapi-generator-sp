package org.openapitools.codegen.mustacle.example.pojo;

import com.alibaba.fastjson2.annotation.JSONField;

public class ExamplesItem{

	@JSONField(name="generatedContentType")
	private String generatedContentType;

	@JSONField(name="contentType")
	private String contentType;

	@JSONField(name="example")
	private String example;

	@JSONField(name="statusCode")
	private String statusCode;

	public void setGeneratedContentType(String generatedContentType){
		this.generatedContentType = generatedContentType;
	}

	public String getGeneratedContentType(){
		return generatedContentType;
	}

	public void setContentType(String contentType){
		this.contentType = contentType;
	}

	public String getContentType(){
		return contentType;
	}

	public void setExample(String example){
		this.example = example;
	}

	public String getExample(){
		return example;
	}

	public void setStatusCode(String statusCode){
		this.statusCode = statusCode;
	}

	public String getStatusCode(){
		return statusCode;
	}
}