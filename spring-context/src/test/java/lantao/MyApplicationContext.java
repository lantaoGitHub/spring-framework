package lantao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.lantao.UserBean;

public class MyApplicationContext extends ClassPathXmlApplicationContext {

	public MyApplicationContext(String... configLocations){
		super(configLocations);
	}

	// 这里对应prepareRefresh方法中的initPropertySources方法
	protected void initPropertySources(){
		//添加验证要
		getEnvironment().setRequiredProperties("VAR");

		//设置是否可以依赖， 是否可以覆盖
		super.setAllowCircularReferences(true);
		super.setAllowBeanDefinitionOverriding(true);
	}

	public static void main(String[] args) {
		ApplicationContext myApplicationContext = new MyApplicationContext("spring-bean.xml");
		UserBean userBean1 = (UserBean) myApplicationContext.getBean("userBean");
		System.out.println(userBean1.getName());
	}
}
