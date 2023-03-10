package tiil.edu.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
	// Trả về cho User trang để đăng nhập 
	@RequestMapping(value="/login/login", method = RequestMethod.GET)
	public String loginGet()
	{
		return "/login/login";		
	}
	// Xử lý khi user nhấn submiet đăng nhập
	@RequestMapping(value="login", method = RequestMethod.POST)
	public String loginPost(ModelMap model, HttpServletRequest request)
	{
		// Xử lý đăng nhập ở đây
		// Lấy thông tin user submin
		String id = request.getParameter("id");
		String pass= request.getParameter("pwd");
		// tiếp theo, ta truy vấn bảng user, để tìm xem có không
		// nến có thì đăng nhật thành công, và ngược lại
		//---- ở bài này, ta bỏ qua bước truy cập csdl (học sau
		// ta hard-code
		if (id.equals("admin") && pass.equals("62cnttclc"))
		{ // đăng nhập thành công, thì do sth
			// điều hướng đến trang chủ quản trị
			return "redirect:/admincp/index.html";
			
		}else // đăng nhập không được
		{
			// gửi báo lỗi ra trang đăng nhập, thông qua model
			// ??   addAttribute(key, value for key)
			model.addAttribute("thongbaoLoi", "Thông tin đăng nhập không đúng"); 
			return "login";	
		}
	}
}
