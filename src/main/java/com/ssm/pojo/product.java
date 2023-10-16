package com.ssm.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @AUTHER XXY
 * @DATE 2023/5/18
 **/
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class product {
    private int id;
    private String name;
    private String type;
    private String madeAddress;
    private String price;
}
