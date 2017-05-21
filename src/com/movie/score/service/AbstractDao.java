package com.movie.score.service;

import java.util.List;

import com.movie.score.model.MovieModel;
import com.movie.score.service.IFind;
import com.movie.score.service.IPersist;

/**
 * 
 * @author 杨浩
 * 
 *         抽象父类Dao层，实现IPersist、IFind接口
 *
 */
public class AbstractDao implements IPersist<MovieModel>, IFind<MovieModel> {
	/**
	 * 实现addMovie()方法
	 * 
	 * @param t
	 *            信息的实体类对象
	 */
	@Override
	public void addMovie(MovieModel t) {

	}

	/**
	 * 实现updateMovie()方法
	 * 
	 * @param t
	 *            对象模型
	 * 
	 * @param id
	 *            需要修改的信息编号
	 */
	@Override
	public void updateMovie(MovieModel t, int id) {

	}

	/**
	 * 实现delMovieById()方法
	 * 
	 * @param id
	 *            根据id删除信息
	 */
	@Override
	public void delMovieById(int id) {

	}

	/**
	 * 实现findMovie()方法
	 * 
	 * @return 返回所有信息的集合
	 * 
	 */
	@Override
	public List<MovieModel> findMovie() {
		return null;
	}

	/**
	 * 实现findMovieById()方法
	 * 
	 * @param id
	 *            需要查询的id
	 * @return 返回信息
	 * 
	 */
	@Override
	public MovieModel findMovieById(int id) {
		return null;
	}
}
