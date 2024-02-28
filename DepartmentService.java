package com.company.onlinecustomerservicecenter.department;

import com.company.onlinecustomerservicecenter.Operator;

import java.util.List;

public interface DepartmentService  {
    Department addDepartment(Department department);

    List<Operator> allEmployessInsameaDepartment(Integer id);
}
