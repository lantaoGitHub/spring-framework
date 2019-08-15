package lantao.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Auther: lantao
 * @Date: 2019-05-09 14:03
 * @Company: 随行付支付有限公司
 * @maill: lan_tao@suixingpay.com
 * @Description: TODO
 */
// 切面
@Aspect
@Component
public class Config {

	// 切点
	@Pointcut("@annotation(aspetJTest)")
	public void controllerAspect() {
	}

	@Around("controllerAspect()")
	public Object Around(ProceedingJoinPoint point) throws Throwable {
		System.out.println("进入Around方法");
		Object proceed = point.proceed();
		System.out.println("退出Around方法");
		return proceed;
	}

	// 增强器
	@After("controllerAspect()")
	public void after(){
		System.out.println("进入after方法");
	}

	@Before("controllerAspect()")
	public void before(){
		System.out.println("进入before方法");
	}
}
