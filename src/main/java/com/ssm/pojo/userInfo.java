package com.ssm.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @AUTHER XXY
 * @DATE 2023/5/6
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class userInfo {
    private int id;
    private String name;
    private String pwd;
}
