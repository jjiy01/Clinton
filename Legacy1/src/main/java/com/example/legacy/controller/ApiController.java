package com.example.legacy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

	static class ApiVo {
		private String id;
		private String name;
		
		public String getId() {
			return id;
		}
		
		public void setId(String id) {
			this.id = id;
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ApiVo get( ) {
		ApiVo api = new ApiVo();
		api.setId("aaa");
		api.setName("bbb");
		return api;
	}
}
