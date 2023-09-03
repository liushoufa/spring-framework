package org.springframework.shoufa.config;

import org.junit.Test;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Configuration
@ComponentScan({"org.springframework.shoufa.service"})
public class ShoufaConfig {

//	@Test
//	public void

	@RequestMapping(value="/{id}", method= RequestMethod.GET)
	public ResponseEntity<String> spittleById(@PathVariable long id) {
		String spittle = "spittleRepository.findOne(id)";
		HttpStatus status = spittle != null ?
				HttpStatus.OK : HttpStatus.NOT_FOUND;
		return new ResponseEntity<String>(spittle, status);
	}
}
