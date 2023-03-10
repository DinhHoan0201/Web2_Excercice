package jp.vs.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class UserController {
	@RequestMapping(value="login",method= RequestMethod.GET)
	public String loginGet()
	{
		return "login";
	}
	@RequestMapping(value="login",method= RequestMethod.POST)
	public String loginPost(ModelMap model ,HttpServletRequest request) {
		String id= request.getParameter("id");
		String pass= request.getParameter("pwd");
		
		if(id.equals("admin")&&pass.equals("62cnttclc"))
		{
			return "redirect :/admincp/index.html";
		}
		else
		{
			return "login";
		}
	}
	
}
