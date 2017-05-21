package com.movie.score.thread;

import com.movie.score.mapper.MovieMapper;
import com.movie.score.model.MemoryModel;

/**
 * 
 * @author 杨浩
 * 
 * @version 1.0
 *
 */
public class MemThread extends Thread {
	/**
	 * movieMapper接口
	 */
	MovieMapper movieMapper;

	public MemThread() {
		super();
		System.out.println("MemThread调用无参构造方法!!!");
	}

	/**
	 * 实现run()方法
	 * 
	 * 将当前项目的内存情况每过5秒钟记录到数据库一次
	 * 
	 */
	@Override
	public void run() {
		MemoryModel memoryModel = new MemoryModel();
		try {
			while (true) {
				MemThread.sleep(5000);
				System.out.println("当前JVM已经从操作系统拿到的内存大小:" + Runtime.getRuntime().totalMemory() / 1024 / 1024 + "M");
				int totalMemory = (int) (Runtime.getRuntime().totalMemory() / 1024 / 1024);
				int maxMemory = (int) (Runtime.getRuntime().maxMemory() / 1024 / 1024);
				int freeMemory = (int) (Runtime.getRuntime().freeMemory() / 1024 / 1024);
				memoryModel.setTotalMemory(totalMemory);
				memoryModel.setMaxMemory(maxMemory);
				memoryModel.setFreeMemory(freeMemory);
				movieMapper.addMemory(memoryModel);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public MovieMapper getMovieMapper() {
		return movieMapper;
	}

	public void setMovieMapper(MovieMapper movieMapper) {
		this.movieMapper = movieMapper;
	}
}
