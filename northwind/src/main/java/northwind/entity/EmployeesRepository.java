package northwind.entity;

import java.util.List;


import org.springframework.data.repository.CrudRepository;

public interface EmployeesRepository extends CrudRepository<Employees, Long> {

	List<Employees> findByLastName(String lastName);
	Employees findByEmployeeID(long employeeID);
	
}
