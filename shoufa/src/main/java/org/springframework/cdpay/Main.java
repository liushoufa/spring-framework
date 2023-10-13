package org.springframework.cdpay;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cdpay.config.CDPlayConfig;
import org.springframework.cdpay.service.CDService1;
import org.springframework.shoufa.service.Service1;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayConfig.class)
public class Main {

//	@Autowired
//	private CDService1 cdService1;

	@Test
	public void shoufa() {
	}
}
