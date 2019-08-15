package lantao.BeanFactoryPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lantao.UserBean;

/**
 * @Auther: lantao
 * @Date: 2019-05-29 15:08
 * @Company: 随行付支付有限公司
 * @maill: lan_tao@suixingpay.com
 * @Description: TODO
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		UserBean a = null;
		if(bean instanceof UserBean){
			a = (UserBean) bean;
		}
		a.setAge(99999);
		a.setName("wangwu");
		System.out.println("before----" + beanName);
		return a;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("alter----" + bean);
		return bean;
	}
}
