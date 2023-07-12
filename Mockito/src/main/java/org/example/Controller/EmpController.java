package org.example.Controller;


import org.example.Repository.EmpRepository;
import org.example.Service.EmpService;
import org.example.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpController {
    @Autowired
    private EmpService service;

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee e) {

        return service.save(e);
    }
    @GetMapping("/list")
    public List<Employee> findAllEmployees() {
        return service.getEmp();
    }
    @GetMapping("/id/{empid}")
    public Employee Getbyid(@PathVariable int empid) {
        return service.getbyemployee(empid);
    }


    @GetMapping("/empbyname/{name}")
    public Employee findByName(String name) {
        return service.findByName(name);
    }

    @PutMapping("/edit")
    public Employee updateEmployee(@RequestBody Employee e) {
        return service.updateEmp(e);
    }

    @DeleteMapping("/delete/{empid}")
    public String deleteemp(@PathVariable int empid) {
        return service.delete(empid);
    }

}

