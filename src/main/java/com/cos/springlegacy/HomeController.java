package com.cos.springlegacy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cos.springlegacy.dto.RequestInfoDto;

// http://localhost:8080/springlegacy/
// Controller 어노테이션은 페이지를 리턴하는 어노테이션(파일)이다!!
// RestController는 데이터를 리턴하는 어노테이션(파일)이다!!
// 리퀘스트 디스패처는 Controller만 찾아다닌다(RestController는 나중에 나온 개념)
@Controller
public class HomeController {

	// 1. 데이터 전달 - 쿼리스트링, Form데이터, Json
	// 2. 데이터 받기 - 쿼리스트링, Form데이터, Json
	// 3. Pathvariable 사용해보기

	// 슬러시가 아니면 버린다, 슬러시 있으면 찾아서 작업하고 다시 슬러시 찾으려고 대기 중!!
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		// 리턴하는 순간 Controller어노테이션이 클래스에서 함수가 return하는 순간 ViewResolver가 관여하여 prefix와
		// suffix를 만들어서 페이지를 return 해준다.
		
		// request에 담기 → model
		String username = "ssar";
					// 스트링 타입(키 넣는 곳)	// 오브젝트 타입(값 넣는 곳, 어떤 것이든지 다 올 수 있다!!)
		model.addAttribute("username", username);
		
		// home이 '뷰'다!!
		return "home";

	}

	// 정규표현식 주소: /hello/abc/1ffs/ 이런 식으로 뭂음표(?)가 붙지 않는다
	@RequestMapping(value = "/hello", method = RequestMethod.POST)
	// 변수이름은 주소이름과 똑같이 해줘라!
	
	// RequestParam은 QureyString, x-www-formurlencoded을 받을 수 있다!!
	public String hello(@RequestParam("id")String id, @RequestParam("pw")String pw, Model model) {
		
		System.out.println("id: " + id);
		System.out.println("pw: " + pw);
		
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		
		return "hello";

	}

	@RequestMapping(value = "/goodbye", method = RequestMethod.GET)
	public String goodbye(RequestInfoDto requestInfoDto) {
		
		System.out.println("addr: " + requestInfoDto.getAddr());
		System.out.println("hobby: " + requestInfoDto.getHobby());
		
		return "goodbye";

	}
}
