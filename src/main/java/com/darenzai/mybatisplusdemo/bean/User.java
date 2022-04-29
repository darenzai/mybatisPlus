package com.darenzai.mybatisplusdemo.bean;

import com.baomidou.mybatisplus.annotation.*;
import com.darenzai.mybatisplusdemo.enums.StatusEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * table
 * 描述:用来将实体对象与数据库表名完成映射
 * 修饰范围:用在类上
 * 常见属性:
 * value:String类型,指定映射的表名
 * resultMap:String类型,用来指定XML配置中resultMap的id值
 */
@TableName(value = "user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @TableId(type = IdType.AUTO)
    private Integer id;
    @TableField(value = "name",select = false)
    private String name;

    private Integer age;

    @TableField(exist = false)
    private String gender;
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;
    @Version
    private Integer version;
//    @TableField(value = "status")
//    private StatusEnum statusEnum;
    @TableLogic
    private Integer deleted;

}
