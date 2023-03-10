package tiil.edu.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping("/welcome")
	public String welcome(ModelMap model) {
		model.addAttribute("msg", "Helo maven");
		return "viewWelcome";
	}
}
