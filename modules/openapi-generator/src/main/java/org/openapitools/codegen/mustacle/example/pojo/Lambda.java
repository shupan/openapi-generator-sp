package org.openapitools.codegen.mustacle.example.pojo;

import com.alibaba.fastjson2.annotation.JSONField;

public class Lambda{

	@JSONField(name="uppercase")
	private Uppercase uppercase;

	@JSONField(name="forwardslash")
	private Forwardslash forwardslash;

	@JSONField(name="lowercase")
	private Lowercase lowercase;

	@JSONField(name="camelcase")
	private Camelcase camelcase;

	@JSONField(name="titlecase")
	private Titlecase titlecase;

	@JSONField(name="indented_16")
	private Indented16 indented16;

	@JSONField(name="pascalcase")
	private Pascalcase pascalcase;

	@JSONField(name="doublequote")
	private Doublequote doublequote;

	@JSONField(name="indented")
	private Indented indented;

	@JSONField(name="backslash")
	private Backslash backslash;

	@JSONField(name="indented_8")
	private Indented8 indented8;

	@JSONField(name="indented_12")
	private Indented12 indented12;

	@JSONField(name="snakecase")
	private Snakecase snakecase;

	public void setUppercase(Uppercase uppercase){
		this.uppercase = uppercase;
	}

	public Uppercase getUppercase(){
		return uppercase;
	}

	public void setForwardslash(Forwardslash forwardslash){
		this.forwardslash = forwardslash;
	}

	public Forwardslash getForwardslash(){
		return forwardslash;
	}

	public void setLowercase(Lowercase lowercase){
		this.lowercase = lowercase;
	}

	public Lowercase getLowercase(){
		return lowercase;
	}

	public void setCamelcase(Camelcase camelcase){
		this.camelcase = camelcase;
	}

	public Camelcase getCamelcase(){
		return camelcase;
	}

	public void setTitlecase(Titlecase titlecase){
		this.titlecase = titlecase;
	}

	public Titlecase getTitlecase(){
		return titlecase;
	}

	public void setIndented16(Indented16 indented16){
		this.indented16 = indented16;
	}

	public Indented16 getIndented16(){
		return indented16;
	}

	public void setPascalcase(Pascalcase pascalcase){
		this.pascalcase = pascalcase;
	}

	public Pascalcase getPascalcase(){
		return pascalcase;
	}

	public void setDoublequote(Doublequote doublequote){
		this.doublequote = doublequote;
	}

	public Doublequote getDoublequote(){
		return doublequote;
	}

	public void setIndented(Indented indented){
		this.indented = indented;
	}

	public Indented getIndented(){
		return indented;
	}

	public void setBackslash(Backslash backslash){
		this.backslash = backslash;
	}

	public Backslash getBackslash(){
		return backslash;
	}

	public void setIndented8(Indented8 indented8){
		this.indented8 = indented8;
	}

	public Indented8 getIndented8(){
		return indented8;
	}

	public void setIndented12(Indented12 indented12){
		this.indented12 = indented12;
	}

	public Indented12 getIndented12(){
		return indented12;
	}

	public void setSnakecase(Snakecase snakecase){
		this.snakecase = snakecase;
	}

	public Snakecase getSnakecase(){
		return snakecase;
	}
}