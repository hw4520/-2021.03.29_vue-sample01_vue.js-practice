package com.isu.vuesample01.service;

import com.isu.vuesample01.mapper.UserMapper;
import com.isu.vuesample01.model.UserVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserMapper userMapper;

    public List<UserVO> selectUserList() {
        return userMapper.selectUserList();
    }
}
