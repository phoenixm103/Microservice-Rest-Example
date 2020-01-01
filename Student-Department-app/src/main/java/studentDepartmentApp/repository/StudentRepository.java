package studentDepartmentApp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import studentDepartmentApp.model.StudentInfo;
//
public interface StudentRepository extends JpaRepository<StudentInfo, String> {

//	
}
