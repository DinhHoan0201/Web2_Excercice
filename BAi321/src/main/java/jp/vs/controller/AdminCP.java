package jp.vs.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class AdminCP {
	
	@RequestMapping("/admincp/index")
	public String trangQuantri()
	{
		return "admincp/index";
	}

}
