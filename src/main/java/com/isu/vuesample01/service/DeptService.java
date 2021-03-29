package com.isu.vuesample01.service;

import com.isu.vuesample01.mapper.DeptMapper;
import com.isu.vuesample01.mapper.UserMapper;
import com.isu.vuesample01.model.DeptVO;
import com.isu.vuesample01.model.UserVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DeptService {

    private final DeptMapper deptMapper;

    public List<DeptVO> selectDeptList() {
        return deptMapper.selectDeptList();
    }
}
