package lantao.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @Auther: lantao
 * @Date: 2019-05-14 18:12
 * @Company: 随行付支付有限公司
 * @maill: lan_tao@suixingpay.com
 * @Description: 测试注入子类然后 set 父类的属性
 */
public class Test {

	public static void main(String[] args) {
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-bean-son.xml");
//		Son son = (Son) applicationContext.getBean("son");
//		System.out.println(son.getB());

		LocalDateTime today = LocalDateTime.of(LocalDate.now(), LocalTime.now());
		System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

	}
}
