package com.lpl.test2.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@TableName("t_student")
public class Student {
    @TableField("id")
    private Integer id;

    @TableField("name")
    private String name;

}
