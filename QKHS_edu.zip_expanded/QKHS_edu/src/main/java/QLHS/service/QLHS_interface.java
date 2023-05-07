package QLHS.service;

import java.util.List;

import org.springframework.stereotype.Service;

import QLHS_entities.Students;

@Service
public interface QLHS_interface {
	public List<Students>  getAllStudents();
	public Students getStudentbyId(int ma_hoc_sinh);
}
