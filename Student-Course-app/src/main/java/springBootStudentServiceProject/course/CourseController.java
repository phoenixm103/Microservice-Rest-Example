package springBootStudentServiceProject.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CourseController {
	@Autowired
	private CourseService courseService;
	

	@RequestMapping("/courses")
	public List<CourseVM> getAllCoursesOnly(){
		return courseService.getAllCoursesOnly();
	}
	@RequestMapping(method=RequestMethod.POST,value="/courses")
	public void addCoursesOnly(@RequestBody Course course) {
		courseService.addCoursesOnly(course);

	}
	@RequestMapping("/courses/{id}/enrolledStudents")
	public CourseVM getAllCourseStudents(@PathVariable String id){
		return courseService.getAllCourseStudents(id);
	}
	
	

}