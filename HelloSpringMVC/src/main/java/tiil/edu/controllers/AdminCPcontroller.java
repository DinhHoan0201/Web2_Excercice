package tiil.edu.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminCPcontroller {
	@RequestMapping("/admincp/index")
	public String trangchuQuanTri() {
		return "admincp/index";
	}
}
