package com.isu.vuesample01.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class UserVO {
    private Integer no;
    private String email;
    private String passwd;
    private String name;
    private String deptCode;
    private String zipCode;
    private String address;
    private String mobile;
    private Date createDate;
    private Date updateDate;
    private DeptVO deptInfo;
}
