package lantao.EventListener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * 定义监听器
 */
public class TestListener implements ApplicationListener {

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		if(event instanceof TestEvent){
			((TestEvent) event).print();
		}
	}
}
