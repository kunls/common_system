package com.lxk.common_system.entity;

import lombok.Data;

@Data
public class PhoneSale {
    private Long id;
    private String phoneName;
    private Integer todayBuy;
    private Integer monthBuy;
    private Integer totalBuy;
}
