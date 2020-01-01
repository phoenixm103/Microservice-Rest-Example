package springBootStudentServiceProject.course;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springBootStudentServiceProject.common.Converter;
import springBootStudentServiceProject.course.CourseVM;


@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
		
	
	public List<CourseVM> getAllCoursesOnly() {   
		return Converter.getCourseVMList(courseRepository.findAll());
	}
	public void addCoursesOnly(Course course) {   
		courseRepository.save(course);	
	}
	public CourseVM getAllCourseStudents(String id) {
		return Converter.getCourseVMwithStudentList(courseRepository.findAll(),id);
	}
	
}

