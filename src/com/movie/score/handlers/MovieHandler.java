package com.movie.score.handlers;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.movie.score.model.MovieModel;
import com.movie.score.service.IFind;
import com.movie.score.service.IPersist;

/**
 * 
 * @author 杨浩
 * 
 * @version 1.0
 * 
 */
@Controller
public class MovieHandler {
	Logger logger = Logger.getLogger(this.getClass());
	@Autowired()
	@Qualifier("findService")
	IFind<MovieModel> findService;

	@Autowired()
	@Qualifier("persistService")
	IPersist<MovieModel> persistService;

	/**
	 * 查询所有电影信息
	 * 
	 * @param map
	 *            模型数据
	 * @return ModelAndView
	 */
	@RequestMapping("/movies")
	public String list(Map<String, Object> map) {
		logger.info("开始调用movies");
		// 查询所有的电影信息
		map.put("movies", findService.findMovie());
		return "list";
	}

	/**
	 * 进入新增页面
	 * 
	 * @param map
	 *            模型数据
	 * @return ModelAndView
	 */
	@RequestMapping(value = "/movie", method = RequestMethod.GET)
	public String input(Map<String, Object> map) {
		// 进入新增页面
		// 添加语言列表
		Map<Integer, String> type_language = new HashMap<Integer, String>();
		type_language.put(1, "英语");
		type_language.put(2, "普通话");
		type_language.put(3, "韩语");
		type_language.put(4, "日语");
		// 添加电影发行地列表
		Map<Integer, String> district = new HashMap<Integer, String>();
		district.put(1, "中国大陆");
		district.put(2, "美国");
		district.put(3, "中国香港");
		district.put(4, "泰国");
		district.put(5, "韩国");
		district.put(6, "英国");

		map.put("type_language", type_language);
		map.put("district", district);
		map.put("movie", new MovieModel());
		return "input";
	}

	/**
	 * 确认新增电影信息
	 * 
	 * @param movie
	 *            对象实例
	 * @return 信息
	 */
	@RequestMapping(value = "/movie", method = RequestMethod.POST)
	public String save(MovieModel movie) {
		// 确认新增
		/**
		 * 对语言的处理type_language
		 */
		if ("1".equals(movie.getType_language())) {
			movie.setType_language("英语");
		} else if ("2".equals(movie.getType_language())) {
			movie.setType_language("普通话");
		} else if ("3".equals(movie.getType_language())) {
			movie.setType_language("韩语");
		} else if ("4".equals(movie.getType_language())) {
			movie.setType_language("日语");
		}
		persistService.addMovie(movie);
		/**
		 * 此处为重定向
		 */
		return "redirect:/movies";
	}

	/**
	 * 
	 * @param id
	 *            编号
	 * @param map
	 *            隐式模型数据
	 * @return 更改
	 */
	@RequestMapping(value = "/movie/{movie_id}", method = RequestMethod.GET)
	public String input(@PathVariable("movie_id") Integer id, Map<String, Object> map) {
		// 要开始修改
		map.put("movie", findService.findMovieById(id));
		return "modify";
	}

	/**
	 * 修改提交
	 * 
	 * @param movie
	 *            电影信息
	 * @return 页面定向
	 */
	@RequestMapping(value = "/movie", method = RequestMethod.PUT)
	public String update(MovieModel movie) {
		// 修改提交
		persistService.updateMovie(movie, movie.getMovie_id());
		return "redirect:/movies";
	}

	/**
	 * 删除电影信息
	 * 
	 * @param id
	 *            电影编号
	 * @return 页面定向
	 */
	@RequestMapping(value = "/movie/{id}", method = RequestMethod.DELETE)
	public String delete(@PathVariable("id") Integer id) {
		logger.info("删除" + id);
		// 删除指定id的电影信息
		persistService.delMovieById(id);
		return "redirect:/movies";
	}
}
