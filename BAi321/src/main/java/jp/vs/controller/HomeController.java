package jp.vs.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home/")
public class HomeController {
	@RequestMapping("index")
	public String trangChu() {
		//----
		// do sth
		//tra ve view
		return "home/index";
	}
	@RequestMapping("/about")
	public String gthieu() {
		//----
		// do sth
		//tra ve view
		return "home/about";
	}
	@RequestMapping("/feedback")
	public String phanhoi() {
		//----
		// do sth
		//tra ve view
		return "home/feedback";
	}
	@RequestMapping("/contact")
	public String lienhe() {
		//----
		// do sth
		//tra ve view
		return "home/contact";
	}
	@RequestMapping("/faq")
	public String faq() {
		//----
		// do sth
		//tra ve view
		return "home/faq";
	}
}