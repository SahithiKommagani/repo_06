package org.example.Repository;


import org.example.model.Employee;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface EmpRepository extends CrudRepository<Employee,Integer> {
    Employee findByName(String name);

}
