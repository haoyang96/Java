package com.movie.score.model;

import java.sql.Date;

/**
 * 
 * @author 杨浩
 * 
 * @version 1.0
 *
 */
public class MovieModel {
	/*
	 * 快捷键总结:
	 */
	// 1.ctrl+m放大放小面板
	// 2.ctrl+d删除本行
	// 3.ctrl+shift+f自动排版
	// 4.alt+光标上下移动任何一行及多行
	// 5.alt+shift+s源里边可以选择一些重写或者set和get方法
	// 6.ctrl+shift+o自动导入包
	// 7.alt+shift+l选中一行,自动声明引用

	/**
	 * 数据库标号
	 */
	private int movie_id;
	/**
	 * 电影名称
	 */
	private String movie_name;
	/**
	 * 导演
	 */
	private String director;
	/**
	 * 主演
	 */
	private String actor;
	/**
	 * 语言类型
	 */
	private String type_language;
	/**
	 * 电影类型
	 */
	private String type_movie;
	/**
	 * 地区
	 */
	private String district;
	/**
	 * 录入时间
	 */
	private Date entry_time;
	/**
	 * 上映年代
	 */
	private String years;
	/**
	 * 关键词
	 */
	private String keyword;
	/**
	 * 电影来源
	 */
	private String movie_source;
	/**
	 * 电影评分
	 */
	private String rating;

	/**
	 * 空构造函数
	 * 
	 */
	public MovieModel() {
		super();
	}

	public MovieModel(int movie_id, String movie_name, String director, String actor, String type_language,
			String type_movie, String district, Date entry_time, String years, String keyword, String movie_source,
			String rating) {
		super();
		this.movie_id = movie_id;
		this.movie_name = movie_name;
		this.director = director;
		this.actor = actor;
		this.type_language = type_language;
		this.type_movie = type_movie;
		this.district = district;
		this.entry_time = entry_time;
		this.years = years;
		this.keyword = keyword;
		this.movie_source = movie_source;
		this.rating = rating;
	}

	public MovieModel(String movie_name, String director, String actor, String type_language, String type_movie,
			String district, String years, String keyword, String movie_source, String rating) {
		super();
		this.movie_name = movie_name;
		this.director = director;
		this.actor = actor;
		this.type_language = type_language;
		this.type_movie = type_movie;
		this.district = district;
		this.years = years;
		this.keyword = keyword;
		this.movie_source = movie_source;
		this.rating = rating;
	}

	public MovieModel(String type_movie, String keyword, String movie_source, String rating) {
		super();
		this.type_movie = type_movie;
		this.keyword = keyword;
		this.movie_source = movie_source;
		this.rating = rating;
	}

	/**
	 * get方法
	 * 
	 * @return movie_id
	 * 
	 */
	public int getMovie_id() {
		return movie_id;
	}

	/**
	 * set方法
	 * 
	 * @param movie_id
	 *            电影编号
	 * 
	 */
	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}

	public String getMovie_name() {
		return movie_name;
	}

	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getType_language() {
		return type_language;
	}

	public void setType_language(String type_language) {
		this.type_language = type_language;
	}

	public String getType_movie() {
		return type_movie;
	}

	public void setType_movie(String type_movie) {
		this.type_movie = type_movie;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public Date getEntry_time() {
		return entry_time;
	}

	public void setEntry_time(Date entry_time) {
		this.entry_time = entry_time;
	}

	public String getYears() {
		return years;
	}

	public void setYears(String years) {
		this.years = years;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getMovie_source() {
		return movie_source;
	}

	public void setMovie_source(String movie_source) {
		this.movie_source = movie_source;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "MovieModel [movie_id=" + movie_id + ", movie_name=" + movie_name + ", director=" + director + ", actor="
				+ actor + ", type_language=" + type_language + ", type_movie=" + type_movie + ", district=" + district
				+ ", entry_time=" + entry_time + ", years=" + years + ", keyword=" + keyword + ", movie_source="
				+ movie_source + ", rating=" + rating + "]\n";
	}
}
