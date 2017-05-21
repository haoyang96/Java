package com.movie.score.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.movie.score.model.MemoryModel;
import com.movie.score.model.MovieModel;

/**
 * 
 * @author 杨浩
 *
 */
public interface MovieMapper {

	/**
	 * 添加一部电影信息
	 * 
	 * @param movieModel
	 *            电影信息的实体类对象
	 */
	public void addMovie(MovieModel movieModel);

	/**
	 * 删除电影信息
	 * 
	 * @param id
	 *            根据id删除一部电影
	 */
	public void delMovieById(int id);

	/**
	 * 更新电影信息
	 * 
	 * @param movieModel
	 *            电影对象模型
	 * 
	 * @param id
	 *            需要修改的电影信息编号
	 */
	public void updateMovie(@Param("movieModel") MovieModel movieModel, @Param("id") int id);

	/**
	 * 查询电影信息
	 * 
	 * @param id
	 *            需要查询的id
	 * @return 返回一部电影信息
	 */
	public MovieModel findMovieById(int id);

	/**
	 * 查询所有电影信息
	 * 
	 * @return 返回所有电影信息的集合
	 */
	public List<MovieModel> findMovies();

	/**
	 * 定时插入当前内存值
	 * 
	 * @param memoryModel
	 *            内存的实体类对象
	 */
	public void addMemory(MemoryModel memoryModel);
}
