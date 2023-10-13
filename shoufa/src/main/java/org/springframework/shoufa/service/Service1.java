package org.springframework.shoufa.service;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.support.PostProcessorRegistrationDelegate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
//@Component
public class Service1 {

//	@Autowired
//	private final Service2 service2;

//	@Autowired
	private Service2 service2;

	public void setService2(Service2 service2) {
		this.service2 = service2;
	}

//	public Service1(Service2 service2){
//		this.service2 = service2;
//	}

//	@Autowired
//	private PostProcessorRegistrationDelegate postProcessorRegistrationDelegate;

//	public Service1() {
//		new PostProcessorRegistrationDelegate();
//		this.service2 = service2;
//		service2
//		System.out.println("service2");
//	}
}
