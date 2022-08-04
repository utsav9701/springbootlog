package com.uit.demo;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringRestController {
	private static final Logger logger = LoggerFactory.getLogger(SpringRestController.class);
	@GetMapping("/countries")
	public Map<String,String> getCountryWithContryCode(@RequestParam("exe")Boolean exe){
		logger.info("Enter inside the getCountryWithContryCode");
		if(exe) {
			throw new RuntimeException();
		}
		Map<String,String> map=new HashMap<String, String>();
		map.put("93","Afghanistan");
		map.put("91","India");
		map.put("61","Australia");
		map.put("33","France");
		logger.info("Exit from the getCountryWithContryCode");
		return map;
	}

}
