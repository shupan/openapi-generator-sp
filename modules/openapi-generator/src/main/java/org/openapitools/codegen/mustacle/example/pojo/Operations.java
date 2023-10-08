package org.openapitools.codegen.mustacle.example.pojo;

import java.util.List;
import com.alibaba.fastjson2.annotation.JSONField;

public class Operations{

	@JSONField(name="classname")
	private String classname;

	@JSONField(name="operation")
	private List<OperationItem> operation;

	@JSONField(name="pathPrefix")
	private String pathPrefix;

	public void setClassname(String classname){
		this.classname = classname;
	}

	public String getClassname(){
		return classname;
	}

	public void setOperation(List<OperationItem> operation){
		this.operation = operation;
	}

	public List<OperationItem> getOperation(){
		return operation;
	}

	public void setPathPrefix(String pathPrefix){
		this.pathPrefix = pathPrefix;
	}

	public String getPathPrefix(){
		return pathPrefix;
	}
}