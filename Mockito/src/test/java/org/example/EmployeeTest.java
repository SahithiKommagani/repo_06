package org.example;

import org.example.Repository.EmpRepository;
import org.example.Service.EmpService;
import org.example.model.Employee;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.MockBeans;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

/*@ExtendWith(MockitoExtension.class)
@RunWith(SpringRunner.class)
public class EmployeeTest {
    @MockBean

  private EmpRepository repo;
@InjectMocks
  private EmpService service;



    @Test
    public void getUsersTest()
    {
        List<Employee> e=new ArrayList<>();
        Employee e1=new Employee(1,"Sahithi","HR");
        Employee e2=new Employee(2,"sindhu","Business");
      e.add(e1);
      e.add(e2);

        when(repo.findAll()).thenReturn(e);
        assertEquals(2, service.getEmp().size());
       // Assertions.assertEquals(2,result.size());
       // when(repository.findAll()).thenReturn(Stream.of(new Employee(1,"Sahithi","developer"),new Employee(2,"Sindhu","associate")).collect(Collectors.toList()));

    }
    @Test
    public void findById()
    {
        EmpRepository repo = Mockito.mock(EmpRepository.class);
        service.setRepo(repo);
        Employee e1 = new Employee(1, "Sahithi", "HR");
        when(repo.findById(1)).thenReturn(Optional.of(e1));
        assertEquals(1,service.getbyemployee(1).getEmpid());
    }

}*/
import org.mockito.InjectMocks;
@ExtendWith(MockitoExtension.class)
@RunWith(SpringRunner.class)
public class EmployeeTest {
    @InjectMocks
    private EmpService service;
    @Test
    public void getUsersTest() {
        EmpRepository repo = Mockito.mock(EmpRepository.class);
        service.setRepo(repo);
        List<Employee> e = new ArrayList<>();
        Employee e1 = new Employee(1, "Sahithi", "HR");
        Employee e2 = new Employee(2, "sindhu", "Business");
        e.add(e1);
        e.add(e2);
        when(repo.findAll()).thenReturn(e);
        assertEquals(2, service.getEmp().size());

    }

    @Test
    public void findById() {
        EmpRepository repo = Mockito.mock(EmpRepository.class);
        service.setRepo(repo);
        Employee e1 = new Employee(1, "Sahithi", "HR");
        when(repo.findById(1)).thenReturn(Optional.of(e1));
        assertEquals(1, service.getbyemployee(1).getEmpid());
    }
}
