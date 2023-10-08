package org.openapitools.codegen.mustacle.example.pojo;

import java.util.Arrays;
import java.util.List;
import com.alibaba.fastjson2.annotation.JSONField;
import org.openapitools.codegen.mustacle.example.Example;

public class Response{

	@JSONField(name="modelSrcPath")
	private String modelSrcPath;

	@JSONField(name="appVersion")
	private String appVersion;

	@JSONField(name="generatorClass")
	private String generatorClass;

	@JSONField(name="sortParamsByRequiredFlag")
	private boolean sortParamsByRequiredFlag;

	@JSONField(name="operationTagDescription")
	private String operationTagDescription;

	@JSONField(name="invokerPackage")
	private String invokerPackage;

	@JSONField(name="classVarName")
	private String classVarName;

	@JSONField(name="generateModelDocs")
	private boolean generateModelDocs;

	@JSONField(name="hasImport")
	private boolean hasImport;

	@JSONField(name="generateModelTests")
	private boolean generateModelTests;

	@JSONField(name="strictSpecBehavior")
	private boolean strictSpecBehavior;

	@JSONField(name="generateApiTests")
	private boolean generateApiTests;

	@JSONField(name="classFilename")
	private String classFilename;

	@JSONField(name="lambda")
	private Lambda lambda;

	@JSONField(name="generateModels")
	private boolean generateModels;

	@JSONField(name="apiVersion")
	private String apiVersion;

	@JSONField(name="inputSpec")
	private String inputSpec;

	@JSONField(name="artifactUrl")
	private String artifactUrl;

	@JSONField(name="developerOrganization")
	private String developerOrganization;

	@JSONField(name="baseName")
	private String baseName;

	@JSONField(name="package")
	private String jsonMemberPackage;

	@JSONField(name="imports")
	private List<ImportsItem> imports;

	@JSONField(name="contextPath")
	private String contextPath;

	@JSONField(name="appDescription")
	private String appDescription;

	@JSONField(name="licenseName")
	private String licenseName;

	@JSONField(name="interfaceNamePrefix")
	private String interfaceNamePrefix;

	@JSONField(name="version")
	private String version;

	@JSONField(name="releaseNote")
	private String releaseNote;

	@JSONField(name="license")
	private License license;

	@JSONField(name="modelDocPath")
	private String modelDocPath;

	@JSONField(name="escapedInvokerPackage")
	private String escapedInvokerPackage;

	@JSONField(name="abstractNameSuffix")
	private String abstractNameSuffix;

	@JSONField(name="srcBasePath")
	private String srcBasePath;

	@JSONField(name="testBasePath")
	private String testBasePath;

	@JSONField(name="importPath")
	private String importPath;

	@JSONField(name="generatedYear")
	private String generatedYear;

	@JSONField(name="modelPackage")
	private String modelPackage;

	@JSONField(name="abstractNamePrefix")
	private String abstractNamePrefix;

	@JSONField(name="gitHost")
	private String gitHost;

	@JSONField(name="apiSrcPath")
	private String apiSrcPath;

	@JSONField(name="apiTestPath")
	private String apiTestPath;

	@JSONField(name="apiDocPath")
	private String apiDocPath;

	@JSONField(name="licenseInfo")
	private String licenseInfo;

	@JSONField(name="hasModel")
	private boolean hasModel;

	@JSONField(name="generateApis")
	private boolean generateApis;

	@JSONField(name="basePathWithoutHost")
	private String basePathWithoutHost;

	@JSONField(name="primitives")
	private String primitives;

	@JSONField(name="developerOrganizationUrl")
	private String developerOrganizationUrl;

	@JSONField(name="operations")
	private Operations operations;

	@JSONField(name="interfaceNameSuffix")
	private String interfaceNameSuffix;

	@JSONField(name="packageName")
	private String packageName;

	@JSONField(name="hideGenerationTimestamp")
	private boolean hideGenerationTimestamp;

	@JSONField(name="modelTestPath")
	private String modelTestPath;

	@JSONField(name="unescapedAppDescription")
	private String unescapedAppDescription;

	@JSONField(name="appName")
	private String appName;

	@JSONField(name="generateApiDocs")
	private boolean generateApiDocs;

	@JSONField(name="generatorVersion")
	private String generatorVersion;

	@JSONField(name="traitNameSuffix")
	private String traitNameSuffix;

	@JSONField(name="apiPackage")
	private String apiPackage;

	@JSONField(name="basePath")
	private String basePath;

	@JSONField(name="classname")
	private String classname;

	@JSONField(name="gitRepoId")
	private String gitRepoId;

	@JSONField(name="generatedDate")
	private String generatedDate;

	@JSONField(name="traitNamePrefix")
	private String traitNamePrefix;

	@JSONField(name="appDescriptionWithNewLines")
	private String appDescriptionWithNewLines;

	@JSONField(name="gitUserId")
	private String gitUserId;

	public void setModelSrcPath(String modelSrcPath){
		this.modelSrcPath = modelSrcPath;
	}

	public String getModelSrcPath(){
		return modelSrcPath;
	}

	public void setAppVersion(String appVersion){
		this.appVersion = appVersion;
	}

	public String getAppVersion(){
		return appVersion;
	}

	public void setGeneratorClass(String generatorClass){
		this.generatorClass = generatorClass;
	}

	public String getGeneratorClass(){
		return generatorClass;
	}

	public void setSortParamsByRequiredFlag(boolean sortParamsByRequiredFlag){
		this.sortParamsByRequiredFlag = sortParamsByRequiredFlag;
	}

	public boolean isSortParamsByRequiredFlag(){
		return sortParamsByRequiredFlag;
	}

	public void setOperationTagDescription(String operationTagDescription){
		this.operationTagDescription = operationTagDescription;
	}

	public String getOperationTagDescription(){
		return operationTagDescription;
	}

	public void setInvokerPackage(String invokerPackage){
		this.invokerPackage = invokerPackage;
	}

	public String getInvokerPackage(){
		return invokerPackage;
	}

	public void setClassVarName(String classVarName){
		this.classVarName = classVarName;
	}

	public String getClassVarName(){
		return classVarName;
	}

	public void setGenerateModelDocs(boolean generateModelDocs){
		this.generateModelDocs = generateModelDocs;
	}

	public boolean isGenerateModelDocs(){
		return generateModelDocs;
	}

	public void setHasImport(boolean hasImport){
		this.hasImport = hasImport;
	}

	public boolean isHasImport(){
		return hasImport;
	}

	public void setGenerateModelTests(boolean generateModelTests){
		this.generateModelTests = generateModelTests;
	}

	public boolean isGenerateModelTests(){
		return generateModelTests;
	}

	public void setStrictSpecBehavior(boolean strictSpecBehavior){
		this.strictSpecBehavior = strictSpecBehavior;
	}

	public boolean isStrictSpecBehavior(){
		return strictSpecBehavior;
	}

	public void setGenerateApiTests(boolean generateApiTests){
		this.generateApiTests = generateApiTests;
	}

	public boolean isGenerateApiTests(){
		return generateApiTests;
	}

	public void setClassFilename(String classFilename){
		this.classFilename = classFilename;
	}

	public String getClassFilename(){
		return classFilename;
	}

	public void setLambda(Lambda lambda){
		this.lambda = lambda;
	}

	public Lambda getLambda(){
		return lambda;
	}

	public void setGenerateModels(boolean generateModels){
		this.generateModels = generateModels;
	}

	public boolean isGenerateModels(){
		return generateModels;
	}

	public void setApiVersion(String apiVersion){
		this.apiVersion = apiVersion;
	}

	public String getApiVersion(){
		return apiVersion;
	}

	public void setInputSpec(String inputSpec){
		this.inputSpec = inputSpec;
	}

	public String getInputSpec(){
		return inputSpec;
	}

	public void setArtifactUrl(String artifactUrl){
		this.artifactUrl = artifactUrl;
	}

	public String getArtifactUrl(){
		return artifactUrl;
	}

	public void setDeveloperOrganization(String developerOrganization){
		this.developerOrganization = developerOrganization;
	}

	public String getDeveloperOrganization(){
		return developerOrganization;
	}

	public void setBaseName(String baseName){
		this.baseName = baseName;
	}

	public String getBaseName(){
		return baseName;
	}

	public void setJsonMemberPackage(String jsonMemberPackage){
		this.jsonMemberPackage = jsonMemberPackage;
	}

	public String getJsonMemberPackage(){
		return jsonMemberPackage;
	}

	public void setImports(List<ImportsItem> imports){
		this.imports = imports;
	}

	public List<ImportsItem> getImports(){
		return imports;
	}

	public void setContextPath(String contextPath){
		this.contextPath = contextPath;
	}

	public String getContextPath(){
		return contextPath;
	}

	public void setAppDescription(String appDescription){
		this.appDescription = appDescription;
	}

	public String getAppDescription(){
		return appDescription;
	}

	public void setLicenseName(String licenseName){
		this.licenseName = licenseName;
	}

	public String getLicenseName(){
		return licenseName;
	}

	public void setInterfaceNamePrefix(String interfaceNamePrefix){
		this.interfaceNamePrefix = interfaceNamePrefix;
	}

	public String getInterfaceNamePrefix(){
		return interfaceNamePrefix;
	}

	public void setVersion(String version){
		this.version = version;
	}

	public String getVersion(){
		return version;
	}

	public void setReleaseNote(String releaseNote){
		this.releaseNote = releaseNote;
	}

	public String getReleaseNote(){
		return releaseNote;
	}

	public void setLicense(License license){
		this.license = license;
	}

	public License getLicense(){
		return license;
	}

	public void setModelDocPath(String modelDocPath){
		this.modelDocPath = modelDocPath;
	}

	public String getModelDocPath(){
		return modelDocPath;
	}

	public void setEscapedInvokerPackage(String escapedInvokerPackage){
		this.escapedInvokerPackage = escapedInvokerPackage;
	}

	public String getEscapedInvokerPackage(){
		return escapedInvokerPackage;
	}

	public void setAbstractNameSuffix(String abstractNameSuffix){
		this.abstractNameSuffix = abstractNameSuffix;
	}

	public String getAbstractNameSuffix(){
		return abstractNameSuffix;
	}

	public void setSrcBasePath(String srcBasePath){
		this.srcBasePath = srcBasePath;
	}

	public String getSrcBasePath(){
		return srcBasePath;
	}

	public void setTestBasePath(String testBasePath){
		this.testBasePath = testBasePath;
	}

	public String getTestBasePath(){
		return testBasePath;
	}

	public void setImportPath(String importPath){
		this.importPath = importPath;
	}

	public String getImportPath(){
		return importPath;
	}

	public void setGeneratedYear(String generatedYear){
		this.generatedYear = generatedYear;
	}

	public String getGeneratedYear(){
		return generatedYear;
	}

	public void setModelPackage(String modelPackage){
		this.modelPackage = modelPackage;
	}

	public String getModelPackage(){
		return modelPackage;
	}

	public void setAbstractNamePrefix(String abstractNamePrefix){
		this.abstractNamePrefix = abstractNamePrefix;
	}

	public String getAbstractNamePrefix(){
		return abstractNamePrefix;
	}

	public void setGitHost(String gitHost){
		this.gitHost = gitHost;
	}

	public String getGitHost(){
		return gitHost;
	}

	public void setApiSrcPath(String apiSrcPath){
		this.apiSrcPath = apiSrcPath;
	}

	public String getApiSrcPath(){
		return apiSrcPath;
	}

	public void setApiTestPath(String apiTestPath){
		this.apiTestPath = apiTestPath;
	}

	public String getApiTestPath(){
		return apiTestPath;
	}

	public void setApiDocPath(String apiDocPath){
		this.apiDocPath = apiDocPath;
	}

	public String getApiDocPath(){
		return apiDocPath;
	}

	public void setLicenseInfo(String licenseInfo){
		this.licenseInfo = licenseInfo;
	}

	public String getLicenseInfo(){
		return licenseInfo;
	}

	public void setHasModel(boolean hasModel){
		this.hasModel = hasModel;
	}

	public boolean isHasModel(){
		return hasModel;
	}

	public void setGenerateApis(boolean generateApis){
		this.generateApis = generateApis;
	}

	public boolean isGenerateApis(){
		return generateApis;
	}

	public void setBasePathWithoutHost(String basePathWithoutHost){
		this.basePathWithoutHost = basePathWithoutHost;
	}

	public String getBasePathWithoutHost(){
		return basePathWithoutHost;
	}

	public void setPrimitives(String primitives){
		this.primitives = primitives;
	}

	public String getPrimitives(){
		return primitives;
	}

	public void setDeveloperOrganizationUrl(String developerOrganizationUrl){
		this.developerOrganizationUrl = developerOrganizationUrl;
	}

	public String getDeveloperOrganizationUrl(){
		return developerOrganizationUrl;
	}

	public void setOperations(Operations operations){
		this.operations = operations;
	}

	public Operations getOperations(){
		return operations;
	}

	public void setInterfaceNameSuffix(String interfaceNameSuffix){
		this.interfaceNameSuffix = interfaceNameSuffix;
	}

	public String getInterfaceNameSuffix(){
		return interfaceNameSuffix;
	}

	public void setPackageName(String packageName){
		this.packageName = packageName;
	}

	public String getPackageName(){
		return packageName;
	}

	public void setHideGenerationTimestamp(boolean hideGenerationTimestamp){
		this.hideGenerationTimestamp = hideGenerationTimestamp;
	}

	public boolean isHideGenerationTimestamp(){
		return hideGenerationTimestamp;
	}

	public void setModelTestPath(String modelTestPath){
		this.modelTestPath = modelTestPath;
	}

	public String getModelTestPath(){
		return modelTestPath;
	}

	public void setUnescapedAppDescription(String unescapedAppDescription){
		this.unescapedAppDescription = unescapedAppDescription;
	}

	public String getUnescapedAppDescription(){
		return unescapedAppDescription;
	}

	public void setAppName(String appName){
		this.appName = appName;
	}

	public String getAppName(){
		return appName;
	}

	public void setGenerateApiDocs(boolean generateApiDocs){
		this.generateApiDocs = generateApiDocs;
	}

	public boolean isGenerateApiDocs(){
		return generateApiDocs;
	}

	public void setGeneratorVersion(String generatorVersion){
		this.generatorVersion = generatorVersion;
	}

	public String getGeneratorVersion(){
		return generatorVersion;
	}

	public void setTraitNameSuffix(String traitNameSuffix){
		this.traitNameSuffix = traitNameSuffix;
	}

	public String getTraitNameSuffix(){
		return traitNameSuffix;
	}

	public void setApiPackage(String apiPackage){
		this.apiPackage = apiPackage;
	}

	public String getApiPackage(){
		return apiPackage;
	}

	public void setBasePath(String basePath){
		this.basePath = basePath;
	}

	public String getBasePath(){
		return basePath;
	}

	public void setClassname(String classname){
		this.classname = classname;
	}

	public String getClassname(){
		return classname;
	}

	public void setGitRepoId(String gitRepoId){
		this.gitRepoId = gitRepoId;
	}

	public String getGitRepoId(){
		return gitRepoId;
	}

	public void setGeneratedDate(String generatedDate){
		this.generatedDate = generatedDate;
	}

	public String getGeneratedDate(){
		return generatedDate;
	}

	public void setTraitNamePrefix(String traitNamePrefix){
		this.traitNamePrefix = traitNamePrefix;
	}

	public String getTraitNamePrefix(){
		return traitNamePrefix;
	}

	public void setAppDescriptionWithNewLines(String appDescriptionWithNewLines){
		this.appDescriptionWithNewLines = appDescriptionWithNewLines;
	}

	public String getAppDescriptionWithNewLines(){
		return appDescriptionWithNewLines;
	}

	public void setGitUserId(String gitUserId){
		this.gitUserId = gitUserId;
	}

	public String getGitUserId(){
		return gitUserId;
	}


	List<Item2> items() {
		return Arrays.asList(
				new Item2("Item 1", "$19.99", Arrays.asList(new Feature("New!"), new Feature("Awesome!"))),
				new Item2("Item 2", "$29.99", Arrays.asList(new Feature("Old."), new Feature("Ugly."))),
				new Item2("Item 3", "$39.99", Arrays.asList(new Feature("Old."), new Feature("Ugly.")))
		);
	}
	static class Item2 {
		Item2(String name, String price, List<Feature> features) {
			this.name = name;
			this.price = price;
			this.features = features;
		}

		String name, price;
		List<Feature> features;
	}

	static class Feature {
		Feature(String description) {
			this.description = description;
		}

		String description;
	}

}