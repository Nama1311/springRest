package com.springrest.springrest.controller;


import com.springrest.springrest.entities.Employee;
import com.springrest.springrest.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import javax.websocket.server.PathParam;
import java.util.List;


@RestController
public class MyController<employee> {

    @GetMapping("/home")
    public String home() {
         return "this is Home page";

    }

    @Autowired
    private EmployeeService employeeService;


    @GetMapping("/getAllEmployee")
    public List<Employee> getAllEmployee() {

        return this.employeeService.getEmployee();

    }

    @GetMapping("/getEmployee/{Employeeid}")
    public Employee getEmployee(@PathVariable String Employeeid) {

        int id = Integer.parseInt(Employeeid);
        return this.employeeService.getEmployee(id);


    }

    @PostMapping("/addEmployee")
    public Employee addEmployee(@RequestBody Employee employee) {

        return this.employeeService.addEmployee(employee);

    }

    @PutMapping("/updateEmployee")
    public Employee updateEmployee(@RequestBody Employee employee){

        return this.employeeService.updateEmployee(employee);
    }


    @DeleteMapping("/deleteEmployee/{deleteId}")
    public void deleteEmployee(@PathVariable String deleteId){
        this.employeeService.deleteEmployee(Integer.parseInt(deleteId));

    }

}
