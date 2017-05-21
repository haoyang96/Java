package com.movie.score.service;

import java.util.List;

import com.movie.score.mapper.MovieMapper;
import com.movie.score.model.MovieModel;
import com.movie.score.service.AbstractDao;

/**
 * 
 * @author 杨浩
 *
 *         服务层实现类，继承自抽象Dao层
 *
 */
public class FindService extends AbstractDao {
	/**
	 * movieMapper接口
	 */
	MovieMapper movieMapper;

	public FindService() {
		super();
		System.out.println("FindService调用无参构造方法!!!");
	}

	/**
	 * 实现findMovie()方法
	 * 
	 * @return 返回所有信息的集合
	 * 
	 */
	@Override
	public List<MovieModel> findMovie() {
		return movieMapper.findMovies();
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
		return movieMapper.findMovieById(id);
	}

	public MovieMapper getMovieMapper() {
		return movieMapper;
	}

	public void setMovieMapper(MovieMapper movieMapper) {
		this.movieMapper = movieMapper;
	}
}
