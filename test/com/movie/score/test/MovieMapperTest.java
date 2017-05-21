package com.movie.score.test;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.movie.score.model.MovieModel;
import com.movie.score.service.IFind;
import com.movie.score.service.IPersist;
import com.movie.score.thread.MemThread;

/**
 * 使用Spring的测试框架
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
/**
 * 加载Spring的配置文件beans.xml
 */
@ContextConfiguration("/beans.xml")
public class MovieMapperTest {

	Logger logger = Logger.getLogger(this.getClass().getName());

	@Autowired
	private IPersist<MovieModel> persistService;
	@Autowired
	private IFind<MovieModel> findService;
	@Autowired
	private MemThread memThread;

	/**
	 * 测试addMovie()方法
	 * 
	 */
	//@Test
	public void testAddMovie() {
		// 电影信息添加
		MovieModel movieModel = new MovieModel("嘻嘻", "dir", "actor", "lan", "type", "dis", "2014-02-14", "key",
				"sour", "10");
		try {
			persistService.addMovie(movieModel);
			logger.info("电影添加成功!");
		} catch (Exception e) {
			logger.error("ERROR", e);
		}
	}

	/**
	 * 测试delMovieById()方法
	 * 
	 */
	//@Test
	public void testDeleteMovie() {
		// 根据id删除电影信息
		int id = 22;
		persistService.delMovieById(id);
		logger.info("编号为" + id + "的电影刪除成功!");
	}

	/**
	 * 测试updateMovie()方法
	 * 
	 */
	//@Test
	public void testUpdateMovieById() {
		// 可以改动电影类型、关键词、电影资源、评分，其余默认是不可改动的
		// "name10","dir","lan","type"
		int id = 24;
		MovieModel movieModel = new MovieModel(new String("name24"), new String("dir"), new String("lan"),
				new String("10"));
		persistService.updateMovie(movieModel, id);
		logger.info("编号为" + id + "的电影信息更新成功!");
	}

	/**
	 * 测试findMovieById()方法
	 * 
	 */
	//@Test
	public void testFindMovieById() {
		// 根据id查询单部电影信息
		MovieModel movieModel = findService.findMovieById(1);
		logger.info(movieModel);
	}

	/**
	 * 测试findMovies()方法
	 * 
	 */
	//@Test
	public void testFindAllStudents() {
		// 查询所有的电影信息
		List<MovieModel> movieList = findService.findMovie();
		for (MovieModel mov : movieList) {
			logger.info(mov);
		}
	}

	/**
	 * 测试run()方法
	 * 
	 */
	@Test
	public void testMemThread() {
		// 查看线程是否运行
		memThread.run();
	}
	
}
