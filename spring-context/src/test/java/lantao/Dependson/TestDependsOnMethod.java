package lantao.Dependson;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class TestDependsOnMethod {

	@Bean("dependson01")
	@DependsOn("dependson02")
	public Dependson01 test1 (){
		return new Dependson01();
	}

	@Bean("dependson02")
	public Dependson02 test2 (){
		return new Dependson02();
	}
}
