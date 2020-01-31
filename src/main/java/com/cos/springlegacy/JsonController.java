package com.cos.springlegacy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JsonController {

	
	// 스프링은 form의 name값과 혹은 QueryString만 오브젝트로 자동 반환!!
	@RequestMapping(value = "/jsonTest", method = RequestMethod.POST)
	public @ResponseBody RequestJsonDto jsonTest(@RequestBody RequestJsonDto requestJsonDto) {
		
		
		System.out.println(requestJsonDto.getId());
		
		return requestJsonDto;
	}
	
	
	// http://localhost:8080/springlegacy/jsonHome/4
	// http://localhost:8080/springlegacy/jsonHome/안녕
												// 이런식으로 아무거나 적어도 다 들어온다
	
	// http://localhost:8080/springlegacy/jsonHome/1 이런식으로 주로 페이징할 때 쓴다.
	@RequestMapping(value = "/jsonHome/{num}", method = RequestMethod.GET)
	// 위의 변수(num)와 이름 똑같이 해줘라
	public String  jsonHome(@PathVariable int num) {
		
		System.out.println("num: " + num);
		return "jsonHome";
		
	}
}
