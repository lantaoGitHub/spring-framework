package lantao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LookUpTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-bean-lookup.xml");
		TestLookUp user = (TestLookUp) applicationContext.getBean("testLookUp");
		user.showMe();
	}
}
