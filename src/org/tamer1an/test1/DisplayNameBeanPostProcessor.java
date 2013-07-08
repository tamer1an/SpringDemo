package org.tamer1an.test1;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayNameBeanPostProcessor implements BeanPostProcessor {

	public Object postProcessAfterInitialization(Object bean, String BeanName)
			throws BeansException {
		System.out.println("postProcessAfterInitialization "+ BeanName);
		return bean;
	}

	public Object postProcessBeforeInitialization(Object bean, String BeanName)
			throws BeansException {
		System.out.println("postProcessBeforeInitialization "+ BeanName);
		return bean;
	}

}
