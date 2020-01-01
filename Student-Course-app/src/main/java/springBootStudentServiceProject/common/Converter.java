package springBootStudentServiceProject.common;

import java.util.ArrayList;
import java.util.List;

import springBootStudentServiceProject.course.Course;
import springBootStudentServiceProject.course.CourseVM;
import springBootStudentServiceProject.student.Student;
import springBootStudentServiceProject.student.StudentVM;



public class Converter {

	public static List<CourseVM> getCourseVMList(List<Course> courses) {
		List<CourseVM> courseVMList=new ArrayList();
		courses.forEach(course->{
			courseVMList.add(getCourseVM(course));
		});
		return courseVMList;
	}

	private static CourseVM getCourseVM(Course course) {
		if(course!=null) {
			return new CourseVM(course.getId(), course.getName());
		}
		return null;
	}


	public static List<StudentVM> getStudentVMList(List<Student> students) {
		List<StudentVM> studentVMList=new ArrayList();
		students.forEach(student->{
			studentVMList.add(getStudentVM(student));
		});
		return studentVMList;
		
	}

	private static StudentVM getStudentVM(Student student) {
		if(student!=null) {
		return new StudentVM(student.getId(),student.getName(),getCourseVMIDList(student.getCourse()));
		}
		return null;
	}

	private static List<CourseVM> getCourseVMIDList(List<Course> courses) {
		List<CourseVM> courseIdVMList=new ArrayList();
		courses.forEach(course->{
			courseIdVMList.add(getCourseIdVM(course));
		});
		return courseIdVMList;
	}

	private static CourseVM getCourseIdVM(Course course) {
		if(course!=null) {
			return new CourseVM(course.getId(),course.getName());
		}
		return null;

	}

	public static StudentVM getStudentVMByID(List<Student> students,String id) {
		
		
		for(int i=0;i<students.size();i++) {
		Student student=students.get(i);
		if(student.getId().equals(id)) {
			StudentVM stu= getStudentVM(student);
			return stu; 
		}
		
	}
		return null;
	}

	public static void addCoursesToStudent(List<Student> students,Course course, String id) {
		Student student= getStudentByID(students,id);
		List<Course> courses=student.getCourse();
		courses.add(course);
		for(int i=0;i<courses.size();i++) {
				}
		
		
		
	}

	private static Student getStudentByID(List<Student> students,String id) {
		// TODO Auto-generated method stub
		for(int i=0;i<students.size();i++) {
			Student student=students.get(i);
			if(student.getId().equals(id)) {
				//System.out.println("aosuwvofuyadufad "+student.getId());
				return student; 
			}
			
		}
			return null;
	
	}

	public static CourseVM getCourseVMwithStudentList(List<Course> courses, String id) {

		for(int i=0;i<courses.size();i++) {
		Course course=courses.get(i);
		if(course.getId().equals(id)) {
			CourseVM stu= getCourseVMwithStudent(course);
			return stu; 
		}
		
	}
		return null;
	}

	private static CourseVM getCourseVMwithStudent(Course course) {
		 {
				if(course!=null) {
					return new CourseVM(course.getId(), course.getName(), getStudentVMListOnlyNameID(course.getStudent()));
				}
				return null;
			}	}

	private static List<StudentVM> getStudentVMListOnlyNameID(List<Student> students) {
		List<StudentVM> studentVMList=new ArrayList();
		students.forEach(student->{
			studentVMList.add(getStudentVMOnlyNameID(student));
		});
		return studentVMList;
		
	}

	private static StudentVM getStudentVMOnlyNameID(Student student) {
		{
			if(student!=null) {
			return new StudentVM(student.getId(),student.getName());
			}
			return null;
		}

	}
	}
