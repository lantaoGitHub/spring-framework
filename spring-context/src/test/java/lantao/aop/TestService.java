package lantao.aop;

import org.springframework.stereotype.Service;

/**
 * @Auther: lantao
 * @Date: 2019-05-09 13:59
 * @Company: 随行付支付有限公司
 * @maill: lan_tao@suixingpay.com
 * @Description: TODO
 */
//@Service
public class TestService {

	private String a;

	@aspetJTest
	public void printInfo() {
		System.out.println("进入了printInfo方法");
	}

	public void setA(String a) {
		this.a = a;
	}

	public String getA() {
		return a;
	}
}
