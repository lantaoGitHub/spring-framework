package lantao.test;

/**
 * @Auther: lantao
 * @Date: 2019-05-14 17:58
 * @Company: 随行付支付有限公司
 * @maill: lan_tao@suixingpay.com
 * @Description: TODO
 */
public abstract class Parent {

	protected String b;

	protected Context context;

	public Context getContext() {
		return context;
	}

	public void setContext(Context context) {
		this.context = context;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}
}
