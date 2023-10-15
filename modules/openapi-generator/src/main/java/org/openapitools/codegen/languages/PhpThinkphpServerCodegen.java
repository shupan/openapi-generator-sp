/*
 * Copyright 2018 OpenAPI-Generator Contributors (https://openapi-generator.tech)
 * Copyright 2018 SmartBear Software
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openapitools.codegen.languages;

import io.swagger.v3.oas.models.media.Schema;
import org.openapitools.codegen.*;
import org.openapitools.codegen.meta.features.*;
import org.openapitools.codegen.model.ModelMap;
import org.openapitools.codegen.model.OperationMap;
import org.openapitools.codegen.model.OperationsMap;
import org.openapitools.codegen.utils.ModelUtils;
import org.openapitools.codegen.utils.StringUtils;

import java.io.File;
import java.util.*;

import static org.openapitools.codegen.utils.StringUtils.camelize;

/**
 * 正对于thinkphp框架的代码生成器
 */
public class PhpThinkphpServerCodegen extends AbstractPhpCodegen {
    protected String apiVersion = "1.0.0";

    /**
     * Configures the type of generator.
     *
     * @return the CodegenType for this generator
     * @see CodegenType
     */
    public CodegenType getTag() {
        return CodegenType.SERVER;
    }

    /**
     * Configures a friendly name for the generator.  This will be used by the generator
     * to select the library with the -g flag.
     *
     * @return the friendly name for the generator
     */
    public String getName() {
        return "php-thinkphp";
    }

    /**
     * Returns human-friendly help for the generator.  Provide the consumer with help
     * tips, parameters here
     *
     * @return A string value for the help message
     */
    public String getHelp() {
        return "Generates a PHP laravel server library.";
    }

    /**
     * Class constructor
     */
    public PhpThinkphpServerCodegen() {
        super();

        modifyFeatureSet(features -> features
                .includeDocumentationFeatures(DocumentationFeature.Readme)
                .wireFormatFeatures(EnumSet.of(WireFormatFeature.JSON, WireFormatFeature.XML))
                .securityFeatures(EnumSet.noneOf(SecurityFeature.class))
                .excludeGlobalFeatures(
                        GlobalFeature.XMLStructureDefinitions,
                        GlobalFeature.Callbacks,
                        GlobalFeature.LinkObjects,
                        GlobalFeature.ParameterStyling
                )
                .excludeSchemaSupportFeatures(
                        SchemaSupportFeature.Polymorphism
                )
        );

        embeddedTemplateDir = templateDir = "php-thinkphp";
        variableNamingConvention = "camelCase";

        /*
         * packPath
         */
        invokerPackage = "php-thinkphp";
        outputFolder = srcBasePath;

        /*
         * Api Package.  Optional, if needed, this can be used in templates
         */
        apiPackage = "app.Http.Controllers";

        /*
         * Model Package.  Optional, if needed, this can be used in templates
         */
        modelPackage = "app\\Http\\DTO";

        // template files want to be ignored
        apiTestTemplateFiles.clear();
        apiDocTemplateFiles.clear();
        modelDocTemplateFiles.clear();

        /*
         * Additional Properties.  These values can be passed to the templates and
         * are available in models, apis, and supporting files
         */
        additionalProperties.put("apiVersion", apiVersion);


        /*
         * Supporting Files.  You can write single files for the generator with the
         * entire object tree available.  If the input file has a suffix of `.mustache
         * it will be processed by the template engine.  Otherwise, it will be copied
         *
         * 把需要支持的文件添加到容器里面下
         * */
        appendSupportingFiles();
//        supportingFiles.add(new SupportingFile("composer.mustache", outputFolder, "composer.json"));
//        supportingFiles.add(new SupportingFile("README.md", outputFolder, "README.md"));
//        supportingFiles.add(new SupportingFile("artisan", outputFolder, "artisan"));
//        supportingFiles.add(new SupportingFile("package.json", outputFolder, "package.json"));
//        supportingFiles.add(new SupportingFile("phpunit.xml", outputFolder, "phpunit.xml"));
//        supportingFiles.add(new SupportingFile("webpack.mix.js", outputFolder, "webpack.mix.js"));
//        supportingFiles.add(new SupportingFile("editorconfig", outputFolder, ".editorconfig"));
//        supportingFiles.add(new SupportingFile("env.example", outputFolder, ".env.example"));
//        supportingFiles.add(new SupportingFile("gitattributes", outputFolder, ".gitattributes"));
//        supportingFiles.add(new SupportingFile("styleci.yml", outputFolder, ".styleci.yml"));
//        supportingFiles.add(new SupportingFile("server.php", outputFolder, "server.php"));
//        supportingFiles.add(new SupportingFile("gitignore", outputFolder, ".gitignore"));

//        supportingFiles.add(new SupportingFile("bootstrap/cache/gitignore", outputFolder + File.separator + "bootstrap" + File.separator + "cache", ".gitignore"));
//        supportingFiles.add(new SupportingFile("bootstrap/app.php", outputFolder + File.separator + "bootstrap", "app.php"));
//
//        /* /public/ */
//        supportingFiles.add(new SupportingFile("public/.htaccess", outputFolder + File.separator + "public", ".htaccess"));
//        supportingFiles.add(new SupportingFile("public/favicon.ico", outputFolder + File.separator + "public", "favicon.ico"));
//        supportingFiles.add(new SupportingFile("public/index.php", outputFolder + File.separator + "public", "index.php"));
//        supportingFiles.add(new SupportingFile("public/robots.txt", outputFolder + File.separator + "public", "robots.txt"));
//        supportingFiles.add(new SupportingFile("public/web.config", outputFolder + File.separator + "public", "web.config"));
//
//        /* /routes/ */
//        supportingFiles.add(new SupportingFile("routes/api.mustache", outputFolder + File.separator + "routes", "api.php"));
//        supportingFiles.add(new SupportingFile("routes/web.mustache", outputFolder + File.separator + "routes", "web.php"));
//        supportingFiles.add(new SupportingFile("routes/channels.mustache", outputFolder + File.separator + "routes", "channels.php"));
//        supportingFiles.add(new SupportingFile("routes/console.mustache", outputFolder + File.separator + "routes", "console.php"));

        /* /app/Http/Controllers/ */
        //supportingFiles.add(new SupportingFile("app/Http/Kernel.php", outputFolder + File.separator + "app" + File.separator + "Http", "Kernel.php"));
        //supportingFiles.add(new SupportingFile("app/Http/Controllers/Controller.php", outputFolder + File.separator + "app" + File.separator + "Http" + File.separator + "Controllers", "Controller.php"));
//        supportingFiles.add(new SupportingFile("app/Http/Middleware/Authenticate.php", outputFolder + File.separator + "app" + File.separator + "Http" + File.separator + "Middleware", "Authenticate.php"));
//        supportingFiles.add(new SupportingFile("app/Http/Middleware/CheckForMaintenanceMode.php", outputFolder + File.separator + "app" + File.separator + "Http" + File.separator + "Middleware", "CheckForMaintenanceMode.php"));
//        supportingFiles.add(new SupportingFile("app/Http/Middleware/EncryptCookies.php", outputFolder + File.separator + "app" + File.separator + "Http" + File.separator + "Middleware", "EncryptCookies.php"));
//        supportingFiles.add(new SupportingFile("app/Http/Middleware/RedirectIfAuthenticated.php", outputFolder + File.separator + "app" + File.separator + "Http" + File.separator + "Middleware", "RedirectIfAuthenticated.php"));
//        supportingFiles.add(new SupportingFile("app/Http/Middleware/TrimStrings.php", outputFolder + File.separator + "app" + File.separator + "Http" + File.separator + "Middleware", "TrimStrings.php"));
//        supportingFiles.add(new SupportingFile("app/Http/Middleware/TrustProxies.php", outputFolder + File.separator + "app" + File.separator + "Http" + File.separator + "Middleware", "TrustProxies.php"));
//        supportingFiles.add(new SupportingFile("app/Http/Middleware/VerifyCsrfToken.php", outputFolder + File.separator + "app" + File.separator + "Http" + File.separator + "Middleware", "VerifyCsrfToken.php"));

        // /app/Console
        //supportingFiles.add(new SupportingFile("app/Console/Kernel.php", outputFolder + File.separator + "app" + File.separator + "Console", "Kernel.php"));
        // /app/Exceptions
        //supportingFiles.add(new SupportingFile("app/Exceptions/Handler.php", outputFolder + File.separator + "app" + File.separator + "Exceptions", "Handler.php"));
//        // /app/Providers
//        supportingFiles.add(new SupportingFile("app/Providers/AppServiceProvider.php", outputFolder + File.separator + "app" + File.separator + "Providers", "AppServiceProvider.php"));
//        supportingFiles.add(new SupportingFile("app/Providers/AuthServiceProvider.php", outputFolder + File.separator + "app" + File.separator + "Providers", "AuthServiceProvider.php"));
//        supportingFiles.add(new SupportingFile("app/Providers/BroadcastServiceProvider.php", outputFolder + File.separator + "app" + File.separator + "Providers", "BroadcastServiceProvider.php"));
//        supportingFiles.add(new SupportingFile("app/Providers/EventServiceProvider.php", outputFolder + File.separator + "app" + File.separator + "Providers", "EventServiceProvider.php"));
//        supportingFiles.add(new SupportingFile("app/Providers/RouteServiceProvider.php", outputFolder + File.separator + "app" + File.separator + "Providers", "RouteServiceProvider.php"));
        // /app/
        //supportingFiles.add(new SupportingFile("app/User.php", outputFolder + File.separator + "app", "RouteServiceProvider.php"));

//        // /database/
//        supportingFiles.add(new SupportingFile("database/factories/UserFactory.php", outputFolder + File.separator + "database" + File.separator + "factories", "UserFactory.php"));
//        supportingFiles.add(new SupportingFile("database/migrations/2014_10_12_000000_create_users_table.php", outputFolder + File.separator + "database" + File.separator + "migrations", "2014_10_12_000000_create_users_table.php"));
//        supportingFiles.add(new SupportingFile("database/migrations/2019_08_19_000000_create_failed_jobs_table.php", outputFolder + File.separator + "database" + File.separator + "migrations", "2019_08_19_000000_create_failed_jobs_table.php"));
//        supportingFiles.add(new SupportingFile("database/seeds/DatabaseSeeder.php", outputFolder + File.separator + "database" + File.separator + "seeds", "DatabaseSeeder.php"));
//        supportingFiles.add(new SupportingFile("database/gitignore", outputFolder + File.separator + "database", ".gitignore"));
//
//        // /config/
//        supportingFiles.add(new SupportingFile("config/app.php", outputFolder + File.separator + "config", "app.php"));
//        supportingFiles.add(new SupportingFile("config/auth.php", outputFolder + File.separator + "config", "auth.php"));
//        supportingFiles.add(new SupportingFile("config/broadcasting.php", outputFolder + File.separator + "config", "broadcasting.php"));
//        supportingFiles.add(new SupportingFile("config/cache.php", outputFolder + File.separator + "config", "cache.php"));
//        supportingFiles.add(new SupportingFile("config/cors.php", outputFolder + File.separator + "config", "cors.php"));
//        supportingFiles.add(new SupportingFile("config/database.php", outputFolder + File.separator + "config", "database.php"));
//        supportingFiles.add(new SupportingFile("config/filesystems.php", outputFolder + File.separator + "config", "filesystems.php"));
//        supportingFiles.add(new SupportingFile("config/hashing.php", outputFolder + File.separator + "config", "hashing.php"));
//        supportingFiles.add(new SupportingFile("config/logging.php", outputFolder + File.separator + "config", "logging.php"));
//        supportingFiles.add(new SupportingFile("config/mail.php", outputFolder + File.separator + "config", "mail.php"));
//        supportingFiles.add(new SupportingFile("config/queue.php", outputFolder + File.separator + "config", "queue.php"));
//        supportingFiles.add(new SupportingFile("config/services.php", outputFolder + File.separator + "config", "services.php"));
//        supportingFiles.add(new SupportingFile("config/session.php", outputFolder + File.separator + "config", "session.php"));
//        supportingFiles.add(new SupportingFile("config/view.php", outputFolder + File.separator + "config", "view.php"));
//
//        // /database/
//        supportingFiles.add(new SupportingFile("database/migrations/2019_08_19_000000_create_failed_jobs_table.php", outputFolder + File.separator + "database" + File.separator + "migrations", "2019_08_19_000000_create_failed_jobs_table.php"));
//
//        // /resources/
//        supportingFiles.add(new SupportingFile("resources/js/app.js", outputFolder + File.separator + "resources" + File.separator + "assets" + File.separator + "js", "app.js"));
//        supportingFiles.add(new SupportingFile("resources/js/bootstrap.js", outputFolder + File.separator + "resources" + File.separator + "assets" + File.separator + "js", "bootstrap.js"));
//        supportingFiles.add(new SupportingFile("resources/sass/app.scss", outputFolder + File.separator + "resources" + File.separator + "assets" + File.separator + "sass", "app.scss"));
//        supportingFiles.add(new SupportingFile("resources/lang/en/auth.php", outputFolder + File.separator + "resources" + File.separator + "lang" + File.separator + "en", "auth.php"));
//        supportingFiles.add(new SupportingFile("resources/lang/en/pagination.php", outputFolder + File.separator + "resources" + File.separator + "lang" + File.separator + "en", "pagination.php"));
//        supportingFiles.add(new SupportingFile("resources/lang/en/passwords.php", outputFolder + File.separator + "resources" + File.separator + "lang" + File.separator + "en", "passwords.php"));
//        supportingFiles.add(new SupportingFile("resources/lang/en/validation.php", outputFolder + File.separator + "resources" + File.separator + "lang" + File.separator + "en", "validation.php"));
//        supportingFiles.add(new SupportingFile("resources/views/welcome.blade.php", outputFolder + File.separator + "resources" + File.separator + "views", "welcome.blade.php"));
//
//        // /storage/
//        supportingFiles.add(new SupportingFile("storage/app/gitignore", outputFolder + File.separator + "storage" + File.separator + "app", ".gitignore"));
//        supportingFiles.add(new SupportingFile("storage/app/public/gitignore", outputFolder + File.separator + "storage" + File.separator + "app" + File.separator + "public", ".gitignore"));
//        supportingFiles.add(new SupportingFile("storage/framework/gitignore", outputFolder + File.separator + "storage" + File.separator + "framework", ".gitignore"));
//        supportingFiles.add(new SupportingFile("storage/framework/cache/gitignore", outputFolder + File.separator + "storage" + File.separator + "framework" + File.separator + "cache", ".gitignore"));
//        supportingFiles.add(new SupportingFile("storage/framework/cache/data/gitignore", outputFolder + File.separator + "storage" + File.separator + "framework" + File.separator + "cache", ".gitignore"));
//        supportingFiles.add(new SupportingFile("storage/framework/sessions/gitignore", outputFolder + File.separator + "storage" + File.separator + "framework" + File.separator + "sessions", ".gitignore"));
//        supportingFiles.add(new SupportingFile("storage/framework/testing/gitignore", outputFolder + File.separator + "storage" + File.separator + "framework" + File.separator + "testing", ".gitignore"));
//        supportingFiles.add(new SupportingFile("storage/framework/views/gitignore", outputFolder + File.separator + "storage" + File.separator + "framework" + File.separator + "views", ".gitignore"));
//        supportingFiles.add(new SupportingFile("storage/logs/gitignore", outputFolder + File.separator + "storage" + File.separator + "logs", ".gitignore"));
//
//        // /tests/
//        supportingFiles.add(new SupportingFile("tests/Feature/ExampleTest.php", outputFolder + File.separator + "tests" + File.separator + "Feature", "ExampleTest.php"));
//        supportingFiles.add(new SupportingFile("tests/Unit/ExampleTest.php", outputFolder + File.separator + "tests" + File.separator + "Unit", "ExampleTest.php"));
//        supportingFiles.add(new SupportingFile("tests/CreatesApplication.php", outputFolder + File.separator + "tests", "CreatesApplication.php"));
//        supportingFiles.add(new SupportingFile("tests/TestCase.php", outputFolder + File.separator + "tests", "TestCase.php"));
    }

    /**
     * ├── Component
     * │   ├── Converter
     * │   │   └── DepartmentESConverter.php
     * │   ├── InspireCommand.php
     * │   ├── InspireES.php
     * │   ├── InspireKafka.php
     * │   ├── InspireRedis.php
     * │   ├── InspireSwoole.php
     * │   └── Validator
     * │       └── DepartmentESValidator.php
     * ├── Config
     * │   └── config.php
     * ├── Domain
     * │   ├── DTO
     * │   │   ├── DepartmentCreateRequest.php
     * │   │   ├── DepartmentCreateResponse.php
     * │   │   ├── DepartmentGetRequest.php
     * │   │   ├── DepartmentGetResponse.php
     * │   │   └── DepartmentUpdateResponse.php
     * │   ├── Enum
     * │   │   └── DepartmentEnum.php
     * │   └── Fields
     * │       └── DepartmentInfoFields.php
     * ├── Exceptions
     * │   ├── DepartmentException.php
     * │   ├── DepartmentTransformException.php
     * │   └── DepartmentValidatorException.php
     * ├── External
     * │   ├── Attendance
     * │   │   ├── CompleteRequestApi.php
     * │   │   └── CompleteResponseApi.php
     * │   └── AttendanceExternal.php
     * ├── Http
     * │   ├── Controllers
     * │   │   └── DepartmentController.php
     * │   └── routes.php
     * ├── Model
     * │   └── DepartmentModel.php
     * ├── Services
     * │   ├── Converter
     * │   │   └── DepartmentConverter.php
     * │   ├── DepartmentService.php
     * │   └── Validator
     * │       └── DepartmentValidator.php
     * ├── Tests
     * │   ├── Component
     * │   ├── Helpers
     * │   ├── Model
     * │   │   └── DepartmentModelTest.php
     * │   ├── Services
     * │   │   └── DepartmentServiceTest.php
     * │   └── Utils
     * ├── Utils
     * │   └── DepartmentTreeUtils.php
     * ├── api.mustache
     * ├── department.sql
     * ├── model.mustache
     * ├── model_enum.mustache
     * └── model_generic.mustache
     */
    public void appendSupportingFiles(){

        // 根据注释的路径填充support的文件
        supportingFiles.add(new SupportingFile("Component/Converter/DepartmentESConverter.php",
                outputFolder + File.separator + "Component" + File.separator + "Converter" + File.separator, "DepartmentESConverter.php"));
        supportingFiles.add(new SupportingFile("Component/Validator/DepartmentESValidator.php",
                outputFolder + File.separator + "Component" + File.separator + "Validator" + File.separator, "DepartmentESValidator.php"));
        supportingFiles.add(new SupportingFile("Config/config.php",
                outputFolder + File.separator + "Config" + File.separator, "config.php"));
        supportingFiles.add(new SupportingFile("Domain/DTO/DepartmentCreateRequest.php",
                outputFolder + File.separator + "Domain" + File.separator + "DTO" + File.separator, "DepartmentCreateRequest.php"));
        supportingFiles.add(new SupportingFile("Domain/DTO/DepartmentCreateResponse.php",
                outputFolder + File.separator + "Domain" + File.separator + "DTO" + File.separator, "DepartmentCreateResponse.php"));
        supportingFiles.add(new SupportingFile("Domain/DTO/DepartmentGetRequest.php",
                outputFolder + File.separator + "Domain" + File.separator + "DTO" + File.separator, "DepartmentGetRequest.php"));
        supportingFiles.add(new SupportingFile("Domain/DTO/DepartmentGetResponse.php",
                outputFolder + File.separator + "Domain" + File.separator + "DTO" + File.separator, "DepartmentGetResponse.php"));
        supportingFiles.add(new SupportingFile("Domain/DTO/DepartmentUpdateResponse.php",
                outputFolder + File.separator + "Domain" + File.separator + "DTO" + File.separator, "DepartmentUpdateResponse.php"));
        supportingFiles.add(new SupportingFile("Domain/Enum/DepartmentEnum.php",
                outputFolder + File.separator + "Domain" + File.separator + "Enum" + File.separator, "DepartmentEnum.php"));
        supportingFiles.add(new SupportingFile("Domain/Fields/DepartmentInfoFields.php",
                outputFolder + File.separator + "Domain" + File.separator + "Fields" + File.separator, "DepartmentInfoFields.php"));
        supportingFiles.add(new SupportingFile("Exceptions/DepartmentException.php",
                outputFolder + File.separator + "Exceptions" + File.separator, "DepartmentException.php"));
        supportingFiles.add(new SupportingFile("Exceptions/DepartmentValidatorException.php",
                outputFolder + File.separator + "Exceptions" + File.separator, "DepartmentValidatorException.php"));
        supportingFiles.add(new SupportingFile("External/Attendance/CompleteRequestApi.php",
                outputFolder + File.separator + "External" + File.separator + "Attendance" + File.separator, "CompleteRequestApi.php"));
        supportingFiles.add(new SupportingFile("External/Attendance/CompleteResponseApi.php",
                outputFolder + File.separator + "External" + File.separator + "Attendance" + File.separator, "CompleteResponseApi.php"));
        supportingFiles.add(new SupportingFile("External/AttendanceExternal.php",
                outputFolder + File.separator + "External" + File.separator, "AttendanceExternal.php"));
        supportingFiles.add(new SupportingFile("Http/Controllers/DepartmentController.php",
                outputFolder + File.separator + "Http" + File.separator + "Controllers" + File.separator, "DepartmentController.php"));
        supportingFiles.add(new SupportingFile("Http/routes.php",
                outputFolder + File.separator + "Http" + File.separator, "routes.php"));
        supportingFiles.add(new SupportingFile("Model/DepartmentModel.php",
                outputFolder + File.separator + "Model" + File.separator, "DepartmentModel.php"));
        supportingFiles.add(new SupportingFile("Services/Converter/DepartmentConverter.php",
                outputFolder + File.separator + "Services" + File.separator + "Converter" + File.separator, "DepartmentConverter.php"));
        supportingFiles.add(new SupportingFile("Services/DepartmentService.php",
                outputFolder + File.separator + "Services" + File.separator, "DepartmentService.php"));
        supportingFiles.add(new SupportingFile("Services/Validator/DepartmentValidator.php",
                outputFolder + File.separator + "Services" + File.separator + "Validator" + File.separator, "DepartmentValidator.php"));
//        supportingFiles.add(new SupportingFile("Tests/Helpers/DepartmentHelper.php",
//                outputFolder + File.separator + "Tests" + File.separator + "Helpers" + File.separator, "DepartmentHelper.php"));
        supportingFiles.add(new SupportingFile("Tests/Model/DepartmentModelTest.php",
                outputFolder + File.separator + "Tests" + File.separator + "Model" + File.separator, "DepartmentModelTest.php"));
        supportingFiles.add(new SupportingFile("Tests/Services/DepartmentServiceTest.php",
                outputFolder + File.separator + "Tests" + File.separator + "Services" + File.separator, "DepartmentServiceTest.php"));
//        supportingFiles.add(new SupportingFile("Tests/Services/Validator/DepartmentValidatorTest.php",
//                outputFolder + File.separator + "Tests" + File.separator + "Services" + File.separator + "Validator" + File.separator, "DepartmentValidatorTest.php"));
        supportingFiles.add(new SupportingFile("Utils/DepartmentTreeUtils.php",
                outputFolder + File.separator + "Utils" + File.separator, "DepartmentTreeUtils.php"));

    }

    @Override
    public void processOpts() {
        super.processOpts();
//        this.setModelPackage("DTO");
        // remove gitignore supporting file from AbstractPhpCodegen
        supportingFiles.remove(supportingFiles.size() - 1);
    }

    // override with any special post-processing
    @Override
    public OperationsMap postProcessOperationsWithModels(OperationsMap objs, List<ModelMap> allModels) {
        OperationMap objectMap = objs.getOperations();
        List<CodegenOperation> operations = objectMap.getOperation();

        for (CodegenOperation op : operations) {
            op.httpMethod = op.httpMethod.toLowerCase(Locale.ROOT);
            // check to see if the path contains ".", which is not supported by PHP laravel
            // ref: https://github.com/swagger-api/swagger-codegen/issues/6897
            // @sp 对于path 路径的修改， 把包含的"." 替换成 "/"
            op.path = op.path.replaceAll("\\.", "/");
            if (op.path != null && op.path.contains(".")) {
                throw new IllegalArgumentException("'.' (dot) is not supported by PHP laravel. Please refer to https://github.com/swagger-api/swagger-codegen/issues/6897 for more info.");
            }

            if (op.hasProduces) {
                // need to escape */* values because they breaks current mustaches
                List<Map<String, String>> c = op.produces;
                for (Map<String, String> mediaType : c) {
                    if ("*/*".equals(mediaType.get("mediaType"))) {
                        mediaType.put("mediaType", "*_/_*");
                    }
                }
            }
        }

        // sort the endpoints in ascending to avoid the route priority issue.
        // https://github.com/swagger-api/swagger-codegen/issues/2643
        operations.sort(Comparator.comparing(lhs -> lhs.path));

        return objs;
    }

    @Override
    public String toApiName(String name) {
        if (name.isEmpty()) {
            return "DefaultController";
        }

        return camelize(name) + "Controller";
    }

    protected String controllerFileFolder() {
        return (outputFolder + File.separator + srcBasePath + File.separator + "app" + File.separator + "Http" + File.separator + "Controllers");
    }

    @Override
    public String apiFilename(String templateName, String tag) {
        String suffix = apiTemplateFiles().get(templateName);
        if (templateName.equals("api.mustache")) {
            return controllerFileFolder() + '/' + toControllerName(tag) + suffix;
        }

        return apiFileFolder() + '/' + toApiFilename(tag) + suffix;
    }

    protected String toControllerName(String name) {
        if (name.isEmpty()) {
            return "DefaultController";
        }

        return camelize(name) + "Controller";
    }

    @Override
    protected String getEnumDefaultValue(String defaultValue, String dataType) {
        return defaultValue;
    }

    @Override
    public CodegenProperty fromProperty(String name, Schema p, boolean required) {
        CodegenProperty property = super.fromProperty(name, p, required);
        Schema referencedSchema = ModelUtils.getReferencedSchema(this.openAPI, p);

        //Referenced enum case:
        if (!property.isEnum && referencedSchema.getEnum() != null && !referencedSchema.getEnum().isEmpty()) {
            property.dataType = this.getSchemaType(referencedSchema);
            property.defaultValue = this.toDefaultValue(referencedSchema);
            List<Object> _enum = referencedSchema.getEnum();

            Map<String, Object> allowableValues = new HashMap<>();
            allowableValues.put("values", _enum);
            if (allowableValues.size() > 0) {
                property.allowableValues = allowableValues;
            }
        }

        return property;
    }

    @Override
    public String toDefaultValue(Schema p) {
        if (ModelUtils.isBooleanSchema(p)) {
            if (p.getDefault() != null) {
                return p.getDefault().toString();
            } else if (!Boolean.TRUE.equals(p.getNullable())) {
                return "false";
            }
        } else if (ModelUtils.isDateSchema(p)) {
            // TODO
        } else if (ModelUtils.isDateTimeSchema(p)) {
            // TODO
        } else if (ModelUtils.isFileSchema(p)) {
            // TODO
        } else if (ModelUtils.isNumberSchema(p)) {
            if (p.getDefault() != null) {
                return p.getDefault().toString();
            } else if (!Boolean.TRUE.equals(p.getNullable())) {
                return "0";
            }
        } else if (ModelUtils.isIntegerSchema(p)) {
            if (p.getDefault() != null) {
                return p.getDefault().toString();
            } else if (!Boolean.TRUE.equals(p.getNullable())) {
                return "0";
            }
        } else if (ModelUtils.isStringSchema(p)) {
            if (p.getDefault() != null) {
                return "'" + p.getDefault() + "'";
            } else if (!Boolean.TRUE.equals(p.getNullable())) {
                return "\"\"";
            }
        } else if (ModelUtils.isArraySchema(p)) {
            if (p.getDefault() != null) {
                return p.getDefault().toString();
            } else if (!Boolean.TRUE.equals(p.getNullable())) {
                return "[]";
            }
        }

        return null;
    }

    @Override
    public String toEnumDefaultValue(String value, String datatype) {
        return datatype + "::" + value;
    }

    @Override
    public String toEnumVarName(String value, String datatype) {
        if (value.length() == 0) {
            return super.toEnumVarName(value, datatype);
        }

        // number
        if ("int".equals(datatype) || "float".equals(datatype)) {
            String varName = "NUMBER_" + value;
            varName = varName.replaceAll("-", "MINUS_");
            varName = varName.replaceAll("\\+", "PLUS_");
            varName = varName.replaceAll("\\.", "_DOT_");
            return varName;
        }

        return super.toEnumVarName(value, datatype);
    }
}
