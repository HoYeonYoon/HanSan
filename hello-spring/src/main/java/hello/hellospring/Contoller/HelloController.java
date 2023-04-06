package hello.hellospring.Contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@GetMapping("hello")
	public String hello(Model model) {
		model.addAttribute("data", "hello!!");
		return "hello";
	}
	
	@GetMapping("hello-mvc")
	public String helloMVC(@RequestParam(value = "name", required = false) String name, Model model) {
		model.addAttribute("name", name);
		return "hello-template";
	}

	@GetMapping("hello-string")
	@ResponseBody
	// http통신의 body부분에 데이터를 직접 넣어주겠다.
	// 페이지 소스 보기 실행시 html코드가 나오지 않음 (문자가 그대로 나온다)
	public String helloString(@RequestParam("name") String name) {
		return "hello " + name;
	}
	
	@GetMapping("hello-api")
	@ResponseBody
	// JSON방식으로 넘김 (문자가 아니라 객체)
	public Hello helloApi(@RequestParam("name") String name) {
		Hello hello = new Hello();
		hello.setName(name);
		return hello;
	}
	
	static class Hello {
		private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}	
	}
}