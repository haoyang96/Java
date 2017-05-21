package com.movie.score.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

import com.movie.score.service.FindService;


public class Main {
	public static void main(String[] args) {
		ClassPathResource res = new ClassPathResource("/beans.xml");
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(res);
		FindService bean = (FindService) factory.getBean("findService");
		Class<? extends FindService> class1 = bean.getClass();
		System.out.println(class1);
	}
}
