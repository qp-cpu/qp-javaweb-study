package com.atguigu.mapper;

import com.atguigu.bean.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface EmployeeMapper {

    @Select("SELECT * FROM  employee WHERE id = #{id}")
    public Employee getEmployee(Integer id);

    @Update("UPDATE employee SET lastNamae=#{lastName},email=#{email},gender=#{gender},d_id=#{did}")
    public void updateEmp(Employee employee);

}
