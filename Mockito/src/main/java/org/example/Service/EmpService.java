package org.example.Service;

import java.util.List;

import org.example.Repository.EmpRepository;
import org.example.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;



@Service
public class EmpService {
    @Autowired
    private EmpRepository repo;


    public void setRepo(EmpRepository repo) {
        this.repo = repo;
    }

    public Employee save(Employee e) {
        return repo.save(e);
    }

    public List<Employee> getEmp()
    {
        System.out.println(repo.findAll());
        return (List<Employee>) repo.findAll();
    }

    public Employee getbyemployee(int empid) {

        Employee employee = repo.findById(empid).get();
        System.out.println(repo.findById(empid).get());


        return employee;
    }

    public Employee findByName(String name) {
        return repo.findByName(name);
    }

    public String delete(int empid) {
        repo.deleteById(empid);
        return "Employee removed " + empid;
    }

    public Employee updateEmp(Employee e) {
        Employee emp = repo.findById(e.getEmpid()).orElse(null);
        emp.setName(e.getName());
        emp.setDepartment(e.getDepartment());
        //emp.setAddress(e.getAddress());
        return repo.save(emp);

    }
}
