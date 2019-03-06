package lantao.lookUp;

public abstract class TestLookUp {

	public abstract UserLookUp getBean();

	public void showMe(){
		this.getBean().showMe();
	}
}
