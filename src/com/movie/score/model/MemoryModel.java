package com.movie.score.model;

/**
 * 
 * @author 杨浩
 * 
 * @version 1.0
 *
 */
public class MemoryModel {
	/**
	 * 最大可使用内存
	 */
	private int maxMemory;
	/**
	 * 总的内存
	 */
	private int totalMemory;
	/**
	 * 余下可使用内存
	 */
	private int freeMemory;

	/**
	 * get方法
	 * 
	 * @return maxMemory
	 * 
	 */
	public int getMaxMemory() {
		return maxMemory;
	}

	/**
	 * set方法
	 * 
	 * @param maxMemory
	 *            最大内存
	 * 
	 */
	public void setMaxMemory(int maxMemory) {
		this.maxMemory = maxMemory;
	}

	/**
	 * get方法
	 * 
	 * @return totalMemory
	 * 
	 */
	public int getTotalMemory() {
		return totalMemory;
	}

	/**
	 * set方法
	 * 
	 * @param totalMemory
	 *            总的内存
	 * 
	 */
	public void setTotalMemory(int totalMemory) {
		this.totalMemory = totalMemory;
	}

	/**
	 * get方法
	 * 
	 * @return freeMemory
	 * 
	 */
	public int getFreeMemory() {
		return freeMemory;
	}

	/**
	 * set方法
	 * 
	 * @param freeMemory
	 *            余下内存
	 * 
	 */
	public void setFreeMemory(int freeMemory) {
		this.freeMemory = freeMemory;
	}
}
