package org.springframework.lantao;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class XmlBeanFactoryTest {

    public static void main(String[] args) {
        ClassPathResource classPathResource = new ClassPathResource("spring-bean.xml");
        BeanFactory beanFactory = new XmlBeanFactory(classPathResource);
        UserBean userBean = (UserBean) beanFactory.getBean("userBean");
          System.out.println(userBean.getName());


		// 构造器注入
//        ClassPathResource classPathResource = new ClassPathResource("spring-bean-constructor.xml");
//        BeanFactory beanFactory = new XmlBeanFactory(classPathResource);
//		UserBeanConstructor userBean = (UserBeanConstructor) beanFactory.getBean("userBean");
//		System.out.println(userBean.toString());

		//byName
//		ClassPathResource classPathResource = new ClassPathResource("spring-bean-byname.xml");
//		BeanFactory beanFactory = new XmlBeanFactory(classPathResource);
//		UserOneBean userOneBean = (UserOneBean) beanFactory.getBean("userOneBean");
//		userOneBean.getUserTwoBean().test();

		//byType
//		ClassPathResource classPathResource = new ClassPathResource("spring-bean-bytype.xml");
//		BeanFactory beanFactory = new XmlBeanFactory(classPathResource);
//		UserOneBean userOneBean = (UserOneBean) beanFactory.getBean("userOneBean");
//		userOneBean.getUserTwoBean().test();

	}
}
