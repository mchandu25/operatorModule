package com.company.onlinecustomerservicecenter.department;

import com.company.onlinecustomerservicecenter.Operator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @PostMapping("add/dept")
    public Department addDepartment(@RequestBody Department department)
    {
        return this.departmentService.addDepartment(department);
    }
    @GetMapping("getEmployee/{id}")
    public List<Operator> getOperator(@PathVariable("id")Integer id)
    {
        return this.departmentService.allEmployessInsameaDepartment(id);
    }
}
