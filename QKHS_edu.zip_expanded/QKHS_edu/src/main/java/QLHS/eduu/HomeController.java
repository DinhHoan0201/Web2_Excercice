package QLHS.eduu;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import QLHS.service.QKHS_Implement;
import QLHS_entities.Students;
import QLHS_repos.Students_repos;

@RestController

public class HomeController {
	@Autowired QKHS_Implement qkhs_implement;
	

	@GetMapping({"/"})
	public List<Students>  getAllStudents()
	{
	    
	    return qkhs_implement.getAllStudents() ;
	}

}
