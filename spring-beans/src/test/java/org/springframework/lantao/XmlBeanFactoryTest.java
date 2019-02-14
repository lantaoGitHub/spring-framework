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
    }
}
