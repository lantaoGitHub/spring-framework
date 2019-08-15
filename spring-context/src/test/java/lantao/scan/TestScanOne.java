package lantao.scan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Service;

@Service
public class TestScanOne {

	@Autowired
	private TestScanTwo testScanTwo;



}
