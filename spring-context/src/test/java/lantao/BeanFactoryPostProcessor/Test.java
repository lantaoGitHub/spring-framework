package lantao.BeanFactoryPostProcessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext a = new ClassPathXmlApplicationContext("spring-bean-beanfactorypostprocessor.xml");
	}
}
