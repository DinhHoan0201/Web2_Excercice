package tiil.edu.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class User2Controller {
	
	@RequestMapping(value="login2", method = RequestMethod.GET)
	public String loginGet()
	{
		return "login2";		
	}
	
	@RequestMapping(value="login", method = RequestMethod.POST)
	public String loginPost(ModelMap model,
					@RequestParam("id") String tenDN,
					@RequestParam("pwd") String matKhau)
	{
		if (tenDN.equals("admin") && matKhau.equals("62cnttclc"))
		{
			return "redirect:/admincp/index.html";
			
		}else 
			model.addAttribute("thongbaoLoi", "Thông tin đăng nhập không đúng"); 
			return "login2";	
		}
	}
}
