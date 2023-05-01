package QLHS.eduu;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import QLHS_entities.Students;
import QLHS_repos.Students_repos;

@Controller

public class HomeController {
	@Autowired
	private Students_repos studentsRepository;

	@RequestMapping(value={"/"})
	public List<Students>  getAllStudents(){
	    
	    return studentsRepository.findAll() ;
	}

}
