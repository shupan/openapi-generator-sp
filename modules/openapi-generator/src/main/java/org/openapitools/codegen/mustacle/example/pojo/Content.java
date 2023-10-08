package org.openapitools.codegen.mustacle.example.pojo;

import com.alibaba.fastjson2.annotation.JSONField;

public class Content{

	@JSONField(name="application/json")
	private ApplicationJson applicationJson;

	public void setApplicationJson(ApplicationJson applicationJson){
		this.applicationJson = applicationJson;
	}

	public ApplicationJson getApplicationJson(){
		return applicationJson;
	}
}