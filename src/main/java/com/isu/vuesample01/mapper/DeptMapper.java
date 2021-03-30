package com.isu.vuesample01.mapper;

import com.isu.vuesample01.model.DeptVO;
import com.isu.vuesample01.model.UserVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DeptMapper {

    @Select("SELECT * FROM dept WHERE deptCode = #{deptCode}")
    public DeptVO selectDeptInfo(String deptCode);

}
