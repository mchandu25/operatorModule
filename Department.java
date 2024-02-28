package com.company.onlinecustomerservicecenter.department;

import com.company.onlinecustomerservicecenter.Operator;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
@Entity
public class Department {
    @Id
    @GeneratedValue
    private Integer deptId;
    private String deptName;

    @OneToMany//(mappedBy = "operator", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Operator> operators=new ArrayList<>();


    public Department(Integer deptId,String deptName, List<Operator> operators) {
        this.deptId=deptId;
        this.deptName = deptName;
        this.operators = operators;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public List<Operator> getOperators() {
        return operators;
    }

    public void setOperators(List<Operator> operators) {
        this.operators = operators;
    }

    public Department() {
    }
//    public void addOperator(Operator operator)
//    {
//        if(operators==null)
//            operators=new ArrayList<>();
//        operators.add(operator);
//    }

}
