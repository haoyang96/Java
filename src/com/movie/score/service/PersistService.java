package com.movie.score.service;

import org.apache.log4j.Logger;

import com.movie.score.mapper.MovieMapper;
import com.movie.score.model.MovieModel;
import com.movie.score.service.AbstractDao;

/**
 * 
 * @author 杨浩
 * 
 * @version 1.1
 *
 *          服务层实现类，继承自抽象Dao层
 *
 */
public class PersistService extends AbstractDao {
	private Logger logger = Logger.getLogger(this.getClass());
	/**
	 * movieMapper接口
	 */
	MovieMapper movieMapper;

	public PersistService() {
		super();
		System.out.println("PersistService调用无参构造方法!!!");
	}

	/**
	 * 实现addMovie()方法
	 * 
	 * @param t
	 *            信息的实体类对象
	 */
	@Override
	public void addMovie(MovieModel t) {
		if (null != t) {
			movieMapper.addMovie(t);
		} else {
			logger.error("传入对象为空,不能新增该对象！");
		}
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
		movieMapper.updateMovie(t, id);
	}

	/**
	 * 实现delMovieById()方法
	 * 
	 * @param id
	 *            根据id删除信息
	 */
	@Override
	public void delMovieById(int id) {
		movieMapper.delMovieById(id);
	}

	public MovieMapper getMovieMapper() {
		return movieMapper;
	}

	public void setMovieMapper(MovieMapper movieMapper) {
		this.movieMapper = movieMapper;
	}
}
