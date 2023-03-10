package jp.vs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admincp/")
public class AdminController {
	@RequestMapping("index")
	public String trangChuquantri() 
	{
		return "admincp/index";
	}
}
