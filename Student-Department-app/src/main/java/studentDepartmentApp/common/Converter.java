package studentDepartmentApp.common;

import java.util.ArrayList;
import java.util.List;

import studentDepartmentApp.model.Department;
import studentDepartmentApp.model.StudentInfo;
import studentDepartmentApp.vm.DepartmentVM;
import studentDepartmentApp.vm.StudentInfoVM;


public class Converter {
	
	public static List<StudentInfoVM> getStudentVMList(List<StudentInfo> students) {
		List<StudentInfoVM> studentVMList=new ArrayList();
		students.forEach(student->{
			studentVMList.add(getStudentVM(student));
		});
		return studentVMList;
		
	}

	private static StudentInfoVM getStudentVM(StudentInfo student) {
		if(student!=null) {
		return new StudentInfoVM(student.getId(),student.getName(),getDepartmentVM1(student.getDepartment()));
		}
		return null;
	}

	private static DepartmentVM getDepartmentVM1(Department department) {
		if(department!=null) {
		return new DepartmentVM(department.getId(), department.getName()/*, getTopicVMList(course.getTopic())*/);
	}
	return null;
}

	public static List<DepartmentVM> getDepartmentVMList(List<Department> departments) {
		List<DepartmentVM> departmentVMList=new ArrayList();
		departments.forEach(department->{
			departmentVMList.add(getDepartmentVM(department));
		});
		return departmentVMList;
		
	}

	private static DepartmentVM getDepartmentVM(Department department) {
		if(department!=null) {
			return new DepartmentVM(department.getId(),department.getName()/*,getStudentVMListOnlyNameAndID(department.getStudents())*/);
			}
			return null;
	}

	private static List<StudentInfoVM> getStudentVMListOnlyNameAndID(List<StudentInfo> students) {
		List<StudentInfoVM> studentVMList=new ArrayList();
		students.forEach(student->{
			studentVMList.add(getStudentVMOnlyNameAndId(student));
		});
		return studentVMList;
	}

	private static StudentInfoVM getStudentVMOnlyNameAndId(StudentInfo student) {
		if(student!=null) {
			return new StudentInfoVM(student.getId(),student.getName());
			}
			return null;
	}

	public static DepartmentVM getDepartmentByIdVM(List<Department> departments, String id) {
			
		for(int i=0;i<departments.size();i++) {
			Department department=departments.get(i);
			if(department.getId().equals(id)) {
				DepartmentVM dep= getDepartmentVMById(department);
				return dep; 
			}		
		}

		return null;
	}

	private static DepartmentVM getDepartmentVMById(Department department) {
		if(department!=null) {
			return new DepartmentVM(department.getId(),department.getName(),getStudentVMListOnlyNameAndID(department.getStudents()));
			}
			return null;
		}
	}