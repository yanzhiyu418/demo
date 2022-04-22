package com.example.demo.dao;

import com.example.demo.pojo.Department;
import com.example.demo.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//员工dao
public class EmployeeDao {
    //模拟数据库数据
    private static Map<Integer, Employee>employees=null;
    //员工所属部门
    @Autowired
    private DepartmentDao departmentDao;
    static {
        employees=new HashMap<Integer, Employee>();//创建一个员工表
        employees.put(101,new Employee(101,"张三","1213@qq.com",1,new Department(101,"后勤部")));
        employees.put(102,new Employee(102,"李四","12122223@qq.com",1,new Department(101,"后勤部")));
        employees.put(103,new Employee(103,"李四","12122223@qq.com",1,new Department(101,"后勤部")));
        employees.put(104,new Employee(104,"李四","12122223@qq.com",1,new Department(101,"后勤部")));
        employees.put(105,new Employee(105,"李四","12122223@qq.com",1,new Department(101,"后勤部")));
        employees.put(106,new Employee(106,"李四","12122223@qq.com",1,new Department(101,"后勤部")));


    }
    //自增主键
    private static Integer initId=1007;
    //增加一个员工
    public void  save(Employee employee){
        if (employee.getId()== null){
            employee.setId(initId++);
        }
        employee.setDepartment(departmentDao.getDepartmentById(employee.getDepartment().getId()));
        employees.put(employee.getId(),employee);

    }
    //查询全部员工
    public Collection<Employee> getAll(){
        return employees.values();
    }
    public Employee getEmployeeById(Integer id){
        return employees.get(id);
    }
    public void  delete(Integer id){
        employees.remove(id);
    }

}
