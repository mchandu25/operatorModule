package com.company.onlinecustomerservicecenter.department;

import com.company.onlinecustomerservicecenter.Operator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService{
    @Autowired
    private DepartmentRepo departmentRepo;
    @Override
    public Department addDepartment(Department department) {
        return this.departmentRepo.save(department);
    }

    @Override
    public List<Operator> allEmployessInsameaDepartment(Integer id) {
        Optional<Department>departmentOpt=this.departmentRepo.findById(id);
        Department department=departmentOpt.get();
        return null;

    }
}
