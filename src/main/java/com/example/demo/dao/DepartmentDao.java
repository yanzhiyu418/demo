package com.example.demo.dao;

import com.example.demo.pojo.Department;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
//部门Dao
public class DepartmentDao {
    private static Map<Integer, Department> department= null;
   static {
       department = new HashMap<Integer, Department>();//创建一个部门表
       department.put(101,new Department(101,"教学部"));
       department.put(102,new Department(102,"生产部"));
       department.put(103,new Department(103,"工作部"));
       department.put(104,new Department(104,"学习部"));
   }

   //获得所有部门信息
    public Collection<Department> getDepartment(){
       return  department.values();
    }
    //通过id得到部门
    public  Department getDepartmentById(Integer id){
       return department.get(id);
    }
}
