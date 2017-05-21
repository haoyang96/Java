package com.movie.score.service;

/**
 * 
 * @author 杨浩
 *
 * @param <T>
 *            类模板
 * 
 *            持久化接口
 * 
 */
public interface IPersist<T> {
	/**
	 * 添加信息
	 * 
	 * @param t
	 *            实体类对象
	 */
	public void addMovie(T t);

	/**
	 * 更新信息
	 * 
	 * @param t
	 *            对象模型
	 * 
	 * @param id
	 *            需要修改的信息编号
	 */
	public void updateMovie(T t, int id);

	/**
	 * 删除信息
	 * 
	 * @param id
	 *            根据id删除信息
	 */
	public void delMovieById(int id);
}
