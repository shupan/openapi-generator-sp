package org.openapitools.codegen.mustacle.example.pojo;

import com.alibaba.fastjson2.annotation.JSONField;

public class ImportsItem{

	@JSONField(name="import")
	private String jsonMemberImport;

	@JSONField(name="classname")
	private String classname;

	public void setJsonMemberImport(String jsonMemberImport){
		this.jsonMemberImport = jsonMemberImport;
	}

	public String getJsonMemberImport(){
		return jsonMemberImport;
	}

	public void setClassname(String classname){
		this.classname = classname;
	}

	public String getClassname(){
		return classname;
	}
}