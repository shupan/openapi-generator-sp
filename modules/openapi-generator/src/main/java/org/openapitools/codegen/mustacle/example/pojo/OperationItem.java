package org.openapitools.codegen.mustacle.example.pojo;

import java.util.List;
import com.alibaba.fastjson2.annotation.JSONField;

public class OperationItem{

	@JSONField(name="cookieParams")
	private List<Object> cookieParams;

	@JSONField(name="hasVendorExtensions")
	private boolean hasVendorExtensions;

	@JSONField(name="hasBodyParam")
	private boolean hasBodyParam;

	@JSONField(name="operationIdCamelCase")
	private String operationIdCamelCase;

	@JSONField(name="callbacks")
	private List<Object> callbacks;

	@JSONField(name="optionalParams")
	private List<Object> optionalParams;

	@JSONField(name="hasPathParams")
	private boolean hasPathParams;

	@JSONField(name="hasVersionQueryParams")
	private boolean hasVersionQueryParams;

	@JSONField(name="restfulCreate")
	private boolean restfulCreate;

	@JSONField(name="notNullableParams")
	private List<Object> notNullableParams;

	@JSONField(name="hasNotNullableParams")
	private boolean hasNotNullableParams;

	@JSONField(name="path")
	private String path;

	@JSONField(name="headerParams")
	private List<Object> headerParams;

	@JSONField(name="hasHeaderParams")
	private boolean hasHeaderParams;

	@JSONField(name="returnSimpleType")
	private boolean returnSimpleType;

	@JSONField(name="allParams")
	private List<Object> allParams;

	@JSONField(name="hasConstantParams")
	private boolean hasConstantParams;

	@JSONField(name="isRestfulIndex")
	private boolean isRestfulIndex;

	@JSONField(name="returnProperty")
	private ReturnProperty returnProperty;

	@JSONField(name="baseName")
	private String baseName;

	@JSONField(name="implicitHeadersParams")
	private List<Object> implicitHeadersParams;

	@JSONField(name="hasDefaultResponse")
	private boolean hasDefaultResponse;

	@JSONField(name="imports")
	private List<String> imports;

	@JSONField(name="pathParams")
	private List<Object> pathParams;

	@JSONField(name="formParams")
	private List<Object> formParams;

	@JSONField(name="hasCookieParams")
	private boolean hasCookieParams;

	@JSONField(name="hasAuthMethods")
	private boolean hasAuthMethods;

	@JSONField(name="isRestfulUpdate")
	private boolean isRestfulUpdate;

	@JSONField(name="returnContainer")
	private String returnContainer;

	@JSONField(name="isMap")
	private boolean isMap;

	@JSONField(name="returnBaseType")
	private String returnBaseType;

	@JSONField(name="tags")
	private List<TagsItem> tags;

	@JSONField(name="isRestfulCreate")
	private boolean isRestfulCreate;

	@JSONField(name="responseHeaders")
	private List<Object> responseHeaders;

	@JSONField(name="examples")
	private List<ExamplesItem> examples;

	@JSONField(name="constantParams")
	private List<Object> constantParams;

	@JSONField(name="uniqueItems")
	private boolean uniqueItems;

	@JSONField(name="produces")
	private List<ProducesItem> produces;

	@JSONField(name="isArray")
	private boolean isArray;

	@JSONField(name="isRestfulShow")
	private boolean isRestfulShow;

	@JSONField(name="hasErrorResponseObject")
	private boolean hasErrorResponseObject;

	@JSONField(name="allResponsesAreErrors")
	private boolean allResponsesAreErrors;

	@JSONField(name="returnType")
	private String returnType;

	@JSONField(name="isResponseBinary")
	private boolean isResponseBinary;

	@JSONField(name="hasFormParams")
	private boolean hasFormParams;

	@JSONField(name="operationIdOriginal")
	private String operationIdOriginal;

	@JSONField(name="restful")
	private boolean restful;

	@JSONField(name="isRestful")
	private boolean isRestful;

	@JSONField(name="queryParams")
	private List<Object> queryParams;

	@JSONField(name="isResponseFile")
	private boolean isResponseFile;

	@JSONField(name="hasConsumes")
	private boolean hasConsumes;

	@JSONField(name="httpMethod")
	private String httpMethod;

	@JSONField(name="hasBodyOrFormParams")
	private boolean hasBodyOrFormParams;

	@JSONField(name="hasProduces")
	private boolean hasProduces;

	@JSONField(name="hasRequiredParams")
	private boolean hasRequiredParams;

	@JSONField(name="hasReference")
	private boolean hasReference;

	@JSONField(name="hasRequiredAndNotNullableParams")
	private boolean hasRequiredAndNotNullableParams;

	@JSONField(name="bodyAllowed")
	private boolean bodyAllowed;

	@JSONField(name="hasExamples")
	private boolean hasExamples;

	@JSONField(name="servers")
	private List<Object> servers;

	@JSONField(name="hasQueryParams")
	private boolean hasQueryParams;

	@JSONField(name="restfulShow")
	private boolean restfulShow;

	@JSONField(name="requiredParams")
	private List<Object> requiredParams;

	@JSONField(name="hasVersionHeaders")
	private boolean hasVersionHeaders;

	@JSONField(name="nickname")
	private String nickname;

	@JSONField(name="operationIdLowerCase")
	private String operationIdLowerCase;

	@JSONField(name="operationId")
	private String operationId;

	@JSONField(name="hasParams")
	private boolean hasParams;

	@JSONField(name="isResponseOptional")
	private boolean isResponseOptional;

	@JSONField(name="operationIdSnakeCase")
	private String operationIdSnakeCase;

	@JSONField(name="returnTypeIsPrimitive")
	private boolean returnTypeIsPrimitive;

	@JSONField(name="isCallbackRequest")
	private boolean isCallbackRequest;

	@JSONField(name="summary")
	private String summary;

	@JSONField(name="isDeprecated")
	private boolean isDeprecated;

	@JSONField(name="vendorExtensions")
	private VendorExtensions vendorExtensions;

	@JSONField(name="restfulIndex")
	private boolean restfulIndex;

	@JSONField(name="bodyParams")
	private List<Object> bodyParams;

	@JSONField(name="restfulDestroy")
	private boolean restfulDestroy;

	@JSONField(name="hasOptionalParams")
	private boolean hasOptionalParams;

	@JSONField(name="defaultResponse")
	private String defaultResponse;

	@JSONField(name="hasQueryParamsOrAuth")
	private boolean hasQueryParamsOrAuth;

	@JSONField(name="requiredAndNotNullableParams")
	private List<Object> requiredAndNotNullableParams;

	@JSONField(name="isVoid")
	private boolean isVoid;

	@JSONField(name="restfulUpdate")
	private boolean restfulUpdate;

	@JSONField(name="subresourceOperation")
	private boolean subresourceOperation;

	@JSONField(name="responses")
	private List<ResponsesItem> responses;

	@JSONField(name="hasResponseHeaders")
	private boolean hasResponseHeaders;

	@JSONField(name="isMultipart")
	private boolean isMultipart;

	@JSONField(name="defaultReturnType")
	private boolean defaultReturnType;

	@JSONField(name="isRestfulDestroy")
	private boolean isRestfulDestroy;

	public void setCookieParams(List<Object> cookieParams){
		this.cookieParams = cookieParams;
	}

	public List<Object> getCookieParams(){
		return cookieParams;
	}

	public void setHasVendorExtensions(boolean hasVendorExtensions){
		this.hasVendorExtensions = hasVendorExtensions;
	}

	public boolean isHasVendorExtensions(){
		return hasVendorExtensions;
	}

	public void setHasBodyParam(boolean hasBodyParam){
		this.hasBodyParam = hasBodyParam;
	}

	public boolean isHasBodyParam(){
		return hasBodyParam;
	}

	public void setOperationIdCamelCase(String operationIdCamelCase){
		this.operationIdCamelCase = operationIdCamelCase;
	}

	public String getOperationIdCamelCase(){
		return operationIdCamelCase;
	}

	public void setCallbacks(List<Object> callbacks){
		this.callbacks = callbacks;
	}

	public List<Object> getCallbacks(){
		return callbacks;
	}

	public void setOptionalParams(List<Object> optionalParams){
		this.optionalParams = optionalParams;
	}

	public List<Object> getOptionalParams(){
		return optionalParams;
	}

	public void setHasPathParams(boolean hasPathParams){
		this.hasPathParams = hasPathParams;
	}

	public boolean isHasPathParams(){
		return hasPathParams;
	}

	public void setHasVersionQueryParams(boolean hasVersionQueryParams){
		this.hasVersionQueryParams = hasVersionQueryParams;
	}

	public boolean isHasVersionQueryParams(){
		return hasVersionQueryParams;
	}

	public void setRestfulCreate(boolean restfulCreate){
		this.restfulCreate = restfulCreate;
	}

	public boolean isRestfulCreate(){
		return restfulCreate;
	}

	public void setNotNullableParams(List<Object> notNullableParams){
		this.notNullableParams = notNullableParams;
	}

	public List<Object> getNotNullableParams(){
		return notNullableParams;
	}

	public void setHasNotNullableParams(boolean hasNotNullableParams){
		this.hasNotNullableParams = hasNotNullableParams;
	}

	public boolean isHasNotNullableParams(){
		return hasNotNullableParams;
	}

	public void setPath(String path){
		this.path = path;
	}

	public String getPath(){
		return path;
	}

	public void setHeaderParams(List<Object> headerParams){
		this.headerParams = headerParams;
	}

	public List<Object> getHeaderParams(){
		return headerParams;
	}

	public void setHasHeaderParams(boolean hasHeaderParams){
		this.hasHeaderParams = hasHeaderParams;
	}

	public boolean isHasHeaderParams(){
		return hasHeaderParams;
	}

	public void setReturnSimpleType(boolean returnSimpleType){
		this.returnSimpleType = returnSimpleType;
	}

	public boolean isReturnSimpleType(){
		return returnSimpleType;
	}

	public void setAllParams(List<Object> allParams){
		this.allParams = allParams;
	}

	public List<Object> getAllParams(){
		return allParams;
	}

	public void setHasConstantParams(boolean hasConstantParams){
		this.hasConstantParams = hasConstantParams;
	}

	public boolean isHasConstantParams(){
		return hasConstantParams;
	}

	public void setIsRestfulIndex(boolean isRestfulIndex){
		this.isRestfulIndex = isRestfulIndex;
	}

	public boolean isIsRestfulIndex(){
		return isRestfulIndex;
	}

	public void setReturnProperty(ReturnProperty returnProperty){
		this.returnProperty = returnProperty;
	}

	public ReturnProperty getReturnProperty(){
		return returnProperty;
	}

	public void setBaseName(String baseName){
		this.baseName = baseName;
	}

	public String getBaseName(){
		return baseName;
	}

	public void setImplicitHeadersParams(List<Object> implicitHeadersParams){
		this.implicitHeadersParams = implicitHeadersParams;
	}

	public List<Object> getImplicitHeadersParams(){
		return implicitHeadersParams;
	}

	public void setHasDefaultResponse(boolean hasDefaultResponse){
		this.hasDefaultResponse = hasDefaultResponse;
	}

	public boolean isHasDefaultResponse(){
		return hasDefaultResponse;
	}

	public void setImports(List<String> imports){
		this.imports = imports;
	}

	public List<String> getImports(){
		return imports;
	}

	public void setPathParams(List<Object> pathParams){
		this.pathParams = pathParams;
	}

	public List<Object> getPathParams(){
		return pathParams;
	}

	public void setFormParams(List<Object> formParams){
		this.formParams = formParams;
	}

	public List<Object> getFormParams(){
		return formParams;
	}

	public void setHasCookieParams(boolean hasCookieParams){
		this.hasCookieParams = hasCookieParams;
	}

	public boolean isHasCookieParams(){
		return hasCookieParams;
	}

	public void setHasAuthMethods(boolean hasAuthMethods){
		this.hasAuthMethods = hasAuthMethods;
	}

	public boolean isHasAuthMethods(){
		return hasAuthMethods;
	}

	public void setIsRestfulUpdate(boolean isRestfulUpdate){
		this.isRestfulUpdate = isRestfulUpdate;
	}

	public boolean isIsRestfulUpdate(){
		return isRestfulUpdate;
	}

	public void setReturnContainer(String returnContainer){
		this.returnContainer = returnContainer;
	}

	public String getReturnContainer(){
		return returnContainer;
	}

	public void setIsMap(boolean isMap){
		this.isMap = isMap;
	}

	public boolean isIsMap(){
		return isMap;
	}

	public void setReturnBaseType(String returnBaseType){
		this.returnBaseType = returnBaseType;
	}

	public String getReturnBaseType(){
		return returnBaseType;
	}

	public void setTags(List<TagsItem> tags){
		this.tags = tags;
	}

	public List<TagsItem> getTags(){
		return tags;
	}

	public void setIsRestfulCreate(boolean isRestfulCreate){
		this.isRestfulCreate = isRestfulCreate;
	}

	public boolean isIsRestfulCreate(){
		return isRestfulCreate;
	}

	public void setResponseHeaders(List<Object> responseHeaders){
		this.responseHeaders = responseHeaders;
	}

	public List<Object> getResponseHeaders(){
		return responseHeaders;
	}

	public void setExamples(List<ExamplesItem> examples){
		this.examples = examples;
	}

	public List<ExamplesItem> getExamples(){
		return examples;
	}

	public void setConstantParams(List<Object> constantParams){
		this.constantParams = constantParams;
	}

	public List<Object> getConstantParams(){
		return constantParams;
	}

	public void setUniqueItems(boolean uniqueItems){
		this.uniqueItems = uniqueItems;
	}

	public boolean isUniqueItems(){
		return uniqueItems;
	}

	public void setProduces(List<ProducesItem> produces){
		this.produces = produces;
	}

	public List<ProducesItem> getProduces(){
		return produces;
	}

	public void setIsArray(boolean isArray){
		this.isArray = isArray;
	}

	public boolean isIsArray(){
		return isArray;
	}

	public void setIsRestfulShow(boolean isRestfulShow){
		this.isRestfulShow = isRestfulShow;
	}

	public boolean isIsRestfulShow(){
		return isRestfulShow;
	}

	public void setHasErrorResponseObject(boolean hasErrorResponseObject){
		this.hasErrorResponseObject = hasErrorResponseObject;
	}

	public boolean isHasErrorResponseObject(){
		return hasErrorResponseObject;
	}

	public void setAllResponsesAreErrors(boolean allResponsesAreErrors){
		this.allResponsesAreErrors = allResponsesAreErrors;
	}

	public boolean isAllResponsesAreErrors(){
		return allResponsesAreErrors;
	}

	public void setReturnType(String returnType){
		this.returnType = returnType;
	}

	public String getReturnType(){
		return returnType;
	}

	public void setIsResponseBinary(boolean isResponseBinary){
		this.isResponseBinary = isResponseBinary;
	}

	public boolean isIsResponseBinary(){
		return isResponseBinary;
	}

	public void setHasFormParams(boolean hasFormParams){
		this.hasFormParams = hasFormParams;
	}

	public boolean isHasFormParams(){
		return hasFormParams;
	}

	public void setOperationIdOriginal(String operationIdOriginal){
		this.operationIdOriginal = operationIdOriginal;
	}

	public String getOperationIdOriginal(){
		return operationIdOriginal;
	}

	public void setRestful(boolean restful){
		this.restful = restful;
	}

	public boolean isRestful(){
		return restful;
	}

	public void setIsRestful(boolean isRestful){
		this.isRestful = isRestful;
	}

	public boolean isIsRestful(){
		return isRestful;
	}

	public void setQueryParams(List<Object> queryParams){
		this.queryParams = queryParams;
	}

	public List<Object> getQueryParams(){
		return queryParams;
	}

	public void setIsResponseFile(boolean isResponseFile){
		this.isResponseFile = isResponseFile;
	}

	public boolean isIsResponseFile(){
		return isResponseFile;
	}

	public void setHasConsumes(boolean hasConsumes){
		this.hasConsumes = hasConsumes;
	}

	public boolean isHasConsumes(){
		return hasConsumes;
	}

	public void setHttpMethod(String httpMethod){
		this.httpMethod = httpMethod;
	}

	public String getHttpMethod(){
		return httpMethod;
	}

	public void setHasBodyOrFormParams(boolean hasBodyOrFormParams){
		this.hasBodyOrFormParams = hasBodyOrFormParams;
	}

	public boolean isHasBodyOrFormParams(){
		return hasBodyOrFormParams;
	}

	public void setHasProduces(boolean hasProduces){
		this.hasProduces = hasProduces;
	}

	public boolean isHasProduces(){
		return hasProduces;
	}

	public void setHasRequiredParams(boolean hasRequiredParams){
		this.hasRequiredParams = hasRequiredParams;
	}

	public boolean isHasRequiredParams(){
		return hasRequiredParams;
	}

	public void setHasReference(boolean hasReference){
		this.hasReference = hasReference;
	}

	public boolean isHasReference(){
		return hasReference;
	}

	public void setHasRequiredAndNotNullableParams(boolean hasRequiredAndNotNullableParams){
		this.hasRequiredAndNotNullableParams = hasRequiredAndNotNullableParams;
	}

	public boolean isHasRequiredAndNotNullableParams(){
		return hasRequiredAndNotNullableParams;
	}

	public void setBodyAllowed(boolean bodyAllowed){
		this.bodyAllowed = bodyAllowed;
	}

	public boolean isBodyAllowed(){
		return bodyAllowed;
	}

	public void setHasExamples(boolean hasExamples){
		this.hasExamples = hasExamples;
	}

	public boolean isHasExamples(){
		return hasExamples;
	}

	public void setServers(List<Object> servers){
		this.servers = servers;
	}

	public List<Object> getServers(){
		return servers;
	}

	public void setHasQueryParams(boolean hasQueryParams){
		this.hasQueryParams = hasQueryParams;
	}

	public boolean isHasQueryParams(){
		return hasQueryParams;
	}

	public void setRestfulShow(boolean restfulShow){
		this.restfulShow = restfulShow;
	}

	public boolean isRestfulShow(){
		return restfulShow;
	}

	public void setRequiredParams(List<Object> requiredParams){
		this.requiredParams = requiredParams;
	}

	public List<Object> getRequiredParams(){
		return requiredParams;
	}

	public void setHasVersionHeaders(boolean hasVersionHeaders){
		this.hasVersionHeaders = hasVersionHeaders;
	}

	public boolean isHasVersionHeaders(){
		return hasVersionHeaders;
	}

	public void setNickname(String nickname){
		this.nickname = nickname;
	}

	public String getNickname(){
		return nickname;
	}

	public void setOperationIdLowerCase(String operationIdLowerCase){
		this.operationIdLowerCase = operationIdLowerCase;
	}

	public String getOperationIdLowerCase(){
		return operationIdLowerCase;
	}

	public void setOperationId(String operationId){
		this.operationId = operationId;
	}

	public String getOperationId(){
		return operationId;
	}

	public void setHasParams(boolean hasParams){
		this.hasParams = hasParams;
	}

	public boolean isHasParams(){
		return hasParams;
	}

	public void setIsResponseOptional(boolean isResponseOptional){
		this.isResponseOptional = isResponseOptional;
	}

	public boolean isIsResponseOptional(){
		return isResponseOptional;
	}

	public void setOperationIdSnakeCase(String operationIdSnakeCase){
		this.operationIdSnakeCase = operationIdSnakeCase;
	}

	public String getOperationIdSnakeCase(){
		return operationIdSnakeCase;
	}

	public void setReturnTypeIsPrimitive(boolean returnTypeIsPrimitive){
		this.returnTypeIsPrimitive = returnTypeIsPrimitive;
	}

	public boolean isReturnTypeIsPrimitive(){
		return returnTypeIsPrimitive;
	}

	public void setIsCallbackRequest(boolean isCallbackRequest){
		this.isCallbackRequest = isCallbackRequest;
	}

	public boolean isIsCallbackRequest(){
		return isCallbackRequest;
	}

	public void setSummary(String summary){
		this.summary = summary;
	}

	public String getSummary(){
		return summary;
	}

	public void setIsDeprecated(boolean isDeprecated){
		this.isDeprecated = isDeprecated;
	}

	public boolean isIsDeprecated(){
		return isDeprecated;
	}

	public void setVendorExtensions(VendorExtensions vendorExtensions){
		this.vendorExtensions = vendorExtensions;
	}

	public VendorExtensions getVendorExtensions(){
		return vendorExtensions;
	}

	public void setRestfulIndex(boolean restfulIndex){
		this.restfulIndex = restfulIndex;
	}

	public boolean isRestfulIndex(){
		return restfulIndex;
	}

	public void setBodyParams(List<Object> bodyParams){
		this.bodyParams = bodyParams;
	}

	public List<Object> getBodyParams(){
		return bodyParams;
	}

	public void setRestfulDestroy(boolean restfulDestroy){
		this.restfulDestroy = restfulDestroy;
	}

	public boolean isRestfulDestroy(){
		return restfulDestroy;
	}

	public void setHasOptionalParams(boolean hasOptionalParams){
		this.hasOptionalParams = hasOptionalParams;
	}

	public boolean isHasOptionalParams(){
		return hasOptionalParams;
	}

	public void setDefaultResponse(String defaultResponse){
		this.defaultResponse = defaultResponse;
	}

	public String getDefaultResponse(){
		return defaultResponse;
	}

	public void setHasQueryParamsOrAuth(boolean hasQueryParamsOrAuth){
		this.hasQueryParamsOrAuth = hasQueryParamsOrAuth;
	}

	public boolean isHasQueryParamsOrAuth(){
		return hasQueryParamsOrAuth;
	}

	public void setRequiredAndNotNullableParams(List<Object> requiredAndNotNullableParams){
		this.requiredAndNotNullableParams = requiredAndNotNullableParams;
	}

	public List<Object> getRequiredAndNotNullableParams(){
		return requiredAndNotNullableParams;
	}

	public void setIsVoid(boolean isVoid){
		this.isVoid = isVoid;
	}

	public boolean isIsVoid(){
		return isVoid;
	}

	public void setRestfulUpdate(boolean restfulUpdate){
		this.restfulUpdate = restfulUpdate;
	}

	public boolean isRestfulUpdate(){
		return restfulUpdate;
	}

	public void setSubresourceOperation(boolean subresourceOperation){
		this.subresourceOperation = subresourceOperation;
	}

	public boolean isSubresourceOperation(){
		return subresourceOperation;
	}

	public void setResponses(List<ResponsesItem> responses){
		this.responses = responses;
	}

	public List<ResponsesItem> getResponses(){
		return responses;
	}

	public void setHasResponseHeaders(boolean hasResponseHeaders){
		this.hasResponseHeaders = hasResponseHeaders;
	}

	public boolean isHasResponseHeaders(){
		return hasResponseHeaders;
	}

	public void setIsMultipart(boolean isMultipart){
		this.isMultipart = isMultipart;
	}

	public boolean isIsMultipart(){
		return isMultipart;
	}

	public void setDefaultReturnType(boolean defaultReturnType){
		this.defaultReturnType = defaultReturnType;
	}

	public boolean isDefaultReturnType(){
		return defaultReturnType;
	}

	public void setIsRestfulDestroy(boolean isRestfulDestroy){
		this.isRestfulDestroy = isRestfulDestroy;
	}

	public boolean isIsRestfulDestroy(){
		return isRestfulDestroy;
	}
}