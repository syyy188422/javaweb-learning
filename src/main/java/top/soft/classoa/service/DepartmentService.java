package top.soft.classoa.service;

import top.soft.classoa.entity.Department;
import top.soft.classoa.mapper.DepartmentMapper;
import top.soft.classoa.utils.MyBatisUtils;

/**
 * @author 86189
 * @description: TODO
 * @date 2024/12/7 13:56
 */
public class DepartmentService {
    public Department selectById(Long departmentId){
        return (Department) MyBatisUtils.executeQuery(sqlSession ->
                sqlSession.getMapper(DepartmentMapper.class).selectById(departmentId));
    }
}
