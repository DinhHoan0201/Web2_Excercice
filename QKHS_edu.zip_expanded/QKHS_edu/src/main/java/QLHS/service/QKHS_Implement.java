package QLHS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import QLHS_entities.Students;
import QLHS_repos.Students_repos;
@Service

public class QKHS_Implement implements  QLHS_interface  {
	@Autowired Students_repos students_repos;

	@Override
	public List<Students> getAllStudents() {
		// TODO Auto-generated method stub
		return students_repos.findAll();
	}

	@Override
	public Students getStudentbyId(int ma_hoc_sinh) {
		// TODO Auto-generated method stub
		return students_repos.getById(ma_hoc_sinh);
	}

}
