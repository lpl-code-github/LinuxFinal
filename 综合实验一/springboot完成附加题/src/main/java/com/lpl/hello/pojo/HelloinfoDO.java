package com.lpl.hello.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * helloinfo
 * @author 
 */
@Data
public class HelloinfoDO implements Serializable {
    private Integer id;

    private String content;

    private String ip;

    private static final long serialVersionUID = 1L;
}