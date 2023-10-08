package org.openapitools.codegen.mustacle.example.pojo;

import com.alibaba.fastjson2.annotation.JSONField;

public class ApplicationJson{

	@JSONField(name="schema")
	private Schema schema;

	@JSONField(name="vendorExtensions")
	private VendorExtensions vendorExtensions;

	@JSONField(name="testCases")
	private TestCases testCases;

	public void setSchema(Schema schema){
		this.schema = schema;
	}

	public Schema getSchema(){
		return schema;
	}

	public void setVendorExtensions(VendorExtensions vendorExtensions){
		this.vendorExtensions = vendorExtensions;
	}

	public VendorExtensions getVendorExtensions(){
		return vendorExtensions;
	}

	public void setTestCases(TestCases testCases){
		this.testCases = testCases;
	}

	public TestCases getTestCases(){
		return testCases;
	}
}