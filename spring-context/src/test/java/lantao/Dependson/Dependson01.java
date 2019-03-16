package lantao.Dependson;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

//@Component
//@DependsOn("dependson02")
public class Dependson01 {

	Dependson01(){
		System.out.println("Dependson01 success");
	}
}
