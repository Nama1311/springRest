package com.springrest.springrest.services;

import com.springrest.springrest.dao.EmployeeDao;
import com.springrest.springrest.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/*
@Service
public class EmployeeServiceImpl implements EmployeeService{

     List<Employee> list;


    public EmployeeServiceImpl() {
        list = new ArrayList<>();
        list.add(new Employee(154,"IT","Software Engineer"));
        list.add(new Employee(215,"IT","Product Manager"));
        list.add(new Employee(133,"sales","Sales Manager"));
        list.add(new Employee(378,"Network","System Admin"));
        list.add(new Employee(467,"IT","Junior Engineer"));

    }

    @Override
    public List<Employee> getEmployee() {
        return list;
    }

    @Override
    public Employee getEmployee(int id) {


        for(int i=0;i<list.size();i++){
            if(list.get(i).getId()== id)
                return list.get(i);
        }

        return null;
    }

    @Override
    public Employee addEmployee(Employee employee) {
         list.add(employee);
          return employee;
    }

    @Override
    public Employee updateEmployee(Employee employee) {



    */
/*         if(list.get(i).getId()==employee.getId()){
                  list.get(i).setDepartment(employee.getDepartment());
                  list.get(i).setTitle(employee.getTitle());
                  index=list.size();
                  break;*//*


               list.forEach(e->{
                   if(e.getId()==employee.getId()){
                          e.setTitle(employee.getTitle());
                          e.setDepartment(employee.getDepartment());
                   }
               });
        return employee;
    }


    @Override
    public void deleteEmployee(int id) {

        Iterator<Employee> itr = list.iterator();
        while (itr.hasNext()){
            Employee emp = itr.next();
            if(emp.getId()==id){
                    itr.remove();
            }
        }


    }


}
*/

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
     private EmployeeDao employeeDao;

    @Override
    public List<Employee> getEmployee() {
        return employeeDao.findAll();
    }

    @Override
    public Employee getEmployee(int id) {
        return (Employee) employeeDao.getById(id);
    }

    @Override
    public Employee addEmployee(Employee employee) {
        employeeDao.save(employee);
         return employee;
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        employeeDao.save(employee);
        return employee;
    }

    @Override
    public void deleteEmployee(int id) {
           Employee emp = (Employee) employeeDao.getById(id);
           employeeDao.delete(emp);


    }
}