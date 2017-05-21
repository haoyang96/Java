package com.movie.score.service;

import java.util.List;

import com.movie.score.model.MovieModel;

/**
 * 
 * @author 杨浩
 *
 * @param <T>
 *            类模板
 * 
 *            查询接口
 */
public interface IFind<T> {
	/**
	 * 查询所有信息
	 * 
	 * @return 返回所有信息的集合
	 */
	public List<MovieModel> findMovie();

	/**
	 * 查询信息
	 * 
	 * @param id
	 *            需要查询的id
	 * @return 返回信息
	 */
	public MovieModel findMovieById(int id);
}
