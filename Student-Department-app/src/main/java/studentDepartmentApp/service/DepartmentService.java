package studentDepartmentApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import studentDepartmentApp.common.Converter;
import studentDepartmentApp.model.Department;
import studentDepartmentApp.model.StudentInfo;
import studentDepartmentApp.repository.DepartmentRepository;
import studentDepartmentApp.repository.StudentRepository;
import studentDepartmentApp.vm.DepartmentVM;
import studentDepartmentApp.vm.StudentInfoVM;
@Service
public class DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepository;
	
	//public List<Department> getAllDepartments() {
		public List<DepartmentVM> getAllDepartments() {
			return Converter.getDepartmentVMList(departmentRepository.findAll());
			
		

	}
	public void addDepartment(Department department) {
		departmentRepository.save(department);	
		
	}
	public DepartmentVM getDepartmentById(String id) {
		return Converter.getDepartmentByIdVM(departmentRepository.findAll(),id);
	}

}
