package lantao.EventListener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext a = new ClassPathXmlApplicationContext("spring-bean-event-listener.xml");
		a.publishEvent(new TestEvent(a));
	}
}
