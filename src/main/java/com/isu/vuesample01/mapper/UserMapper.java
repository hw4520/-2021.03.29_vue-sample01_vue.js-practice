package com.isu.vuesample01.mapper;

import com.isu.vuesample01.model.UserVO;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM user")
    @Results({
            @Result(property = "deptCode", column = "deptCode"),
            @Result(property = "deptInfo", column = "deptCode", many = @Many(select = "com.isu.vuesample01.mapper.DeptMapper.selectDeptInfo"))
    })
    public List<UserVO> selectUserList();

}
