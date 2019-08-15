package lantao.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: lantao
 * @Date: 2019-05-09 14:06
 * @Company: 随行付支付有限公司
 * @maill: lan_tao@suixingpay.com
 * @Description: TODO
 */
public class TestAopMain {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-bean-aop.xml");
		TestService bean = classPathXmlApplicationContext.getBean(TestService.class);
		bean.printInfo();


	}
}
