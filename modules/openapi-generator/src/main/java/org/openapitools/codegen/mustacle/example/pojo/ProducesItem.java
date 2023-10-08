package org.openapitools.codegen.mustacle.example.pojo;

import com.alibaba.fastjson2.annotation.JSONField;

public class ProducesItem{

	@JSONField(name="isJson")
	private String isJson;

	@JSONField(name="mediaType")
	private String mediaType;

	public void setIsJson(String isJson){
		this.isJson = isJson;
	}

	public String getIsJson(){
		return isJson;
	}

	public void setMediaType(String mediaType){
		this.mediaType = mediaType;
	}

	public String getMediaType(){
		return mediaType;
	}
}