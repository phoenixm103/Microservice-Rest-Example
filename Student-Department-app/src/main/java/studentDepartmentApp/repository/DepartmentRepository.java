package studentDepartmentApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import studentDepartmentApp.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, String> {

}
