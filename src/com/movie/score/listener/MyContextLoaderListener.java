package com.movie.score.listener;

import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import javax.servlet.ServletContextEvent;

import org.springframework.web.context.ContextLoaderListener;

/**
 * 
 * @author 杨浩
 * @version 1.0
 * 
 */
public class MyContextLoaderListener extends ContextLoaderListener {
	/**
	 * 
	 * 将所有的线程启动
	 */
	@Override
	public void contextInitialized(ServletContextEvent event) {
		super.contextInitialized(event);
		@SuppressWarnings("unchecked")
		/**
		 * @param threadMap
		 *            thread pool
		 */
		Map<String, Thread> threadMap = (Map<String, Thread>) getCurrentWebApplicationContext().getBean("jobMap");
		// start Threads
		Set<Entry<String, Thread>> threadMapEntrySet = threadMap.entrySet();
		for (Entry<String, Thread> threadMapEntry : threadMapEntrySet) {
			threadMapEntry.getValue().start();
		}

	}
}
