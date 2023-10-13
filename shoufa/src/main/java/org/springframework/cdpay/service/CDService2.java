package org.springframework.cdpay.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDService2 {
	@Autowired
	private CDService1 cdService1;
}
