package lantao.scan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestScanTwo {

	@Autowired
	private TestScanOne testScanOne;

}
