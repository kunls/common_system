package com.lxk.common_system.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;

@Data
public class UserInfo {
    private Long id;
    private String name;
    private Integer age;
    private String sex;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private LocalDate birth;
    private String address;
}
