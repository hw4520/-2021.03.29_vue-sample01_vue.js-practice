package com.isu.vuesample01.controller;

import com.isu.vuesample01.model.DeptVO;
import com.isu.vuesample01.model.UserVO;
import com.isu.vuesample01.service.DeptService;
import com.isu.vuesample01.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RequiredArgsConstructor
@org.springframework.web.bind.annotation.RestController
public class RestController {

    private final UserService userService;

    private final DeptService deptService;

    @GetMapping("/user/list")
    public ModelMap userList(){
        ModelMap model = new ModelMap();

        List<UserVO> userList = userService.selectUserList();

        model.addAttribute("success", "success");
        model.addAttribute("result", userList);

        return model;
    }

    @GetMapping("/dept/list")
    public ModelMap deptList(){
        ModelMap model = new ModelMap();

        List<DeptVO> deptList = deptService.selectDeptList();

        model.addAttribute("success", "success");
        model.addAttribute("result", deptList);

        return model;
    }
}
