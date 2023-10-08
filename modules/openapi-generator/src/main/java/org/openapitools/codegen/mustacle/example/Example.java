package org.openapitools.codegen.mustacle.example;

import com.alibaba.fastjson2.JSON;
import com.github.mustachejava.DefaultMustacheFactory;
import com.github.mustachejava.Mustache;
import com.github.mustachejava.MustacheFactory;
import org.openapitools.codegen.mustacle.example.pojo.Response;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
public class Example {
    List<Item> items() {
        return Arrays.asList(
                new Item("Item 1", "$19.99", Arrays.asList(new Feature("New!"), new Feature("Awesome!"))),
                new Item("Item 2", "$29.99", Arrays.asList(new Feature("Old."), new Feature("Ugly."))),
                new Item("Item 3", "$39.99", Arrays.asList(new Feature("Old."), new Feature("Ugly.")))
        );
    }

    /**
     * 与items()方法等价, 这样构造itmes2的对象，然后填充结构的数据内容的结构
     * @return
     */
    List<Item> items2() {
        return  Arrays.asList(
                new Item("Item 1", "$19.99", Arrays.asList(new Feature("New!"), new Feature("Awesome!"))),
                new Item("Item 2", "$29.99", Arrays.asList(new Feature("Old."), new Feature("Ugly."))),
                new Item("Item 3", "$39.99", Arrays.asList(new Feature("Old."), new Feature("Ugly.")))
        );
    }





    static class Item {
        Item(String name, String price, List<Feature> features) {
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
    public static String convertFileToString(String filePath) throws IOException {
        Path path = Path.of(filePath);
        return Files.readString(path);
    }

    public static void main(String[] args) throws IOException {
        MustacheFactory mf = new DefaultMustacheFactory();
        Mustache mustache = mf.compile("D:/02Project/openapi-generator-sp/modules/openapi-generator/src/main/java/org/openapitools/codegen/mustacle/example/template.mustache");

        String filePath = "D:/02Project/openapi-generator-sp/modules/openapi-generator/src/main/php.api.mustache.json";
        String fileContent = convertFileToString(filePath);
        String replaceContent = fileContent.replace("$ref", "ref");
        Response response = JSON.parseObject(replaceContent, Response.class);
//        FileInputStream fileInputStream = new FileInputStream("D:/02Project/openapi-generator-sp/modules/openapi-generator/src/main/php.api.mustache.json");
//
//        // 加载json的文件转换成Response对象
//        Response response = JSON.parseObject(new FileInputStream("D:/02Project/openapi-generator-sp/modules/openapi-generator/src/main/php.api.mustache.json"), Response.class);

        mustache.execute(new PrintWriter(System.out), response).flush();
    }
}
