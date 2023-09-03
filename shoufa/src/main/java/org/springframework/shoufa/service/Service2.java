package org.springframework.shoufa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//@Scope
public class Service2 {

	@Autowired
	private Service1 service1;

//	public Service2(Service1 service1) {
//		this.service1 = service1;
//		service1;
//		System.out.println("service1");
//	}
}
