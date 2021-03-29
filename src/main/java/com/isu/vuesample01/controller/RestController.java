package com.isu.vuesample01.controller;

import com.isu.vuesample01.model.UserVO;
import com.isu.vuesample01.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RequiredArgsConstructor
@org.springframework.web.bind.annotation.RestController
public class RestController {

    private final UserService userService;

    @GetMapping("/user/list")
    public ModelMap userList(){
        ModelMap model = new ModelMap();

        List<UserVO> userList = userService.selectUserList();

        model.addAttribute("success", "success");
        model.addAttribute("result", userList);

        return model;
    }
}
