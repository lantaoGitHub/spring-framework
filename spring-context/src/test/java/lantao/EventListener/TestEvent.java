package lantao.EventListener;

import org.springframework.context.ApplicationEvent;

/**
 * 定义监听事件
 */
public class TestEvent extends ApplicationEvent {

	/**
	 * Create a new ApplicationEvent.
	 *
	 * @param source the object on which the event initially occurred (never {@code null})
	 */
	public TestEvent(Object source) {
		super(source);
	}


	public void print(){
		System.out.println("辣鸡");
	}
}
