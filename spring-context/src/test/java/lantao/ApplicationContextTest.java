package lantao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.lantao.UserBean;

public class ApplicationContextTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-bean.xml");
		UserBean userBean = (UserBean) applicationContext.getBean("userBean");
		System.out.println(userBean.getName());
	}

}
