package springBootStudentServiceProject.course;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends JpaRepository<Course, String> {
	
	//public List<Course> findByStudentId(String studentId);
	
}